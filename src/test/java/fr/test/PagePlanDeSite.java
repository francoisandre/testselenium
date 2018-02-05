package fr.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePlanDeSite {

	@Drone
	private WebDriver browser;

	@FindBy(xpath = "//a[text()='Plan du site']")
	private WebElement lienPlanDuSite;

	public PagePlanDeSite naviguerPagePlanDeSite() {

	}

}
