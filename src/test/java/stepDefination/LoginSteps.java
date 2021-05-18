package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Customer.CustomerHomePage;
import pageObjects.Customer.CustomerLoginPage;

public class LoginSteps {

    TestContext testContext;
    CustomerLoginPage objCustomerLoginPage;
    CustomerHomePage objCustomerHomePage;

    public LoginSteps(TestContext context) {
        testContext = context;
        objCustomerLoginPage = testContext.getPageObjectManager().getCustomerLoginPage();
    }

    @Given("^Customer is on login page$")
    public void customerIsOnLandingPage() throws Throwable {
        objCustomerLoginPage.navigateToHomePage();
    }

    @When("^Customer logged in with valid credentials$")
    public void customerLoggedInWithValidCredentials() throws Throwable {
        objCustomerHomePage = objCustomerLoginPage.Login();
    }

    @Then("^Customer create category$")
    public void customerCreateConfigBlog() throws Throwable {
        objCustomerHomePage.createBlog();
        objCustomerHomePage.fillForm();
    }

    @Then("^Customer create a blog$")
    public void customerCreateBlog() throws Throwable {
        objCustomerHomePage.addBlog();
    }

}
