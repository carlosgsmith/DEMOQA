package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;


public class demoQAElementsPageTextBoxTest {

    demoQAHomePage demoqahomepage = new demoQAHomePage();
    demoQASidebarMenu demoqasidebarmenu = new demoQASidebarMenu();

    demoQAElementsPage demoqaelementspage = new demoQAElementsPage();


    @Test()
    @Description("Open DEMOQA URL")
    public void openDemoQAURL(){
        demoqahomepage.openURL();
    }

    @Test(dataProvider = "dp.demoQADataProvider", dataProviderClass = demoQADataProvider.class)
    @Description("Verify DEMOQA Links Available")
    public void testElementsPageLinks(int x, String page_links){
        demoqahomepage.getHomePageLinksText(x);
        Assert.assertEquals(demoqahomepage.PAGE_LINK, page_links);
    }

    @Test()
    @Description("Open Test Elements Link")
    public void testElementsPageLinksOpen(){
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Text Box");
    }

    @Test (dataProvider = "demoQAElementsPageTextBox", dataProviderClass = demoQADataProvider.class)
    @Description("Test Elements Page - Text Box Form")
    public void testElementsPageTextBoxForm(String un, String em, String ca, String pa) {
        demoqaelementspage.setUserName(un);
        demoqaelementspage.setUserEmail(em);
        demoqaelementspage.setUserCurrentAddress(ca);
        demoqaelementspage.setUserPermanentAddress(pa);
        demoqaelementspage.clickSubmitButton();
        demoqaelementspage.getUserName();
        demoqaelementspage.getUserEmail();
        demoqaelementspage.getUserCurrentAddress();
        demoqaelementspage.getUserPermanentAddress();
        demoqaelementspage.clearUsername();
        demoqaelementspage.clearUserEmail();
        demoqaelementspage.clearCurrentAddress();
        demoqaelementspage.clearPermanentAddress();
        Assert.assertEquals(demoqaelementspage.RETURNED_USER_NAME, un);
        Assert.assertEquals(demoqaelementspage.RETURNED_USER_EMAIL, em);
        Assert.assertEquals(demoqaelementspage.RETURNED_USER_CURRENT_ADDRESS, ca);
        Assert.assertEquals(demoqaelementspage.RETURNED_USER_PERMANENT_ADDRESS, pa);
    }

    @Test(dataProvider = "demoQAElementsPageTextBoxInvalidEmails", dataProviderClass = demoQADataProvider.class)
    @Description("Test Elements Page - Text Box Form Invalid Emails")
    public void testElementsPageTextBoxFormInvalidEmails(String iem){
        demoqaelementspage.setUserEmail(iem);
        demoqaelementspage.clickSubmitButton();
        demoqaelementspage.getUserEmail();
        demoqaelementspage.clearUserEmail();
        Assert.assertNotEquals(demoqaelementspage.RETURNED_USER_EMAIL, iem);
    }

}