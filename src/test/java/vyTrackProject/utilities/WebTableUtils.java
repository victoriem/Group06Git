package vyTrackProject.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WebTableUtils {
    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator ="//td[.='" + customerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }
    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){

        String locator ="//td[.='" + customerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(),expectedOrderDate);

    }
    public static List<String> getHeadersFromVehicleModelTable() {
        List<WebElement> headerElements = Driver.getDriver().findElements(By.xpath("//thead[@class='grid-header']//th//span[1]"));
        List<String> headerTitles = new ArrayList<>();
        headerElements.forEach(k -> headerTitles.add(k.getText()));
        return headerTitles;
    }
}
