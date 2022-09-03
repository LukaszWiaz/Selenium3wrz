package pl.coderslab.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelLoginPage {

    private WebDriver driver;

    public HotelLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void createAnAccountWithEmail(String email){
        WebElement registerEmailInput = this.driver.findElement(By.id("email_create"));
        registerEmailInput.clear();
        registerEmailInput.sendKeys(email);
        registerEmailInput.submit();
    }
}