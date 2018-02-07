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
public class SeleniumTestCase2 {

	@Drone
	WebDriver driver;

	@Inject
	LocationContext context;

	@Test
	public void testFermetureBandeauCookiePagePlanDeSite(@InitialPage final PageAccueil pageAccueilInitial) {
		PageAccueil pageAccueil = pageAccueilInitial;
		Assert.assertTrue(pageAccueil.estChargee());
		Assert.assertTrue(pageAccueil.isBandeauCookieVisible());
		PagePlanDeSite pagePlanDeSite = pageAccueil.naviguerPagePlanDeSite();
		Assert.assertTrue(pagePlanDeSite.estChargee());
		Assert.assertTrue(pagePlanDeSite.isBandeauCookieVisible());
		pagePlanDeSite.masqueBandeauCookie();
		Assert.assertFalse(pagePlanDeSite.isBandeauCookieVisible());
		pageAccueil = pagePlanDeSite.naviguerPageAccueil();
		Assert.assertTrue(pageAccueil.estChargee());
		Assert.assertFalse(pageAccueil.isBandeauCookieVisible());
	}
}