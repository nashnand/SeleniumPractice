package com.urlprojectone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Edit.html");

        WebElement Email= driver.findElement(By.id("email"));
        Email.sendKeys("Testing@gmail.com");
        System.out.println("Testing");

        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("Append testing");

        System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).clear();
        String Status= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).getAttribute("disabled");
        if ("true".equals(Status))
            System.out.println("Field is disabled");
        else
            System.out.println("not disabled");






            }
}
