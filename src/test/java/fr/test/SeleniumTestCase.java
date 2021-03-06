package fr.test;

import javax.inject.Inject;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocationContext;

@RunWith(Arquillian.class)
public class SeleniumTestCase {

	@Drone
	WebDriver driver;

	@Inject
	LocationContext context;

	@Test
	public void testNavigationSimple(@InitialPage final PageAccueil pageAccueilInitial) {
		PageAccueil pageAccueil = pageAccueilInitial;
		Assert.assertTrue(pageAccueil.estChargee());
		PagePlanDeSite pagePlanDeSite = pageAccueil.naviguerPagePlanDeSite();
		Assert.assertTrue(pagePlanDeSite.estChargee());
		pageAccueil = pagePlanDeSite.naviguerPageAccueil();
		Assert.assertTrue(pageAccueil.estChargee());
		PageMentionsLegales pageMentionsLegales = pageAccueil.naviguerPageMentionsLegales();
		Assert.assertTrue(pageMentionsLegales.estChargee());
	}

	@Test
	public void testFermetureBandeauCookiePageAccueil(@InitialPage final PageAccueil pageAccueilInitial) {
		PageAccueil pageAccueil = pageAccueilInitial;
		Assert.assertTrue(pageAccueil.estChargee());
		Assert.assertTrue(pageAccueil.isBandeauCookieVisible());
		pageAccueil.masqueBandeauCookie();
		Assert.assertFalse(pageAccueil.isBandeauCookieVisible());
		Assert.assertTrue(pageAccueil.estChargee());
		PagePlanDeSite pagePlanDeSite = pageAccueil.naviguerPagePlanDeSite();
		Assert.assertTrue(pagePlanDeSite.estChargee());
		Assert.assertFalse(pagePlanDeSite.isBandeauCookieVisible());
	}
}