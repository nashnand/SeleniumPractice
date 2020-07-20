package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginExcel
{
    @Test (priority = 1)
    @Parameters ({"username","password"})
    public void LoginTestsuite(String username,String password){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe") ;
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement Uname=driver.findElement(By.id("txtUsername"));
        Uname.sendKeys(username);

        WebElement PWD=driver.findElement(By.id("txtPassword"));
        PWD.sendKeys(password);

        WebElement Submit=driver.findElement(By.id("btnLogin"));
        Submit.click();


    }


}
