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

    public static void rename(WebDriver driver){

        //span[normalize-space()='Home Sections']
        //input[@placeholder='Enter service title']
        //input[@placeholder='Enter service subtitle']
        //button[@id='submitBtn']

        WebElement seting = driver.findElement(By.xpath("//span[normalize-space()='Home Sections']"));
        seting.click();
        WebElement t1 = driver.findElement(By.xpath("//input[@placeholder='Enter service title']"));
        t1.clear();
        t1.sendKeys("Latest News");
        WebElement t2 = driver.findElement(By.xpath("//input[@placeholder='Enter service subtitle']"));
        t2.clear();
        t2.sendKeys("Don't miss out our vtuber events!");
        WebElement update = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        update.click();
        waitForPageLoad(driver);
    }

    public static void disable(WebDriver driver) throws InterruptedException {

        WebElement theme = driver.findElement(By.xpath("//span[normalize-space()='Sections Hide / Show']"));
        theme.click();
        WebElement two = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[2]/span[1]"));
        two.click();
        WebElement upd = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[7]/div[1]/label[2]/span[1]"));
        upd.click();
        WebElement upd1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[6]/div[1]/label[2]/span[1]"));
        upd1.click();
        WebElement upd2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[4]/div[1]/label[2]/span[1]"));
        upd2.click();
        WebElement upd3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[5]/div[1]/label[2]/span[1]"));
        upd3.click();
        WebElement upd4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[8]/div[1]/label[2]/span[1]"));
        upd4.click();
        WebElement update = driver.findElement(By.xpath("//button[@id='displayNotif']"));
        update.click();
        waitForPageLoad(driver);
    }


    public static void about(WebDriver driver) throws InterruptedException{
        //a[@href='#home_section']
        //span[normalize-space()='About Section']
        //input[@id='about_image']
        //input[@name='about_title']
        //input[@name='about_subtitle']
        //textarea[@name='about_content']
        //input[@name='about_button_text']
        //input[@name='about_button_url']
        //input[@id='about_video_image']
        //input[@name='about_video_url']
        //button[@id='submitBtn']

        WebElement seting = driver.findElement(By.xpath("//a[@href='#home_section']"));
        seting.click();
        Thread.sleep(1000);
        WebElement theme = driver.findElement(By.xpath("//span[normalize-space()='About Section']"));
        theme.click();
        //
        WebElement uploadc = driver.findElement(By.xpath("//input[@id='about_image']"));
        uploadc.clear();
        uploadc.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\about1.jpg");
        WebElement upload2 = driver.findElement(By.xpath("//input[@id='about_video_image']"));
        upload2.clear();
        upload2.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\about2.jpg");

        WebElement txt = driver.findElement(By.xpath("//input[@name='about_title']"));
        txt.clear();
        txt.sendKeys("Introducing Brand New Future");

        WebElement txt2 = driver.findElement(By.xpath("//input[@name='about_subtitle']"));
        txt2.clear();
        txt2.sendKeys("Virtual Youtuber");

        WebElement txt3 = driver.findElement(By.xpath("//textarea[@name='about_content']"));
        txt3.clear();
        txt3.sendKeys("A VTuber, or virtual YouTuber, is an online entertainer who uses a virtual avatar generated using computer graphics. Real-time motion capture software or technology are often—but not always—used to capture movement.");

        WebElement txt4 = driver.findElement(By.xpath("//input[@name='about_button_text']"));
        txt4.clear();
        txt4.sendKeys("Join Us!");

        WebElement txt5 = driver.findElement(By.xpath("//input[@name='about_button_url']"));
        txt5.clear();
        txt5.sendKeys("https://audition.hololivepro.com/en");

        WebElement txt6 = driver.findElement(By.xpath("//input[@name='about_video_url']"));
        txt6.clear();
        txt6.sendKeys("https://www.youtube.com/watch?v=3RxlzJWWzdY");

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
        sub.clear();
        sub.sendKeys("Hololive Production is a virtual YouTuber agency owned by Japanese tech entertainment company Cover Corporation");
        WebElement btn = driver.findElement(By.xpath("//div[@role='textbox']//p"));
        btn.clear();
        btn.sendKeys("© 2016 COVER Corp.");
        WebElement send = driver.findElement(By.xpath("//button[@id='submitBtn']"));
        send.click();
        waitForPageLoad(driver);
    }
    public static void video(WebDriver driver) throws InterruptedException {
        WebElement theme = driver.findElement(By.xpath("//span[normalize-space()='Video Section']"));
        theme.click();
        WebElement upload = driver.findElement(By.xpath("//input[@id='image']"));
        upload.sendKeys("D:\\Kuliah\\SMT 6\\project softest\\media\\video.jpg");
        WebElement sub = driver.findElement(By.xpath("//input[@name='video_section_title']"));
        sub.clear();
        sub.sendKeys("We Are Hiring!");
        WebElement btn = driver.findElement(By.xpath("//input[@name='video_section_url']"));
        btn.clear();
        btn.sendKeys("https://www.youtube.com/watch?v=Ok6ncJ2JEGY");
        WebElement send = driver.findElement(By.xpath("//button[@type='submit']"));
        send.click();
        waitForPageLoad(driver);
    }
    public static void heroslider(WebDriver driver) throws InterruptedException {
        WebElement home = driver.findElement(By.xpath("//a[@href='#home_section']"));
        home.click();
        WebElement hero = driver.findElement(By.xpath("//span[normalize-space()='Hero Section']"));
        Thread.sleep(1000);
        hero.click();

        //add sui
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm float-lg-right float-left']"));
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
