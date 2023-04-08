package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;

public class demoQAElementsPageCheckboxTest {

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
        demoqasidebarmenu.setSidebarSub("Check Box");
    }

    @Test(priority = 4)
    @Description("Test Element Page - Checkboxes (All Selected)")
    public void testElementPageCheckboxesAllSelected(){
        demoqaelementspage.clickHomeCheckbox();
        demoqaelementspage.expandAllCheckboxes();
        Assert.assertTrue(demoqaelementspage.homeCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.desktopCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.notesCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.commandsCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.documentsCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.workspaceCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.reactCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.angularCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.veuCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.officeCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.publicCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.privateCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.classifiedCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.generalCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.downloadsCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.wordFileCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.excelFileCheckbox.isSelected());
        demoqaelementspage.clickHomeCheckbox();
    }

    @Test(priority = 5)
    @Description("Test Element Page - Checkboxes (All Un-Selected)")
    public void testElementPageCheckboxesAllUnSelected(){
        demoqaelementspage.clickHomeCheckbox();
        demoqaelementspage.clickDesktopCheckbox();
        demoqaelementspage.clickDocumentsCheckbox();
        demoqaelementspage.clickDownloadsCheckbox();
        Assert.assertFalse(demoqaelementspage.homeCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.desktopCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.notesCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.commandsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.documentsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.workspaceCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.reactCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.angularCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.veuCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.officeCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.publicCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.privateCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.classifiedCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.generalCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.downloadsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.wordFileCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.excelFileCheckbox.isSelected());
    }

    @Test(priority = 6)
    @Description("Test Element Page - Checkboxes (Partial Selected)")
    public void testElementPageCheckboxesPartiallySelected(){
        demoqaelementspage.commandsCheckboxSVG.click();
        demoqaelementspage.reactCheckboxSVG.click();
        demoqaelementspage.publicCheckboxSVG.click();
        demoqaelementspage.privateCheckboxSVG.click();
        demoqaelementspage.excelFileCheckboxSVG.click();
        demoqaelementspage.checkboxCollapseAll.click();
        demoqaelementspage.checkboxExpandAll.click();
        Assert.assertFalse(demoqaelementspage.homeCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.desktopCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.notesCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.commandsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.documentsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.workspaceCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.reactCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.angularCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.veuCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.officeCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.publicCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.privateCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.classifiedCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.generalCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.downloadsCheckbox.isSelected());
        Assert.assertFalse(demoqaelementspage.wordFileCheckbox.isSelected());
        Assert.assertTrue(demoqaelementspage.excelFileCheckbox.isSelected());
    }

}