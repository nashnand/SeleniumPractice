package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class DOWNLOAD {

public static void main(String[] args) throws InterruptedException, AWTException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://leafground.com/pages/download.html");
    driver.findElement(By.xpath("//a[contains(text(),'Download Excel')]")).click();
    Thread.sleep(1000);
    File Filelocation = new File("C:\\Users\\anand.muthukrishnan\\Downloads");
    File[] Filelist = Filelocation.listFiles();
    /*Take first value in Filelist and assign to File and proceed with loop*/
    assert Filelist != null;
    for (File file : Filelist) {
        if (file.getName().equals("testleaf.xlsx")) {
            System.out.println("File is present");
            break;
        }
    }
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");

    driver.findElement(By.xpath("//a[contains(text(),'Download PDF')]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(),'Download Text')]")).click();

}
}


