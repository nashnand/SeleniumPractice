package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Tag title attribute will be tool tip values*/

public class AutocompleteTestleaf {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/autoComplete.html");
        WebElement Tootip= driver.findElement(By.xpath("//input[@id='tags']"));
        Actions Keys=new Actions(driver);
        Tootip.sendKeys("Sel");
        Thread.sleep(2000);
        WebElement Dropselect= driver.findElement(By.xpath("//div[@id='ui-id-2']"));
        Keys.moveToElement(Dropselect).click(Dropselect).build().perform();

}}
