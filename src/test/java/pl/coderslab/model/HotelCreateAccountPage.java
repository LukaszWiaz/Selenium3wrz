package pl.coderslab.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelCreateAnAccountPage {

    private WebDriver driver;

    private By customerNameSelector = By.id("customer_firstname");
    private By customerLastNameSelector = By.id("customer_lastname");
    private By customerPasswordSelector = By.id("passwd");
    private By submitAccountButtonSelector = By.id("submitAccount");

    public HotelCreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFormAndSubmit(String name, String lastName, String password) {
        WebElement customerFirstNameInput = this.driver.findElement(customerNameSelector);
        WebElement customerLastNameInput = this.driver.findElement(customerLastNameSelector);
        WebElement customerPassword = this.driver.findElement(customerPasswordSelector);

        customerFirstNameInput.clear();
        customerFirstNameInput.sendKeys(name);
        customerLastNameInput.clear();
        customerLastNameInput.sendKeys(lastName);

        customerPassword.clear();
        customerPassword.sendKeys(password);

        WebElement submitButton = this.driver.findElement(submitAccountButtonSelector);
        submitButton.click();
    }
}