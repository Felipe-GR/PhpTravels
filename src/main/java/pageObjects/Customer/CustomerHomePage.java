package pageObjects.Customer;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class CustomerHomePage {

    ConfigFileReader objConfigFileReader = new ConfigFileReader();
    WebDriver driver;

    public CustomerHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "name")
    WebElement categoryName;

    @FindBy(name = "translated[tr][name]")
    WebElement turkishName;

    @FindBy(name = "translated[ar][name]")
    WebElement arabicName;

    @FindBy(name = "translated[de][name]")
    WebElement germanName;

    @FindBy(name = "translated[vi][name]")
    WebElement vietnameseName;

    @FindBy(name = "translated[es][name]")
    WebElement spanishName;

    @FindBy(name = "translated[ru][name]")
    WebElement russianName;

    @FindBy(name = "translated[fa][name]")
    WebElement farsiName;

    @FindBy(name = "translated[fr][name]")
    WebElement frenchName;

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[14]/a")
    private WebElement blogElement;

    @FindBy(xpath = "//*[@id=\"Blog\"]/li[2]/a")
    private WebElement blogCategories;

    @FindBy(xpath = "//*[@id=\"Blog\"]/li[1]/a")
    private WebElement blogPost;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button")
    private WebElement categoriesAdd;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement blogPostAdd;

    @FindBy(xpath = "//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]")
    private WebElement addButton;

    public void createBlog() {
        blogElement.click();
        blogCategories.click();
        // Add 5 seconds delay
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        categoriesAdd.click();
    }

    public void fillForm() {
        categoryName.sendKeys(objConfigFileReader.getCategoryName());
        turkishName.sendKeys(objConfigFileReader.getTurkishName());
        arabicName.sendKeys(objConfigFileReader.getArabicName());
        germanName.sendKeys(objConfigFileReader.getGermanName());
        vietnameseName.sendKeys(objConfigFileReader.getVietnameseName());
        spanishName.sendKeys(objConfigFileReader.getSpanishName());
        russianName.sendKeys(objConfigFileReader.getRussianName());
        farsiName.sendKeys(objConfigFileReader.getFarsiName());
        frenchName.sendKeys(objConfigFileReader.getFrenchName());

        addButton.click();
    }

    public void addBlog() {
        blogElement.click();
        blogPost.click();

        // Add 5 seconds delay
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        blogPostAdd.click();

        // Add 5 seconds delay
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Select selectCategory = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select")));
        selectCategory.selectByVisibleText(objConfigFileReader.getCategoryName());
    }

}
