package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;

import static com.codeborne.selenide.Condition.*;


public class demoQAElementsPageRadioButtonTest {

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
    public void testElementsPageLinksOpen() {
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Radio Button");
    }
    @Test(priority = 4)
    @Description("Verify Yes Radio Buttons Selected, Impressive & No Buttons Not Selected")
    public void testElementsPageYesRadioButton() {
        demoqaelementspage.clickYesRadioButtonLabel();
        Assert.assertTrue(demoqaelementspage.yesRadioButton.is(selected)
        &!demoqaelementspage.impressiveRadioButton.is(selected)&!demoqaelementspage.noRadioButton.is(selected));
    }

    @Test(priority = 5)
    @Description("Verify Impressive Radio Buttons Selected, Yes & No Buttons Not Selected")
    public void testElementsPageImpressiveRadioButton() {
          demoqaelementspage.clickImpressiveRadioButtonLabel();
          Assert.assertTrue(demoqaelementspage.impressiveRadioButton.is(selected)
          &!demoqaelementspage.yesRadioButton.is(selected)&!demoqaelementspage.noRadioButton.is(selected));
    }

    @Test(priority = 6)
    @Description("Verify No Radio Buttons Selected, Yes & Impressive Buttons Not Selected")
    public void testElementsPageNoRadioButton(){
          demoqaelementspage.clickNoRadioButtonLabel();
          Assert.assertTrue(demoqaelementspage.noRadioButton.is(selected)
          &!demoqaelementspage.yesRadioButton.is(selected)&!demoqaelementspage.impressiveRadioButton.is(selected));
    }
}