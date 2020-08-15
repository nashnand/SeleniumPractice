package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/* Use Actions Class,store the elements in list*/

import java.util.List;

public class SelectableTestleaf {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/selectable.html");
        List<WebElement> Selectable=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
        int listsize= Selectable.size();
        System.out.println(listsize);
        Actions Keys=new Actions(driver);
        Keys.clickAndHold(Selectable.get(0)).
                clickAndHold(Selectable.get(1)).clickAndHold(Selectable.get(2)).build().perform();

    }
}
