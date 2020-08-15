package com.urlprojectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalTime;
public class FlipkartAutobuy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.flipkart.com/poco-m2-pro-two-shades-black-64-gb/p/itmaf67e90291adf?pid=MOBFT7MKC9DMG2PU&lid=LSTMOBFT7MKC9DMG2PUNJUWXP&marketplace=FLIPKART&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&fm=SEARCH&iid=65456a78-7575-40de-b6f4-46a88f09aa09.MOBFT7MKC9DMG2PU.SEARCH&ppt=sp&ppn=sp&ssid=tb1wtu62hs0000001596550382764&qH=b83349d0f5338c62");*/
        driver.get("https://www.flipkart.com/oppo-a5s-gold-64-gb/p/itmffhgzsqaczrn4?pid=MOBFHHSQH9AHZRAW&lid=LSTMOBFHHSQH9AHZRAWLEGR9K&marketplace=FLIPKART&srno=b_1_1&otracker=clp_banner_2_6.bannerX3.BANNER_mobiles-phone-big-saving-days-aug-929s-9jwj-store_6Z4137DHABET&fm=neo%2Fmerchandising&iid=2ff55274-6d46-4785-81c8-02f79c7688b0.MOBFHHSQH9AHZRAW.SEARCH&ppt=browse&ppn=browse&ssid=yyb7nwoy1c0000001597039650771");
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("xxxxx@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xxxxxx");
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();
        WebDriverWait wait= new WebDriverWait(driver,60);
        System.out.println("Time before"+java.time.LocalDateTime.now());
        Thread.sleep(2000);
        WebElement buy= driver.findElement(By.xpath("(//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/text()"));
/*      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button/text()")));
        driver.switchTo().frame(0);
        WebElement buy= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button/text()"));*/
        Actions keys=new Actions(driver);
        keys.moveToElement(buy).click(buy).release(buy).build().perform();


        System.out.println("Time after"+java.time.LocalDateTime.now());
        WebElement Deliver=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Deliver Here')]")));
        Deliver.click();
        WebElement Continue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),\"CONTINUE\")]")));
        Continue.click();
        WebElement citi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ANAND CITI')]//parent::div//parent::div//parent::label//child::div[@class='_6ATDKp']")));
        citi.click();
        WebElement cvv=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cvv']")));
        cvv.sendKeys("151");
        /*driver.findElement(By.xpath("//div//following::button[@tabindex='2']")).click();*/

    }
}
