package fr.test;

import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractContentPage {

	private PageAccueil pageAccueil;

	@FindBy(css = "#menuAccueil a")
	private WebElement lienAccueil;

	public PageAccueil getPageAccueil() {
		return pageAccueil;
	}

	public void setPageAccueil(final PageAccueil pageAccueil) {
		this.pageAccueil = pageAccueil;
	}

	public PageAccueil naviguerPageAccueil() {
		Graphene.guardHttp(lienAccueil).click();
		return getPageAccueil();
	}

	public abstract boolean estChargee();

}
