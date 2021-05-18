package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    Properties prop = new Properties();
    FileInputStream fis = null;
    private String currentDirectory = System.getProperty("user.dir");

    {
        try {
            fis = new FileInputStream(currentDirectory + "\\src\\main\\java\\resources\\Data.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        String browser = prop.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("Browser is not specified in properties file");
    }

    public String getcustomerUrl() {
        String customerUrl = prop.getProperty("customerUrl");
        if (customerUrl != null) return customerUrl;
        else throw new RuntimeException("URL is not specified in properties file");
    }

    public String getCustomerUsername() {
        String customerUsername = prop.getProperty("customerUsername");
        if (customerUsername != null) return customerUsername;
        else throw new RuntimeException("Customer Username is not specified in properties file");
    }

    public String getCustomerPassword() {
        String customerPassword = prop.getProperty("customerPassword");
        if (customerPassword != null) return customerPassword;
        else throw new RuntimeException("Customer Password is not specified in properties file");
    }

    public String getCategoryName() {
        String categoryName = prop.getProperty("categoryName");
        if (categoryName != null) return categoryName;
        else throw new RuntimeException("Category name is not specified in properties file");
    }

    public String getTurkishName() {
        String name = prop.getProperty("turkishName");
        if (name != null) return name;
        else throw new RuntimeException("Turkish name is not specified in properties file");
    }

    public String getArabicName() {
        String name = prop.getProperty("arabicName");
        if (name != null) return name;
        else throw new RuntimeException("Arabic name is not specified in properties file");
    }

    public String getGermanName() {
        String name = prop.getProperty("germanName");
        if (name != null) return name;
        else throw new RuntimeException("German name is not specified in properties file");
    }

    public String getVietnameseName() {
        String name = prop.getProperty("vietnameseName");
        if (name != null) return name;
        else throw new RuntimeException("Vietnamese name is not specified in properties file");
    }

    public String getSpanishName() {
        String name = prop.getProperty("spanishName");
        if (name != null) return name;
        else throw new RuntimeException("Spanish name is not specified in properties file");
    }

    public String getRussianName() {
        String name = prop.getProperty("russianName");
        if (name != null) return name;
        else throw new RuntimeException("Russian name is not specified in properties file");
    }

    public String getFarsiName() {
        String name = prop.getProperty("farsiName");
        if (name != null) return name;
        else throw new RuntimeException("Farsi name is not specified in properties file");
    }

    public String getFrenchName() {
        String name = prop.getProperty("frenchName");
        if (name != null) return name;
        else throw new RuntimeException("French name is not specified in properties file");
    }

}
