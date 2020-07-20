package com.urlprojectone;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class LinkTesting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Link.html");
        //driver.findElement(By.linkText("Go to Home Page")).click();
        WebElement Link = driver.findElement(By.partialLinkText("Find where am supposed"));
        String homeurl= Link.getAttribute("href");
        System.out.println(homeurl);
        //String oldwindow = driver.getWindowHandle();
        WebElement BrokenLink = driver.findElement(By.partialLinkText("Verify am I broken?"));
        //BrokenLink.click();
        String url = BrokenLink.getAttribute("href");
        System.out.println(url);
        verifyLink(homeurl);
      //Set<String> allwindows = driver.getWindowHandles();
     //   for (String newwindow : allwindows) {
     //       driver.switchTo().window(newwindow);
     //       String Status = driver.findElement(By.xpath("/html/body/p[2]/b/")).getText();
     //       System.out.println(Status);

     //   }
    }
        // The below function verifyLink(String urlLink) verifies any broken links and return the server status.
        public static void verifyLink(String urlLink) {
            //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
            try {
                //Use URL Class - Create object of the URL Class and pass the urlLink as parameter
                URL link = new URL(urlLink);
                // Create a connection using URL object (i.e., link)
                HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
                //Set the timeout for 2 seconds
                httpConn.setConnectTimeout(2000);
                //connect using connect method
                httpConn.connect();
                //use getResponseCode() to get the response code.
                if(httpConn.getResponseCode()== 200) {
                    System.out.println(urlLink+" - "+httpConn.getResponseCode());
                }
                if(httpConn.getResponseCode()== 404) {
                    System.out.println(urlLink+" - "+httpConn.getResponseCode());
                }
            }
            //getResponseCode method returns = IOException - if an error occurred connecting to the server.
            catch (Exception e) {
                //e.printStackTrace();
            }
            
        }



}
