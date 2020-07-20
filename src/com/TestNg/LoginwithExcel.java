package com.TestNg;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginwithExcel
{
    public static WebDriver driver;
String[][] Data=null;

public String [][] getdata() throws IOException, BiffException {
FileInputStream exelinput= new FileInputStream("C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\Exceldata\\logindata.xls");
    Workbook workbook1=Workbook.getWorkbook(exelinput);
    Sheet sheet1=workbook1.getSheet(0);
    int row=sheet1.getRows();
    int column=sheet1.getColumns();
    String[][] twodiarray = new String [row-1][column]; //omitting first row for heading
    for (int i=1;i< row;i++)
    {
        for(int j=0 ; j<column; j++)
        {
            twodiarray [i-1][j]=sheet1.getCell(j,i).getContents();

        }
    }
return twodiarray;
}

    @DataProvider(name="Logindata")
    public Object[] Testdata() throws IOException, BiffException {
        Data= getdata();
        return Data;
    }
    @BeforeTest
    public void intial(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.muthukrishnan\\Desktop\\Selenium\\chromedriver\\chromedriver.exe") ;
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test(dataProvider = "Logindata")
    public void LoginTestsuite(String username,String password){

        WebElement Uname=driver.findElement(By.id("txtUsername"));
        Uname.sendKeys(username);

        WebElement PWD=driver.findElement(By.id("txtPassword"));
        PWD.sendKeys(password);

        WebElement Submit=driver.findElement(By.id("btnLogin"));
        Submit.click();




    }
    @AfterTest
    public static void close()
    {
        driver.close();
    }

}
