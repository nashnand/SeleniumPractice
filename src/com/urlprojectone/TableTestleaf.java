package com.urlprojectone;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Table are identified with TR-table row & TC-Table column*/

public class TableTestleaf {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/table.html");
        List Rows= driver.findElements(By.tagName("tr"));
        System.out.println("Rowsize"+ Rows.size());
        List Column= driver.findElements(By.tagName("th"));
        System.out.println("Column"+ Column.size());

        WebElement progress= driver.findElement(By.xpath("//td[contains(text(),'Learn to interact with Elements')]//following::td[1]"));
        System.out.println("Progress values" + progress.getText());

        List<WebElement> allprogress= driver.findElements(By.xpath("//td[2]"));
        List<Integer> numberlist = new ArrayList<Integer>();
        for (WebElement webElement:allprogress) {
            String Individualvalue= webElement.getText();
            String removingPercentage= Individualvalue.substring(0,Individualvalue.length()-1);
            numberlist.add(Integer.parseInt(removingPercentage));
        }
        System.out.println(numberlist);

        //List is one of the collection
        Integer Smallvalue = Collections.min(numberlist);
        System.out.println("Smallvalue"+Smallvalue);
        String Bcktostr_forxpath = Smallvalue.toString()+"%";
        String Finalxpath = "//td[normalize-space()="+"\'"+ Bcktostr_forxpath + "\'"+"]//following::td[1]//input[@type=\"checkbox\"]";
       /* //td[normalize-space()='30%']//following::td[1] ==>replication of 30% in xpath*/
        driver.findElement(By.xpath(Finalxpath)).click();

        }

}
