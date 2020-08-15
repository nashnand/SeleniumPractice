package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowshandleTestleaf {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        Thread.sleep(2000);
        String Oldwindowhandle = driver.getWindowHandle();
        driver.findElement(By.id("home")).click();
        Thread.sleep(2000);
        Set<String> Allwindows = driver.getWindowHandles();
        childwindowsclose(Oldwindowhandle, Allwindows);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
        Set<String> OpenWindows2 = driver.getWindowHandles();
        System.out.println("No of openwindows" + OpenWindows2.size());
        childwindowsclose(Oldwindowhandle, OpenWindows2);

    }


    public static void childwindowsclose(String Oldwindowhandle, Set<String> Allwindows) {
        /*Storing the windows handle in set and closing only the child handle*/
        for (String Currenthandle : Allwindows) {
            driver.switchTo().window(Currenthandle);
            if (!Currenthandle.equals(Oldwindowhandle)) {
                driver.close();
            }
            driver.switchTo().window(Oldwindowhandle);
        }
    }
}