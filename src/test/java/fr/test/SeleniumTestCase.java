package fr.test;

import javax.inject.Inject;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Before;
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
	public void testOpeningHomePage(@InitialPage final PageAccueil pageAccueilInitial) {
		PageAccueil pageAccueil = pageAccueilInitial;
		PagePlanDeSite pagePlanDeSite = pageAccueil.naviguerPagePlanDeSite();
		Assert.assertTrue(pagePlanDeSite.estChargee());

		pageAccueil = pagePlanDeSite.naviguerPageAccueil();
		Assert.assertTrue(pageAccueil.estChargee());

		PageMentionsLegales pageMentionsLegales = pageAccueil.naviguerPageMentionsLegales();
		Assert.assertTrue(pageMentionsLegales.estChargee());

	}

	@Before
	public void setUp() {
		// driver.get("http://localhost:8080/mapi-pac-portail-agent/ihmr/");
		System.out.println("");
	}

}