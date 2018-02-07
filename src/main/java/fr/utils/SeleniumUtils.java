package fr.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {

	private SeleniumUtils() {
	}

	public static boolean isVisible(final WebElement element) {
		if (element == null) {
			return false;
		}
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
