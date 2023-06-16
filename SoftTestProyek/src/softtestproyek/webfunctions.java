package softtestproyek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class webfunctions {

    public static void waitForPageLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
    }
    public static void theme(WebDriver driver){
        WebElement seting = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
        seting.click();
        WebElement theme = driver.findElement(By.xpath("//a[@href='https://gruplm.com/user/theme/version']"));
        theme.click();
        WebElement two = driver.findElement(By.xpath("//img[@src='https://gruplm.com/assets/front/img/user/templates/home_two.png']"));
        two.click();
        WebElement update = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        update.click();
        waitForPageLoad(driver);
    }

    public static void service(WebDriver driver) throws InterruptedException{
        WebElement seting = driver.findElement(By.xpath("//p[normalize-space()='Services']"));
        seting.click();

        //add1
        WebElement theme = driver.findElement(By.xpath("//a[@class='btn btn-primary float-right btn-sm']"));
        theme.click();
        Thread.sleep(3000);
        WebElement upload = driver.findElement(By.xpath("//input[@id='image']"));
        upload.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\service.jpg");
        Select cbox = new Select(driver.findElement(By.xpath("//select[@name='user_language_id']")));
        cbox.selectByValue("302");
        Thread.sleep(2000);

        WebElement txt = driver.findElement(By.xpath("//input[@name='name']"));
        txt.sendKeys("Hololive Theme Park Announced");
//        WebElement btn = driver.findElement(By.xpath("//div[@class='note-editing-area']]"));
//        btn.sendKeys("Enjoy our fast delivery shipping service with minimum prices");
        WebElement txt2 = driver.findElement(By.xpath("//input[@name='serial_number']"));
        txt2.sendKeys("1");



        WebElement cek = driver.findElement(By.xpath("//input[@id='featured']"));
        cek.click();
        WebElement cek2 = driver.findElement(By.xpath("//input[@class='mr-1']"));
        cek2.click();

//        WebElement txt3 = driver.findElement(By.xpath("//input[@class='bootstrap-tagsinput']"));
//        txt3.sendKeys("Delivery");
//        WebElement txt4 = driver.findElement(By.xpath("//textarea[@name='meta_description']"));
//        txt4.sendKeys("Fast Delivery");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        submit.click();

        Thread.sleep(2000);

        //add2
        WebElement themec = driver.findElement(By.xpath("//a[@class='btn btn-primary float-right btn-sm']"));
        themec.click();
        Thread.sleep(3000);
        WebElement uploadc = driver.findElement(By.xpath("//input[@id='image']"));
        uploadc.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\service2.jpg");
        Select cboxc = new Select(driver.findElement(By.xpath("//select[@name='user_language_id']")));
        cboxc.selectByValue("302");
        Thread.sleep(2000);

        WebElement txtc = driver.findElement(By.xpath("//input[@name='name']"));
        txtc.sendKeys("Hololive X Valkyrie Connect Collab!");
//        WebElement btn = driver.findElement(By.xpath("//div[@class='note-editing-area']]"));
//        btn.sendKeys("Enjoy our fast delivery shipping service with minimum prices");
        WebElement txt2c = driver.findElement(By.xpath("//input[@name='serial_number']"));
        txt2c.sendKeys("2");



        WebElement cekc = driver.findElement(By.xpath("//input[@id='featured']"));
        cekc.click();
        WebElement cek2c = driver.findElement(By.xpath("//input[@class='mr-1']"));
        cek2c.click();

//        WebElement txt3 = driver.findElement(By.xpath("//input[@class='bootstrap-tagsinput']"));
//        txt3.sendKeys("Delivery");
//        WebElement txt4 = driver.findElement(By.xpath("//textarea[@name='meta_description']"));
//        txt4.sendKeys("Fast Delivery");

        WebElement submitc = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        submitc.click();

        Thread.sleep(2000);

        //add3
        WebElement theme2 = driver.findElement(By.xpath("//a[@class='btn btn-primary float-right btn-sm']"));
        theme2.click();
        Thread.sleep(3000);
        WebElement upload2 = driver.findElement(By.xpath("//input[@id='image']"));
        upload2.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\service3.png");
        Select cbox2 = new Select(driver.findElement(By.xpath("//select[@name='user_language_id']")));
        cbox2.selectByValue("302");
        Thread.sleep(2000);

        WebElement txtb = driver.findElement(By.xpath("//input[@name='name']"));
        txtb.sendKeys("Hololive Baseball Merch With Giants!");
//        WebElement btn = driver.findElement(By.xpath("//div[@class='note-editing-area']]"));
//        btn.sendKeys("Enjoy our fast delivery shipping service with minimum prices");
        WebElement txtb2 = driver.findElement(By.xpath("//input[@name='serial_number']"));
        txtb2.sendKeys("3");



        WebElement cekb = driver.findElement(By.xpath("//input[@id='featured']"));
        cekb.click();
        WebElement cekb2 = driver.findElement(By.xpath("//input[@class='mr-1']"));
        cekb2.click();

//        WebElement txt3 = driver.findElement(By.xpath("//input[@class='bootstrap-tagsinput']"));
//        txt3.sendKeys("Delivery");
//        WebElement txt4 = driver.findElement(By.xpath("//textarea[@name='meta_description']"));
//        txt4.sendKeys("Fast Delivery");

        WebElement submit2 = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        submit2.click();

        Thread.sleep(2000);

        waitForPageLoad(driver);
    }

    public static void footer(WebDriver driver) throws InterruptedException {
        WebElement footer = driver.findElement(By.xpath("//a[@href='#footer']"));
        footer.click();
        Thread.sleep(500);
        WebElement theme = driver.findElement(By.xpath("//span[normalize-space()='Footer Logo & Text']"));
        theme.click();
        WebElement upload = driver.findElement(By.xpath("//input[@name='logo']"));
        upload.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\footer.jpg");
        WebElement sub = driver.findElement(By.xpath("//textarea[@name='about_company']"));
        sub.sendKeys("Hololive Production is a virtual YouTuber agency owned by Japanese tech entertainment company Cover Corporation");
        WebElement btn = driver.findElement(By.xpath("//div[@role='textbox']//p"));
        btn.sendKeys("© 2016 COVER Corp.");
        WebElement send = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        send.click();
        waitForPageLoad(driver);
    }
    public static void heroslider(WebDriver driver) throws InterruptedException {
        WebElement home = driver.findElement(By.xpath("//a[@href='#home_section']"));
        home.click();
        WebElement hero = driver.findElement(By.xpath("//span[normalize-space()='Hero Section']"));
        hero.click();

        //add sui
        WebElement add = driver.findElement(By.xpath("//input[@name='logo']"));
        add.click();

        //form
        Select cbox = new Select(driver.findElement(By.xpath("//select[@id='language']")));
        cbox.selectByValue("302");

        Thread.sleep(2000);

        //upload
        WebElement upload = driver.findElement(By.xpath("//input[@id='image']"));
        upload.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\sui anniv small.jpg");

        WebElement title = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Title']"));
        title.sendKeys("Suisei 5th Anniversary Celebration");
        WebElement sub = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Subtitle']"));
        sub.sendKeys("Including canvas art, Sui-chan cushion, Gacha rubber keychain, Comet Shoulder Bag");
        WebElement btn = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button Name']"));
        btn.sendKeys("Buy Now !");
        WebElement url = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button URL']"));
        url.sendKeys("https://shop.hololivepro.com/en/products/hoshimachisuisei_bd2023-an5th");
        WebElement order = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Serial Number']"));
        order.sendKeys("1");
        WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
        save.click();

        Thread.sleep(4000);

        //form
        Select cbox2 = new Select(driver.findElement(By.xpath("//select[@id='language']")));
        cbox2.selectByValue("302");

        Thread.sleep(2000);

        //upload
        WebElement upload2 = driver.findElement(By.xpath("//input[@id='image']"));
        upload2.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\aqua live.png");

        WebElement title2 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Title']"));
        title2.sendKeys("Aqua 2nd Sololive !!!");
        WebElement sub2 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Subtitle']"));
        sub2.sendKeys("Aqua iro in Wonder Land ticket is now on sale!!!");
        WebElement btn2 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button Name']"));
        btn2.sendKeys("Buy Now !");
        WebElement url2 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button URL']"));
        url2.sendKeys("https://aqua2ndlive.hololivepro.com/");
        WebElement order2 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Serial Number']"));
        order2.sendKeys("2");
        WebElement save2 = driver.findElement(By.xpath("//button[@type='submit']"));
        save2.click();

        Thread.sleep(4000);

        //form
        Select cbox3 = new Select(driver.findElement(By.xpath("//select[@id='language']")));
        cbox3.selectByValue("302");

        Thread.sleep(2000);

        //upload
        WebElement upload3 = driver.findElement(By.xpath("//input[@id='image']"));
        upload3.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\Get well voice_EN.png");

        WebElement title3 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Title']"));
        title3.sendKeys("Get Well Soon Voice Pack !!!");
        WebElement sub3 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Subtitle']"));
        sub3.sendKeys("Listen to Xsoleil soothing voice in your daring condition !");
        WebElement btn3 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button Name']"));
        btn3.sendKeys("Buy Now !");
        WebElement url3 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Button URL']"));
        url3.sendKeys("https://nijisanji-store.com/collections/get-well-voice-2023");
        WebElement order3 = driver.findElement(By.xpath("//input[@placeholder='Enter Slider Serial Number']"));
        order3.sendKeys("3");
        WebElement save3 = driver.findElement(By.xpath("//button[@type='submit']"));
        save3.click();

        Thread.sleep(4000);

        WebElement back = driver.findElement(By.xpath("//a[@class='btn btn-info btn-sm float-right d-inline-block']"));
        back.click();

        Thread.sleep(4000);

    }
}
