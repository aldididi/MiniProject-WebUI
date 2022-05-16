package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.RegisPage;
import pages.LoginPage;
import pages.HomePage;

public class RegistSteps {
    @Steps
    RegisPage regisPage;
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;


    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        regisPage.openUrl();
        regisPage.validateOnRegistPage();
        regisPage.validateOnRegistPage2();
    }

    @When("I input valid nama lengkap")
    public void iInputValidNamaLengkap() {
        regisPage.inputNamaLengkapRegist("aldidi ganteng");
    }

    @And("I inpput valid email")
    public void iInpputValidEmail() {
        regisPage.inputEmailRegist("mangkesbor@mail.com");
    }

    @And("I input valid regis password")
    public void iInputValidRegisPassword() {
        regisPage.inputPassword("12121212");
    }

    @And("click register button")
    public void clickRegisterButton() {
        regisPage.clickRegisButton();
    }

    @Then("I directed to login page")
    public void iDirectedToLoginPage() {
        loginPage.headerloginAppear();
        //loginPage.headerLoginTextEquals(arg0);
    }

//    @And("I input valid email regis")
//    public void iInputValidEmailRegis() {
//        loginPage.inputUsername();
//    }
//
//    @And("I input valid pw regis")
//    public void iInputValidPwRegis() {
//    }
}
