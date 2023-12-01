package co.com.choucair.certificacion.serenityis.stepdefinitions;

import co.com.choucair.certificacion.serenityis.userinterfaces.LoginPage;
import co.com.choucair.certificacion.serenityis.utils.KillBrowser;
import co.com.choucair.certificacion.serenityis.utils.ReadProporties;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.environment.MockEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static co.com.choucair.certificacion.serenityis.utils.EnviromentConstants.ACTOR;
import static co.com.choucair.certificacion.serenityis.utils.EnviromentConstants.ENVIRONMENT_URL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class StarSharpStepDefinitions {



    @Before
    public void initialConfiguration() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("start-minimized");
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public static <list> void CloseDriver() throws IOException, InterruptedException {
        //cerrar navegador
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        //cerrartodoslos procesos
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }

    @Given("I want enter to Bancofalabella Empresas")
    public void IwantEnterToBancofalabellaEmpresas() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                Open.browserOn().the(LoginPage.class));
    }

    @When("I log in with correct credentials")
    public void ILogIntoWithCorrectCredentials(DataTable data) {
        //System.out.println("haha");
        thras
        List<Map<String, String>> newdata = data.asMaps();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.intoPage(newdata)

        );


    }

    @Then("See my name in the home page")
    public void SeeMyNameInTheHomePage() {
        System.out.println("jeje");
    }



}

