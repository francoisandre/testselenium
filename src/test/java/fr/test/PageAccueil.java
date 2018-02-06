package fr.test;

import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.page.Location;
import org.jboss.arquillian.graphene.page.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("/accueil?numenAgent=09E9235268KXX")
public class PageAccueil {

	@Page
	private PagePlanDeSite pagePlanDeSite;

	@Page
	private PageMentionsLegales pageMentionsLegales;

	@FindBy(xpath = "//a[text()='Plan du site']")
	private WebElement lienPlanDuSite;

	@FindBy(css = "a[href='/mapi-pac-portail-agent/ihmr/mentionsLegales']")
	private WebElement lienMentionsLegales;

	@FindBy(css = "#footer")
	private WebElement piedDePage;

	@FindBy(css = "div[id=~'ookie']")
	private WebElement bandeauCookie;

	public PagePlanDeSite naviguerPagePlanDeSite() {
		Graphene.guardHttp(lienPlanDuSite).click();
		pagePlanDeSite.setPageAccueil(this);
		return pagePlanDeSite;
	}

	public boolean estChargee() {
		return (piedDePage != null);
	}

	public boolean bandeauCookie

	public PageMentionsLegales naviguerPageMentionsLegales() {
		Graphene.guardHttp(lienMentionsLegales).click();
		pageMentionsLegales.setPageAccueil(this);
		return pageMentionsLegales;
	}

}
