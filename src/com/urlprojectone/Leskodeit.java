package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class Leskodeit {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");
        /*Radio Button Example*/
        driver.findElement(By.id("bmwradio")).click();

        /*Select Class Example*/
        WebElement Carselect = driver.findElement(By.id("carselect"));
        Select select = new Select(Carselect);
        select.selectByValue("bmw");

        /*Multiple Select Example*/
        WebElement Multiselect = driver.findElement(By.id("multiple-select-example"));
        Select multisel = new Select(Multiselect);
        multisel.selectByIndex(0);
        multisel.selectByIndex(2);

        /*Checkbox Example*/
        driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
        driver.findElement(By.xpath("//input[@id='benzcheck']")).click();

        /*Switch Window Example*/
        String MainwindowHandle = driver.getWindowHandle();
        driver.findElement(By.id("openwindow")).click();
        String Newhandle = driver.getWindowHandle();
        driver.switchTo().window(Newhandle);
        /*driver.close();*/
        driver.switchTo().window(MainwindowHandle);

        /* Switch To Alert Example*/
        driver.findElement(By.id("name")).sendKeys("Testing Alerts");
        driver.findElement(By.id("alertbtn")).click();
        driver.switchTo().alert().accept();
        System.out.println("Alertbtn successfull");
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().accept();
        System.out.println("Confirm button successfull");

        /*Switch Tab Example*/
        driver.findElement(By.id("opentab")).click();
        Set<String> Alltab = driver.getWindowHandles();
        for (String looptab : Alltab) {
            driver.switchTo().window(looptab);
            if (!looptab.equals(MainwindowHandle)) {
                driver.close();
            }
        }
        System.out.println("New Tab closed successfully");
        driver.switchTo().window(MainwindowHandle);

        /*Web Table Example*/
        List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
        List<WebElement> tablecolumn = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));

        System.out.println("Table row" + tablerow.size());
        System.out.println("Table Column" + tablecolumn.size());

        String price = driver.findElement(By.xpath("//table[@id='product']/tbody/tr/td[contains(text(),'Selenium WebDriver With Java')]/following::td")).getText();
        String Coursename = driver.findElement(By.xpath("//table[@id='product']/tbody/tr/td[contains(text(),'Selenium WebDriver With Java')]")).getText();
        System.out.println("Course Price of " + Coursename + " is " + price);

        /*Element Displayed Example*/
        driver.findElement(By.id("hide-textbox")).click();
        displaystatus();
        driver.findElement(By.id("show-textbox")).click();
        displaystatus();

        /*Mouse Hover Example*/
        Actions mouse=new Actions(driver);
        WebElement hover=driver.findElement(By.id("mousehover"));
        Thread.sleep(2000);
        mouse.clickAndHold(hover).perform();
        System.out.println("mouse hover success");
        WebElement SelectTop=driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
        mouse.moveToElement(SelectTop).click().build().perform();
        System.out.println("Page moved to Top");
        Thread.sleep(2000);
        /*iFrame Example*/
        driver.switchTo().frame("courses-iframe");
        System.out.println("iframe switch successfull");
        driver.findElement(By.xpath("//div[@data-course-id='94053']")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        System.out.println("Default window switch successfull");
        driver.close();
    }
    public static void displaystatus() {
        Boolean Displaystatus = driver.findElement(By.id("displayed-text")).isDisplayed();
        if (Displaystatus) {
            System.out.println("Hide unsuccessful");
        } else
            System.out.println("Hide Successful");
    }

}
