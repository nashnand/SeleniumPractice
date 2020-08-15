package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*Key: Use naturalWidth =0 css property for checking broken
* Use Action class for keyboard or mouse action*/

public class ImageTestleaf {

    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Image.html");
        /*driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();*/
        //If CSS property naturalwidth == 0 ->Then its broken image
        WebElement Borkenimg= driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > img"));
        if (Borkenimg.getAttribute("naturalWidth").equals("0")){
        System.out.println("Broken image");}
        else{
            System.out.println("not broken");
        }

        Actions Keys= new Actions(driver);
        WebElement Image=driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
        Keys.click(Image).build().perform();


    }
}
