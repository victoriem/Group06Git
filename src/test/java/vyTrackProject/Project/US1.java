package vyTrackProject.Project;

import vyTrackProject.Project.TestBase;
import vyTrackProject.utilities.BrowserUtils;

import vyTrackProject.utilities.Driver;
import vyTrackProject.utilities.VytrackUtils;
import vyTrackProject.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class US1 {
    @Test
    public void verifiyng_modules_as_driver() {
        VytrackUtils.loginAsDriver();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//i[@class='fa-asterisk menu-icon']/.."));
        wait.until(ExpectedConditions.elementToBeClickable(fleet));
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[text()='Vehicles']"));
        Actions action = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.elementToBeClickable(fleet));
        try {
            action.moveToElement(fleet).perform();
            vehicles.click();
        } catch (ElementClickInterceptedException e) {
            BrowserUtils.sleep(3);
            fleet.click();
            vehicles.click();
        }

        WebElement  reset= Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']/.."));
        wait.until(ExpectedConditions.elementToBeClickable(reset));
        WebElement  Reset= Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']/.."));
        Actions action4 = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.elementToBeClickable(reset));
        try {
            action.moveToElement(reset).perform();
            Reset.click();
        } catch (ElementClickInterceptedException e) {
            BrowserUtils.sleep(3);
            reset.click();
            Reset.click();
        }

       WebElement  tvk4207= Driver.getDriver().findElement(By.xpath("//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate']/.."));
        wait.until(ExpectedConditions.elementToBeClickable(tvk4207));
        WebElement car = Driver.getDriver().findElement(By.xpath("//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate']/.."));
        Actions action1 = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.elementToBeClickable(tvk4207));
        try {
            action.moveToElement(tvk4207).perform();
            car.click();
        } catch (ElementClickInterceptedException e) {
            BrowserUtils.sleep(3);
            tvk4207.click();
            car.click();
        }


        WebElement  addEvent= Driver.getDriver().findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']/.."));
        wait.until(ExpectedConditions.elementToBeClickable(addEvent));
        WebElement event = Driver.getDriver().findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']/.."));
        Actions action2 = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.elementToBeClickable(addEvent));
        try {
            action.moveToElement(addEvent).perform();
            event.click();
        } catch (ElementClickInterceptedException e) {
            BrowserUtils.sleep(3);
            addEvent.click();
            event.click();
        }



        ///Driver.closeDriver();
    }
}
