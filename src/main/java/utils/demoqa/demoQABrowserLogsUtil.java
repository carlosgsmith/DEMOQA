package utils.demoqa;

import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;


import static com.codeborne.selenide.WebDriverRunner.driver;

public class demoQABrowserLogsUtil {

    public int RESPONSE_STATUS_CODE;
    public String RESPONSE_STATUS_MESSAGE;

    public String getAPIRequest(String testThisURL) throws Exception {

        ChromeDriver driver = (ChromeDriver) driver().getWebDriver();
        driver.get(testThisURL);

        String currentURL = driver.getCurrentUrl();
        URL url = new URL(currentURL);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        if(!HttpURLConnection.getDefaultAllowUserInteraction()){
            HttpURLConnection.setDefaultAllowUserInteraction(true);
        }
        con.setRequestMethod("GET");

        RESPONSE_STATUS_CODE = con.getResponseCode();
        RESPONSE_STATUS_MESSAGE = con.getResponseMessage();

        driver.quit();

        return RESPONSE_STATUS_MESSAGE;
    }
}
