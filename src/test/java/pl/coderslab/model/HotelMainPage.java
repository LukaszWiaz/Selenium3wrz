package pl.coderslab.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelMainPage {

    private WebDriver driver;

    public HotelMainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignIn(){
        WebElement signInButton = this.driver.findElement(By.className("user_login"));
        signInButton.click();
    }
}