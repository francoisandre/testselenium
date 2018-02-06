package fr.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePlanDeSite extends AbstractContentPage {

	@Drone
	private WebDriver browser;

	@FindBy(css = "#form5 h3 a")
	private WebElement lienPromotionEtMobilite;

	public PagePlanDeSite() {

	}

	@Override
	public boolean estChargee() {
		return (lienPromotionEtMobilite != null);
	}

}
