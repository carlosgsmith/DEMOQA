package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAHomePage;
import utils.demoqa.demoQABrowserLogsUtil;


public class demoQAElementsPageLinksTest extends demoQABrowserLogsUtil{

    demoQAHomePage demoqahomepage = new demoQAHomePage();

    @Test(dataProvider = "demoQAElementsPageLinksApiCalls", dataProviderClass = demoQADataProvider.class)
    @Description("API Calls")
    public void confirmAPIResults(String apiLinkToCall, int expectedResponseCode, String expectedResponseMessage) throws Exception{
        demoqahomepage.openURL();
        getAPIRequest(apiLinkToCall);
        Assert.assertEquals(RESPONSE_STATUS_CODE, expectedResponseCode);
        Assert.assertEquals(RESPONSE_STATUS_MESSAGE, expectedResponseMessage);
    }

}