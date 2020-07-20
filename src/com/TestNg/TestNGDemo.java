package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.*;


public class TestNGDemo {
    WebDriver driver;
    String Newwindow;
    String MainWindow;

    /**
     *
     */
    @BeforeTest
    public void Intialsetup(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
         }

    @Test(priority = 1)
    public void Launchurl(){
    driver.get("http://leafground.com/pages/Button.html");

    }

    @Test(priority = 2)
    public void ButtonPosition(){
    Point Getposition = driver.findElement(By.id("position")).getLocation();
    int xval = Getposition.getX();
    int yval = Getposition.getY();
    System.out.println("X value" + xval + "Y value" + yval);}

    @Test(priority = 3)
    public void ButtonColor(){
    WebElement Buttoncolor= driver.findElement(By.id("color"));
    String Butcolor =Buttoncolor.getCssValue("background-color");
    //Getting color values as rgba
        System.out.println(Butcolor);
        Color Colorname=Color.fromString(Butcolor);
        System.out.println(Colorname);
        System.out.println(Color.fromString(Butcolor).getColor());
    //Getting color values as hex
        System.out.println(Color.fromString(Butcolor).asHex());}

    @Test(priority = 4)
    public void Buttonheightwidth(){
    WebElement Buttonsize= driver.findElement(By.id("size"));
    int ButtonHeight = Buttonsize.getSize().height;
    int ButtonWidth = Buttonsize.getSize().width;
    System.out.println("ButtonHeight"+ButtonHeight+"Button Width"+ButtonWidth);}

    @Test(priority = 5)
    public void Buttonclick(){
    driver.findElement(By.id("home")).click();

     }
    @AfterTest()
   public void closebrowser(){
        Newwindow=driver.getWindowHandle();
        driver.switchTo().window(Newwindow);
        driver.close();

   }
}
