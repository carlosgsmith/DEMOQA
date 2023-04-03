package pages.demoqa;

import com.codeborne.selenide.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;


public class demoQAHomePage {

    //page links
     public String PAGE_LINK;
     public ElementsCollection demoQAPageLinks = $$("#app > div > div > div.home-body > div.category-cards > div");

    public void openURL(){
        ChromeOptions options = new ChromeOptions();
        Configuration.browserCapabilities = options;
        options.addArguments("--remote-allow-origins=*");
        Configuration.browser = "chrome";
        //options.addArguments("--window-size=1920,1200");
        //Configuration.browserSize = "1920x1200";

        WebDriver webdriver = new ChromeDriver(options);
        setWebDriver(webdriver);
        webdriver.manage().window().setSize(new Dimension(1920,1200));
        webdriver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
        open("https://demoqa.com");

    }

    public String getHomePageLinksText(int indexNumber){
        PAGE_LINK = demoQAPageLinks.get(indexNumber).text();
        return PAGE_LINK;
    }

    public void clickLinkOnHomePage(int indexNumber){
        demoQAPageLinks.get(indexNumber).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

}
