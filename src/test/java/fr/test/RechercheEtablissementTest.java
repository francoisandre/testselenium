package fr.test;

/**
 * Classe de tests pour la recherche d'établissements.
 */

// @RunWith(SirhenTestRunnerForMapi.class)
public class RechercheEtablissementTest /* extends ClientMapiTu */ {

	// @Test
	// @ProxyEnv(mode = ProxyMode.PlayMode, testName = "rechercheEtab")
	// public void rechercheEtab() throws Exception {
	// getDriver().get(getBaseUrl() + "ihmr/accueil?numenAgent=06E9513960LXS");
	// waitForExist("site-wrapper");
	// getDriver().findElement(By.id("site-wrapper")).click();
	// getDriver().findElement(ByLinkText.linkText("Plan du site")).click();
	// getDriver().findElement(By.id("form5:mobilite")).click();
	// getDriver().findElement(By.id("fRecherche")).click();
	// getDriver().findElement(By.id("fRecherche:clRechercherEtablissement")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:typesEtablissement:0")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:categoriesFinancieres:0")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:academieSelectionnee_label")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:academieSelectionnee_29")).click();
	// Thread.sleep(5000);
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:departementSelectionne_label")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:departementSelectionne_4")).click();
	// getDriver().findElement(By.id("formRechercheEtablissements:peCriteres:psCriteres:validerRecherche")).click();
	// Thread.sleep(5000);
	// Assert.assertTrue(
	// getDriver().findElement(By.id("formRechercheEtablissements:peResultats:psResultats:groupesEtablissements")) != null);
	// }

	// @Test
	// @ProxyEnv(mode = ProxyMode.RecordMode, testName = "saisieDossier")
	// public void saisieDossier() throws Exception {
	// getDriver().get(getBaseUrl() + "ihmr/accueil?numenAgent=08E9941850NWC");
	// getDriver().findElement(By.linkText("Plan du site")).click();
	// getDriver().findElement(By.id("form5:mobilite")).click();
	//
	// getDriver().findElement(By.id("fAccueilMobilite:peDemandeMobilitePDIR:saisirDemandeMobilite")).click();
	// getDriver()
	// .findElement(By.xpath("//div[@id='formTabs:tabViewId:peVotreDemande:psMotifDemande:motifSelectionne']/div[3]/span"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peVotreDemande:psMotifDemande:motifSelectionne_4")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peVotreDemande:psNbDemandesEffectueesDemande:nbDemandesEffectuees"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peVotreDemande:psNbDemandesEffectueesDemande:nbDemandesEffectuees"))
	// .clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peVotreDemande:psNbDemandesEffectueesDemande:nbDemandesEffectuees"))
	// .sendKeys("1");
	// getDriver()
	// .findElement(By.xpath(
	// "//table[@id='formTabs:tabViewId:peAutresDemandes:psAutresDemandes:autresDemandesDisponibles']/tbody/tr/td"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAutresDemandes:psAutresDemandes:autresDemandesDisponibles:0"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAutresDemandes:psAutresDemandes:autresDemandes:1")).click();
	// getDriver().findElement(By.id("formTabs:afficherEtape2")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peInformationsPersonnellesPanel:psNumeroTelephone:numeroTelephone"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peInformationsPersonnellesPanel:psNumeroTelephone:numeroTelephone"))
	// .clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peInformationsPersonnellesPanel:psNumeroTelephone:numeroTelephone"))
	// .sendKeys("0123456789");
	// getDriver().findElement(By.xpath("//div[@id='formTabs:tabViewId:tabMobiliteViews2']/div/div/ul/li")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peObservationsPanel:psObservationsPanel:observationParticulieres"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peObservationsPanel:psObservationsPanel:observationParticulieres"))
	// .clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peObservationsPanel:psObservationsPanel:observationParticulieres"))
	// .sendKeys("TEST OBS PARTICU");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:clauseSauvegarde:0")).click();
	// getDriver().findElement(By.xpath("//div[@id='formTabs:tabViewId:tabMobiliteViews2']/div[3]")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:anneeDeclassement")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:categorieFinanciere_label")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:categorieFinanciere_2")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:anneeDeclassement")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:anneeDeclassement")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:psClauseSauvegarde:anneeDeclassement")).sendKeys("2016");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAffectation:paAffectationMinisterielle:logementAccessibleHandicap:0"))
	// .click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:nbrPostesDirOccupes")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:nbrPostesDirOccupes")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:nbrPostesDirOccupes")).sendKeys("2");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePRLY")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePRLY")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePRLY")).sendKeys("1");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePRLP")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePRLP")).sendKeys("0");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePACG")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePACG")).sendKeys("0");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADLY")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADLY")).sendKeys("0");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADLP")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADLP")).sendKeys("0");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADCG")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteADCG")).sendKeys("0");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteDirection")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteDirection")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:ancienneteDirection")).sendKeys("1");
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePoste")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePoste")).clear();
	// getDriver().findElement(By.id("formTabs:tabViewId:peAnciennetes:paAnciennete:anciennetePoste")).sendKeys("1");
	// getDriver().findElement(By.id("formTabs:afficherEtape3")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:pePieceJointeCV:ajouterCV")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:uploadFileCV:uploadDocumentCV_input")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:uploadFileCV:validerCV")).click();
	// getDriver().findElement(By.id("formTabs:afficherEtape3")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:pePieceJointeExtraitCV:ajouterExtraitCV")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:uploadFileEXTRAIT_CV:uploadDocumentEXTRAIT_CV_input")).click();
	// getDriver().findElement(By.id("formTabs:tabViewId:uploadFileEXTRAIT_CV:validerEXTRAIT_CV")).click();
	// getDriver().findElement(By.id("formTabs:afficherEtape3")).click();
	// getDriver().findElement(By.id("myFormDemandeMobiliteEtape3:tabViewId:peVoeuxChefEtb:ajouterVoeuChefEtablissement"))
	// .click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_1")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_2")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:definirVotreVoeu")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeuAcademie:peVoeuAcademie:psVoeuAcademie:idAcademie_label")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeuAcademie:peVoeuAcademie:psVoeuAcademie:idAcademie_5")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeuAcademie:selectionnerCeVoeu")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psCategories:idCategoriesFinancieres:2")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psLogement:idLogementSouhaite:0")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:ajouterLeVoeu")).click();
	// getDriver()
	// .findElement(By.id("myFormDemandeMobiliteEtape3:tabViewId:peVoeuxChefEtbAdj:ajouterVoeuChefEtablissementAdjoint"))
	// .click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_3")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_1")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psCategories:idCategoriesFinancieres:1")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psCategories:idCategoriesFinancieres:2")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psLogement:idLogementSouhaite:1")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:ajouterLeVoeu")).click();
	// getDriver().findElement(By.id("myFormDemandeMobiliteEtape3:tabViewId:peVoeuxChefEtb:ajouterVoeuChefEtablissement"))
	// .click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psEmploi:idEmploi_1")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_label")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:idTypeDeVoeu_5")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psTypeVoeu:definirVotreVoeu")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idAcademie_label")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idAcademie_3")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idDepartement_label")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idDepartement_3")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idCommune_label")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:peVoeuCommune:psVoeuCommune:idCommune_6")).click();
	// getDriver().findElement(By.id("myFormRechercherUnVoeu:selectionnerCeVoeu")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psCategories:idCategoriesFinancieres:0")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:peSaisirVoeu:psLogement:idLogementSouhaite:0")).click();
	// getDriver().findElement(By.id("myFormSaisirUnVoeu:ajouterLeVoeu")).click();
	// getDriver().findElement(By.id("myFormDemandeMobiliteEtape3:afficherEtape4")).click();
	// getDriver()
	// .findElement(By.xpath("//div[@id='formTabs:tabViewMobiliteId:tabMobiliteViews4']/div/div/ul/li/div/div[2]/label"))
	// .click();
	// getDriver().findElement(By.id("formTabs:validerEtTransmettre")).click();
	// }
	//
	// @Override
	// public WebDriver injectWebDriver() {
	// return new FirefoxDriver();
	// }

}
