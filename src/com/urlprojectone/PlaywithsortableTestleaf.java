package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
/*Use Actions Class and List Webelement*/

public class PlaywithsortableTestleaf {

public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://leafground.com/pages/sortable.html");
    List<WebElement> ListSelect= driver.findElements(By.xpath("//ul[@id='sortable']/li"));
    int ListSize= ListSelect.size();
    System.out.println("LIst Size"+ListSize);
    Actions Keys=new Actions(driver);
    Thread.sleep(1000);
    Keys.clickAndHold(ListSelect.get(3)).moveToElement(ListSelect.get(1)).release(ListSelect.get(1)).build().perform();
    Keys.dragAndDrop(ListSelect.get(6),ListSelect.get(0)).build().perform();


    }

}
