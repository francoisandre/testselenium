package fr.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Arquillian.class)
public class BasicTestCase {

	@Drone
	WebDriver driver;

	@Page
	PageAccueil pageAccueil;

	@Test
	public void testOpeningHomePage() {
		driver.get("http://localhost:8080/mapi-pac-portail-agent/ihmr/accueil?numenAgent=06E9513960LXS");
		String pageTitle = driver.getTitle();

		WebElement findElement = driver.findElement(new ByXPath("//a[text()='Plan du site']"));
		findElement.click();
		System.out.println(findElement);
		// driver.findElement(@FindBy(xpath = "//div[contains(@class,'gallery_grid_image_caption
		// gallery_grid_image_caption_padding')]"))
		Assert.assertEquals(pageTitle, "Google");
	}
}