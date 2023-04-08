package elementspage.test;

import dp.demoQADataProvider;
import jdk.jfr.Description;
import menus.demoqa.demoQASidebarMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.demoQAElementsPage;
import pages.demoqa.demoQAHomePage;

public class demoQAElementsPageWebTablesTest {

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
        demoqasidebarmenu.setSidebarSub("Web Tables");
    }

    @Test(priority = 4)
    @Description("Verify Web Table Row Can be ReSized")
    public void testElementsPageWebTableResize(){
        demoqaelementspage.expandWebTableRows(50);//option can be 5, 10, 20, 25, 50, 100
        Assert.assertEquals(demoqaelementspage.webTableRowsDropdownMenu.text(), "50 rows");
        Assert.assertEquals(demoqaelementspage.webTableRows.size(), 50);
    }

    @Test(priority = 5)
    @Description("Verify Web Table Record Can be Edited")
    public void testElementsPageWebTableEdits(){
        demoqaelementspage.searchWebTableRecords("Alden");
        demoqaelementspage.getCurrentRecord("Alden");
        Assert.assertTrue(demoqaelementspage.CURRENT_RECORD.contains("Alden") );
        demoqaelementspage.clickEditRecordsButton();
        demoqaelementspage.editWebTableRow("alden@updated.com", 24000);
        demoqaelementspage.clickRegistrationFormSubmitButton();
        demoqaelementspage.getCurrentRecord("Alden");
        Assert.assertTrue(demoqaelementspage.CURRENT_RECORD.contains("alden@updated.com"));
        Assert.assertTrue(demoqaelementspage.CURRENT_RECORD.contains(String.valueOf(24000)));
        demoqaelementspage.clearSearchInputField();
    }

    @Test(priority = 6)
    @Description("Verify Web Table Record Can be Edited")
    public void testElementsPageWebTableDelete() {
        demoqaelementspage.searchWebTableRecords("Vega");
        demoqaelementspage.clickDeleteRecordsButton();
        demoqaelementspage.clearSearchInputField();
        Assert.assertFalse(demoqaelementspage.webTableRows.contains("Vega"));
    }

    @Test(priority = 7, dataProvider = "demoQAElementsPageWebTableAdd", dataProviderClass = demoQADataProvider.class)
    @Description("Verify Web Table Records can be Added")
    public void testElementsPageWebTableAdd(String fns, String lns, String ems, int ai, int si, String dps){
        demoqaelementspage.clickAddRecordsButton();
        demoqaelementspage.setNewRecordFirstName(fns);
        demoqaelementspage.setNewRecordLastName(lns);
        demoqaelementspage.setNewRecordEmail(ems);
        demoqaelementspage.setNewRecordAge(ai);
        demoqaelementspage.setNewRecordSalary(si);
        demoqaelementspage.setNewRecordDepartment(dps);
        demoqaelementspage.clickSubmitButton();
    }

    @Test(priority = 8)
    @Description("Verify Web Table Records Added To Table")
    public void testElementsPageWebTableRecordsAdded() {
        demoqaelementspage.getNumberOfRecordsInTable();
        Assert.assertTrue(demoqaelementspage.NUMBER_OF_RECORDS > 25);
    }
}