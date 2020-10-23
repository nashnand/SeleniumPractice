package way2automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        //  login();
        // multiform();
        // calculator();
        banklogin();

    }

    public void login() {
        driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
        WebDriverWait Wait = new WebDriverWait(driver, 20);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("angular");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.cssSelector("input[ng-model='model[options.key]']")).sendKeys("angular");

        boolean ButtonEnabled = driver.findElement(By.xpath("//div/button")).isEnabled();
        if (ButtonEnabled) {
            driver.findElement(By.xpath("//div/button")).click();
        } else {
            System.out.println("login button disabled");
        }
        driver.close();
    }

    public static void multiform() throws InterruptedException {

        /*Page 1*/
        driver.get("http://www.way2automation.com/angularjs-protractor/multiform/#/form/profile");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[ng-model='formData.name']")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[ng-model='formData.email']")).sendKeys("Test@gmail.com");
        driver.findElement(By.xpath("//a[@class='btn btn-block btn-info']")).click();

        /*Page 2*/
        Thread.sleep(1000);
        WebElement Radiosel = driver.findElement(By.cssSelector("#form-views > div:nth-child(2) > div:nth-child(1) > label > input"));
        Radiosel.click();
        driver.findElement(By.xpath("//a[@class='btn btn-block btn-info']")).click();

        /*Page 3*/
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(500);
        alert.accept();
        driver.close();
    }

    public static void calculator() throws InterruptedException {
        driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("1");
        driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("2");
        driver.findElement(By.id("gobutton")).click();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//td[3]")));
        driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("100");
        driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("2");
        WebElement Dropdown = driver.findElement(By.cssSelector("body > div.container.ng-scope > div > form > select"));
        Select dropsel = new Select(Dropdown);
        dropsel.selectByValue("DIVISION");
        driver.findElement(By.id("gobutton")).click();

    }

    public static void banklogin() throws InterruptedException {
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        Thread.sleep(1000);
        /*driver.findElement(By.xpath("//button[contains(text(),\"Customer Login\")]")).click();*/
        /*Bank Manager Login*/
        driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();
        Thread.sleep(1000);

        /*Add customer*/
        driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[ng-model='fName']")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[ng-model='lName']")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[ng-model='postCd']")).sendKeys("600123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        String alertxt = alert.getText();
        String extractedNum = alertxt.replaceAll("[^-?0-9]+", " ");
        /* Regular expression
        [^-?0-9]+
        [ and ] delimites a set of characters to be single matched, i.e., only one time in any order
        ^ Special identifier used in the beginning of the set, used to indicate to match all characters not present in the delimited set, instead of all characters present in the set.
        + Between one and unlimited times, as many times as possible, giving back as needed
        -? One of the characters “-” and “?”
        0-9 A character in the range between “0” and “9”
         */
        System.out.println("Generated Customer ID" + extractedNum);
        alert.accept();
        Thread.sleep(1000);
        /*Open Account*/

        driver.findElement(By.xpath("//button[contains(text(),'Open Account')]")).click();
        Thread.sleep(1000);
        WebElement CustomerFind=driver.findElement(By.cssSelector("select#userSelect"));
        Select Customername=new Select(CustomerFind);
        Customername.selectByVisibleText("Test Test");

        WebElement CurrencyFind=driver.findElement(By.xpath("//select[@id='currency']"));
        Select Currencyname=new Select(CurrencyFind);
        Currencyname.selectByValue("Dollar");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Alert processalert = driver.switchTo().alert();
        String alertxtopenacc = processalert.getText();
        String extractedAccNum = alertxtopenacc.replaceAll("[^-?0-9]+", " ");
        System.out.println("Account created successfully with account Number" + extractedAccNum);
        Thread.sleep(1000);
        alert.accept();
        /*Customer Tab*/
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys(extractedAccNum);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn home']")).click();

    }

}

