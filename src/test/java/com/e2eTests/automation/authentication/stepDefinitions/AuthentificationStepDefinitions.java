package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinitions {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	public AuthentificationStepDefinitions () {
		driver = Setup.driver;
		PageFactory.initElements(driver,AuthenticationPage.class);
	}

	@Given("^Je me connecte sur lapplication OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		driver.get("https://demoqa.com/menu/"); 	
	}

	@When("^Je saisie le UserName \"([^\"]*)\"$")
	public void jeSaisieLeUserName(String name) throws Throwable {
		authenticationPage.fillUserName(name);
		
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String password) throws Throwable {
		authenticationPage.fillPassword(password);
	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authenticationPage.clicBtnLogin();
	}
	@Then("^Je me redirige vers la page Home$")
	public void jeMeredirigeVersLaPageHome() throws Throwable {
	   
	}





}
