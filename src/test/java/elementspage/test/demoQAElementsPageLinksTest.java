package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;
import utils.demoqa.demoQABrowserLogsUtil;
import utils.demoqa.demoQASwitchTabsUtil;


public class demoQAElementsPageLinksTest extends demoQABrowserLogsUtil{

    demoQAHomePage demoqahomepage = new demoQAHomePage();
    demoQASidebarMenu demoqasidebarmenu = new demoQASidebarMenu();
    demoQAElementsPage demoqaelementspage = new demoQAElementsPage();
    demoQASwitchTabsUtil demoqaswitchtabsutil = new demoQASwitchTabsUtil();


    @Test(dataProvider = "demoQAElementsPageLinksApiCalls", dataProviderClass = demoQADataProvider.class)
    @Description("API Calls")
    public void confirmAPIResults(String apiLinkToCall, int expectedResponseCode, String expectedResponseMessage) throws Exception{
        demoqahomepage.openURL();
        getAPIRequest(apiLinkToCall);
        Assert.assertEquals(RESPONSE_STATUS_CODE, expectedResponseCode);
        Assert.assertEquals(RESPONSE_STATUS_MESSAGE, expectedResponseMessage);
    }

    @Test
    @Description("Click link that opens new tab")
    public void confirmTabOpens(){
        demoqahomepage.openURL();
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Links");
        demoqaelementspage.clickLinksPageHomeLink();
        demoqaswitchtabsutil.switchTab(0);
        demoqaelementspage.clickLinksPageDynamicLink();

        Assert.assertEquals(demoqaswitchtabsutil.TABS.size(), 2);
    }
}