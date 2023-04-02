package pages.demoqa;

import com.codeborne.selenide.*;

import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class demoQAHomePage {

    //page links
     public String PAGE_LINK;
     public ElementsCollection demoQAPageLinks = $$("#app > div > div > div.home-body > div.category-cards > div");

    public void openURL(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Configuration.browserCapabilities = options;
        Configuration.browserSize = "1920x1200";
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
