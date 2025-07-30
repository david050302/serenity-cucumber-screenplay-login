package com.baldeon.software.StepDefinitions;

import com.baldeon.software.UI.LoginPage;
import com.baldeon.software.questions.TheDashboard;
import com.baldeon.software.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor user;

    @Before
    public void setup() {
        user = Actor.named("User Serenity");
        user.can(BrowseTheWeb.with(browser));
    }

    @Given("a user opens the login page")
    public void aUserOpensTheLoginPage() {
        user.attemptsTo(
                Open.browserOn().the(LoginPage.class) // Asumiendo que LoginPage tiene una URL predeterminada o la defines
        );
    }

    @When("they enter the username {string} and the password {string}")
    public void theyEnterTheUsernameAndThePassword(String username, String password) { // parametros añadidos
       user.attemptsTo(
               Login.CLogin(username, password)
       );

    }

    @Then("they should see the dashboard")
    public void theyShouldSeeTheDashboard() {
        // Aquí es donde el Actor verifica que el dashboard es visible o que el título es correcto.
        // Usamos la Question 'title()' de TheDashboard para obtener el texto del título
        // y lo comparamos con el valor esperado "Dashboard" (o el título real de tu dashboard).
        user.should(seeThat(TheDashboard.title(), equalTo("Tablero"))); // Asegúrate de que "Dashboard" sea el título real de la página después del login

        // Si quisieras verificar la visibilidad de un mensaje de bienvenida (si lo descomentas en TheDashboard.java):
        // user.should(seeThat(TheDashboard.isWelcomeMessageVisible(), is(true)));
    }
}
