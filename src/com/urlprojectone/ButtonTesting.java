package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

/*Use Point class */
public class ButtonTesting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://leafground.com/pages/Button.html");
        //driver.findElement(By.id("home")).click();
        driver.findElement(By.xpath("//*[@id='post-153'']/div[2]/div/ul/li[2]/a/img)")).click();
        Point Getposition = driver.findElement(By.id("position")).getLocation();
        int xval = Getposition.getX();
        int yval = Getposition.getY();
        System.out.println("X value" + xval + "Y value" + yval);
        WebElement Buttoncolor= driver.findElement(By.id("color"));
        String Butcolor =Buttoncolor.getCssValue("background-color");
        //Getting color values as rgba
        System.out.println(Butcolor);
        Color Colorname=Color.fromString(Butcolor);
        System.out.println(Colorname);
        System.out.println(Color.fromString(Butcolor).getColor());
        //Getting color values as hex
        System.out.println(Color.fromString(Butcolor).asHex());

        WebElement Buttonsize= driver.findElement(By.id("size"));
        int ButtonHeight = Buttonsize.getSize().height;
        int ButtonWidth = Buttonsize.getSize().width;
        System.out.println("ButtonHeight"+ButtonHeight+"Button Width"+ButtonWidth);

    }
    }
