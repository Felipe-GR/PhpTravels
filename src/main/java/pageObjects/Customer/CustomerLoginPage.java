package pageObjects.Customer;

import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CustomerLoginPage {
    public WebDriver driver;
    ConfigFileReader objConfigFileReader = new ConfigFileReader();

    public CustomerLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[2]/form[1]/button")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/form[1]/div[2]/div")
    WebElement loginErrorMessage;

    public void navigateToHomePage(){
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.get(objConfigFileReader.getcustomerUrl());
    }

    public CustomerHomePage Login() {
        emailInput.sendKeys(objConfigFileReader.getCustomerUsername());
        passwordInput.sendKeys(objConfigFileReader.getCustomerPassword());
        loginButton.click();
        return new CustomerHomePage(driver);
    }

    public void invalidLogin() {
        Assert.assertEquals(loginErrorMessage.getText(), "Invalid Email or Password");
    }

}
