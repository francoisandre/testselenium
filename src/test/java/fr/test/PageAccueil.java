package fr.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAccueil {

	@Drone
	private WebDriver browser;

	@Page
	private PagePlanDeSite pagePlanDeSite;

	@FindBy(xpath = "//a[text()='Plan du site']")
	private WebElement lienPlanDuSite;

	public PagePlanDeSite naviguerPagePlanDeSite() {
		lienPlanDuSite.click();
		return
	}

}
