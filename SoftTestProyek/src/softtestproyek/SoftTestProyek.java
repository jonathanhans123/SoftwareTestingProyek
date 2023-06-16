/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softtestproyek;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author jonat
 */
public class SoftTestProyek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\SMT 6\\Software Testing\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        webfunctions wf = new webfunctions();

        String[][] data = readDataFromGoogleSheets();           
        printDataFromGoogleSheets(data);
        
        driver.manage().window().maximize();        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
//        registerUser(data,driver,wait);
        loginUser(driver,wait, "test@gmail.com","test1234");

//        driver.quit();
//        configureShop(driver, wait);

//        wf.theme(driver);
//        waitForPageLoad(driver);
//        Thread.sleep(5000);
//        wf.heroslider(driver);
//        Thread.sleep(2000);
//        wf.footer(driver);
//          Thread.sleep(2000);
//          wf.service(driver);
          Thread.sleep(2000);
          wf.about(driver);

    }

    public static void configureShop(WebDriver driver, WebDriverWait wait){
        driver.findElement(By.xpath("//a[@href='#category']")).click();
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[1]/a")).click();
        WebElement tax = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[4]/input"));
        wait.until(ExpectedConditions.elementToBeClickable(tax));
        tax.click();
        tax.sendKeys(Keys.BACK_SPACE);
        tax.sendKeys(Keys.BACK_SPACE);
        tax.sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

        //shipping charges
        try{ //ada animasi loading ga jelas jadi di sleep kalo pake wait tetep error
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //
        }
        WebElement shippingCharges = driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(shippingCharges));
        shippingCharges.click();

        WebElement addNewShippingCharge = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(addNewShippingCharge));
        addNewShippingCharge.click();

        WebElement selectLang = driver.findElement(By.xpath("//*[@id=\"language\"]"));
        Select select = new Select(selectLang);
        select.selectByVisibleText("English");
        WebElement title = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[2]/input"));
        title.click();
        title.sendKeys("A Shipping Charge");
        WebElement sortText = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[3]/input"));
        sortText.click();
        sortText.sendKeys("abc");
        WebElement charge = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[4]/input"));
        charge.click();
        charge.sendKeys("23");
        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

        try{ //ada animasi loading ga jelas jadi di sleep kalo pake wait tetep error
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //
        }

        //manage items
        driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[4]/a")).click();
        WebElement categories = driver.findElement(By.xpath("//*[@id=\"productManagement\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(categories));
        categories.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a")).click();

        selectLang = driver.findElement(By.xpath("//*[@id=\"language\"]"));
        select = new Select(selectLang);
        select.selectByVisibleText("English");

        driver.findElement(By.xpath("//*[@id=\"image\"]")).sendKeys("C:\\Users\\liant\\Pictures\\gambar.jpg");
        WebElement name = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[3]/input"));
        name.click();
        name.sendKeys("sebuah kategori");

        WebElement status = driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[4]/select"));
        Select selectStatus = new Select(status);
        selectStatus.selectByVisibleText("Active");

        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

        //subcategory
        try{ //ada animasi loading ga jelas jadi di sleep kalo pake wait tetep error
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //
        }

        WebElement subCat = driver.findElement(By.xpath("//*[@id=\"productManagement\"]/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(subCat));
        subCat.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a")).click();

        selectLang = driver.findElement(By.xpath("//*[@id=\"language\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectLang));
        select = new Select(selectLang);
        select.selectByVisibleText("English");

        WebElement selectCat = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/select"));
        Select selectTheCat = new Select(selectCat);
        selectTheCat.selectByVisibleText("sebuah kategori");

        WebElement nameForm = driver.findElement((By.xpath("//*[@id=\"ajaxForm\"]/div[3]/input")));
        nameForm.click();
        nameForm.sendKeys("sebuah subkategori");

        selectStatus = new Select(driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[4]/select")));
        selectStatus.selectByVisibleText("Active");

        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

        try{ //ada animasi loading ga jelas jadi di sleep kalo pake wait tetep error
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/a")).click();

        selectLang = driver.findElement(By.xpath("//*[@id=\"language\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectLang));
        select = new Select(selectLang);
        select.selectByVisibleText("English");


        WebElement selectCat2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[3]/div/div/div[2]/form/div[2]/select"));
        wait.until(ExpectedConditions.elementToBeClickable(selectCat2));
        selectTheCat = new Select(selectCat2);
        selectTheCat.selectByVisibleText("sebuah kategori");

        nameForm = driver.findElement((By.xpath("//*[@id=\"ajaxForm\"]/div[3]/input")));
        nameForm.click();
        nameForm.sendKeys("a subcategory");

        selectStatus = new Select(driver.findElement(By.xpath("//*[@id=\"ajaxForm\"]/div[4]/select")));
        selectStatus.selectByVisibleText("Active");

        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

        try{ //ada animasi loading ga jelas jadi di sleep kalo pake wait tetep error
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //
        }

        //add item
//        driver.findElement(By.xpath("//*[@id=\"productManagement\"]/ul/li[3]/a")).click();
//
//        WebElement digitalProductButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div[2]/a"));
//        wait.until(ExpectedConditions.elementToBeClickable(digitalProductButton));
//        digitalProductButton.click();
//
//        driver.findElement(By.xpath("//*[@id=\"image\"]")).sendKeys("C:\\Users\\liant\\Pictures\\softest\\0.jpg");
////        driver.findElement(By.xpath("//*[@id=\"my-dropzone\"]")).sendKeys("C:\\Users\\liant\\Pictures\\softest\\0.jpg");
//        driver.findElement(By.xpath("//*[@id=\"productStock\"]")).sendKeys("20");



    }
    
    public static void loginUser(WebDriver driver,WebDriverWait wait,String email, String password){
        driver.get("https://gruplm.com/");
        //login
        WebElement login = driver.findElement(By.xpath("//a[@class=\"main-btn\"]"));
        scrollThenClickToElement(driver, login,wait);
        //email
        WebElement emailelement = driver.findElements(By.xpath("//input[@name=\"email\"]")).get(0);
        scrollThenClickToElement(driver,emailelement,wait);
        emailelement.sendKeys(email);
        //password
        WebElement passwordelement = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        scrollThenClickToElement(driver,passwordelement,wait);
        passwordelement.sendKeys(password);
        //login
        WebElement login2 = driver.findElement(By.xpath("//button[@class=\"main-btn\"]"));
        scrollThenClickToElement(driver, login2,wait);
    }
    
    public static void registerUser(String[][] data, WebDriver driver, WebDriverWait wait){
        for(int i=1;i<data.length;i++){
            driver.get("https://gruplm.com/");
            //lifetime
            WebElement LifeTime = driver.findElement(By.xpath("//a[@class=\"nav-link \" and text()=\"Lifetime\"]"));
            scrollThenClickToElement(driver, LifeTime,wait);
            //purchase
            WebElement Purchase = driver.findElement(By.xpath("//*[@id=\"lifetime\"]/div/div[3]/div/div[3]/a"));
            wait.until(ExpectedConditions.visibilityOf(Purchase));
            scrollThenClickToElement(driver, Purchase,wait);
            //username
            WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
            scrollThenClickToElement(driver,username,wait);
            username.sendKeys(data[i][0]);
            //email
            WebElement email = driver.findElements(By.xpath("//input[@name=\"email\"]")).get(0);
            scrollThenClickToElement(driver,email,wait);
            email.sendKeys(data[i][1]);
            //password
            WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
            scrollThenClickToElement(driver,password,wait);
            password.sendKeys(data[i][2]);
            //password confimation
            WebElement cpassword = driver.findElement(By.xpath("//input[@name=\"password_confirmation\"]"));
            scrollThenClickToElement(driver,cpassword,wait);
            cpassword.sendKeys(data[i][3]);
            //confirm
            WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\" and text()=\"continue\"]"));
            scrollThenClickToElement(driver,button,wait);
            //wait
            waitForPageLoad(driver);
            //first name
            WebElement firstname = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
            scrollThenClickToElement(driver,firstname,wait);
            firstname.sendKeys(data[i][4]);
            //last name
            WebElement lastname = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
            scrollThenClickToElement(driver,lastname,wait);
            lastname.sendKeys(data[i][5]);
            //phone number
            WebElement phonenumber = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
            scrollThenClickToElement(driver,phonenumber,wait);
            phonenumber.sendKeys(data[i][6]);
            //company name
            WebElement companyname = driver.findElement(By.xpath("//input[@name=\"company_name\"]"));
            scrollThenClickToElement(driver,companyname,wait);
            companyname.sendKeys(data[i][7]);
            //street address
            WebElement address = driver.findElement(By.xpath("//input[@name=\"address\"]"));
            scrollThenClickToElement(driver,address,wait);
            address.sendKeys(data[i][8]);
            //city
            WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
            scrollThenClickToElement(driver,city,wait);
            city.sendKeys(data[i][9]);
            //state
            WebElement state = driver.findElement(By.xpath("//input[@name=\"district\"]"));
            scrollThenClickToElement(driver,state,wait);
            state.sendKeys(data[i][10]);
            //country
            WebElement country = driver.findElement(By.xpath("//input[@name=\"country\"]"));
            scrollThenClickToElement(driver,country,wait);
            country.sendKeys(data[i][11]);
            //coupon
            WebElement coupon = driver.findElement(By.xpath("//input[@name=\"coupon\"]"));
            scrollThenClickToElement(driver,coupon,wait);
            coupon.sendKeys("softwaretesting");
            //apply
            WebElement apply = driver.findElement(By.xpath("//span[@id=\"basic-addon2\"]"));
            scrollThenClickToElement(driver,apply,wait);
            //buttonConfirm
            WebElement button2 = driver.findElement(By.xpath("//button[@id=\"confirmBtn\"]"));
//            scrollThenClickToElement(driver,button2,wait);
        }
    }
    public static void waitForPageLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
    }

    public static void scrollThenClickToElement(WebDriver driver, WebElement element, WebDriverWait wait) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public static void printDataFromGoogleSheets(String[][] data) {
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    String cellValue = data[i][j];
                    // Process the cell value as needed
                    System.out.print(cellValue + "\t");
                }
                System.out.println(); // Move to the next row
            }
        }
    }
    public static String[][] readDataFromGoogleSheets() {
        String[][] data = null;

        try {
            String googleSheetsURL = "https://docs.google.com/spreadsheets/d/e/2PACX-1vS0IBo736QOoFpbmKFqXdUWSxYsZVp8waCJwIzqkbGpa49y8yaXPzKQMmHqKcJcEbspNXDrmIn5qut6/pub?output=csv";
            URL url = new URL(googleSheetsURL);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
                List<String[]> rows = new ArrayList<>();
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] row = line.split(",");
                    rows.add(row);
                }

                // Convert the list to a two-dimensional array
                data = new String[rows.size()][];
                data = rows.toArray(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}   