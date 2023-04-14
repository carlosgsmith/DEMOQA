package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;


public class demoQAElementsPageButtonsTest {
    demoQAHomePage demoqahomepage = new demoQAHomePage();
    demoQASidebarMenu demoqasidebarmenu = new demoQASidebarMenu();
    demoQAElementsPage demoqaelementspage = new demoQAElementsPage();

    @Test(priority = 1)
    @Description("Open DEMOQA URL")
    public void openDemoQAURL(){
        demoqahomepage.openURL();
    }

    @Test(priority = 2, dataProvider = "dp.demoQADataProvider", dataProviderClass = demoQADataProvider.class)
    @Description("Verify DEMOQA Links Available")
    public void testElementsPageLinks(int x, String page_links){
        demoqahomepage.getHomePageLinksText(x);
        Assert.assertEquals(demoqahomepage.PAGE_LINK, page_links);
    }

    @Test(priority = 3)
    @Description("Open Test Elements Link")
    public void testElementsPageLinksOpen(){
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Buttons");
    }

    @Test(priority = 4)
    @Description("Verify Double Click Button, Right Click Button, and Dynamic Click Button")
    public void testElementsPageButtons(){
        demoqaelementspage.doDoubleClick();
        demoqaelementspage.getDoubleClickReturnedMessage();
        demoqaelementspage.doRightClick();
        demoqaelementspage.getRightClickMessage();
        demoqaelementspage.doDynamicClick();
        demoqaelementspage.getDynamicClickMessage();
    }
}