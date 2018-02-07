package fr.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.utils.SeleniumUtils;

public class PagePlanDeSite extends AbstractPage {

	@Drone
	private WebDriver browser;

	@FindBy(css = "#form5 h3 a")
	private WebElement lienPromotionEtMobilite;

	public PagePlanDeSite() {

	}

	@Override
	public boolean estChargee() {
		return SeleniumUtils.isVisible(lienPromotionEtMobilite);
	}

}
