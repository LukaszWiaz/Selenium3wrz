package pl.coderslab.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelMyAccountPage {

    private WebDriver driver;

    public HotelMyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        WebElement successAlertField = this.driver.findElement(By.className("alert-success"));
        return successAlertField.getText();
    }

    public String getPageTitle(){
        return this.driver.getTitle();
    }
}