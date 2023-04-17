package elementspage.test;

import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;


public class demoQAElementsPageBrokenLinksImagesTest {


    demoQAHomePage demoqahomepage = new demoQAHomePage();
    demoQASidebarMenu demoqasidebarmenu = new demoQASidebarMenu();
    demoQAElementsPage demoqaelementspage = new demoQAElementsPage();


    @Test
    @Description("Confirm Images on Page Not Broken")
    public void confirmIValidImageNotBroken() {
        demoqahomepage.openURL();
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Broken Links - Images");
        demoqaelementspage.checkImageDisplayed(demoqaelementspage.validImageURL);
        Assert.assertTrue(demoqaelementspage.IS_IMAGE_NOT_BROKEN);
    }

    @Test
    @Description("Confirm Broken Image is Broken")
    public void confirmBrokenImageIsBroken() {
        demoqahomepage.openURL();
        demoqahomepage.clickLinkOnHomePage(0);
        demoqasidebarmenu.setSidebarSub("Broken Links - Images");
        demoqaelementspage.checkImageDisplayed(demoqaelementspage.brokenImageURL);
        Assert.assertTrue(demoqaelementspage.IS_IMAGE_NOT_BROKEN);

    }
}