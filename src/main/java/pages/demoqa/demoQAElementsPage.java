package pages.demoqa;

import com.codeborne.selenide.*;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.demoqa.demoQABrowserLogsUtil;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class demoQAElementsPage extends demoQABrowserLogsUtil{

    public String RETURNED_USER_NAME;
    public String RETURNED_USER_EMAIL;
    public String RETURNED_USER_CURRENT_ADDRESS;
    public String RETURNED_USER_PERMANENT_ADDRESS;
    public String CURRENT_RECORD;
    public int NUMBER_OF_RECORDS;

    public SelenideElement userNameInputField = $("#userName");
    public SelenideElement userEmailInputField = $("#userEmail");
    public SelenideElement currentAddressInputField = $("#currentAddress");
    public SelenideElement permanentAddressInputField = $("#permanentAddress");
    public SelenideElement submittedUserName = $("#name");
    public SelenideElement submittedUserEmail = $("#email");
    public SelenideElement submittedCurrentAddress = $("#currentAddress.mb-1");
    public SelenideElement submittedPermanentAddress = $("#permanentAddress.mb-1");
    public SelenideElement submitButton = $("#submit");

    //Check-box Element Definitions
    public SelenideElement homeCheckboxSVG = $("#tree-node > ol > li > span > label > span.rct-checkbox > svg");
    public SelenideElement desktopCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement notesCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement commandsCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement documentsCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement workspaceCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement reactCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement angularCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement veuCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    public SelenideElement officeCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement publicCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement privateCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement classifiedCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    public SelenideElement generalCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(4) > span > label > span.rct-checkbox > svg");
    public SelenideElement downloadsCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    public SelenideElement wordFileCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public SelenideElement excelFileCheckboxSVG = $("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public SelenideElement homeCheckbox = $("#tree-node-home");
    public SelenideElement desktopCheckbox = $("#tree-node-desktop");
    public SelenideElement notesCheckbox = $("#tree-node-notes");
    public SelenideElement commandsCheckbox = $("#tree-node-commands");
    public SelenideElement documentsCheckbox = $("#tree-node-documents");
    public SelenideElement workspaceCheckbox = $("#tree-node-workspace");
    public SelenideElement reactCheckbox = $("#tree-node-react");
    public SelenideElement angularCheckbox = $("#tree-node-angular");
    public SelenideElement veuCheckbox = $("#tree-node-veu");
    public SelenideElement officeCheckbox = $("#tree-node-office");
    public SelenideElement publicCheckbox = $("#tree-node-public");
    public SelenideElement privateCheckbox = $("#tree-node-private");
    public SelenideElement classifiedCheckbox = $("#tree-node-classified");
    public SelenideElement generalCheckbox = $("#tree-node-general");
    public SelenideElement downloadsCheckbox = $("#tree-node-downloads");
    public SelenideElement wordFileCheckbox = $("#tree-node-wordFile");
    public SelenideElement excelFileCheckbox = $("#tree-node-excelFile");
    public SelenideElement checkboxExpandAll = $("#tree-node > div > button.rct-option.rct-option-expand-all > svg");
    public SelenideElement checkboxCollapseAll = $("#tree-node > div > button.rct-option.rct-option-collapse-all > svg");
    public SelenideElement homeToggle = $("#tree-node > ol > li > span > button > svg");
    public SelenideElement desktopToggle = $("#tree-node > ol > li > ol > li:nth-child(1) > span > button > svg");
    public SelenideElement documentsToggle = $("#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg");
    public SelenideElement workspaceToggle = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > button > svg");
    public SelenideElement officeToggle = $("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > button > svg");
    public SelenideElement downloadsToggle = $("#tree-node > ol > li > ol > li:nth-child(3) > span > button > svg");

    /*Radio Button Element Definitions*/
    public SelenideElement yesRadioButtonLabel = $(By.cssSelector("label[class='custom-control-label'][for='yesRadio']"));
    public SelenideElement impressiveRadioButtonLabel = $(By.cssSelector("label[class='custom-control-label'][for='impressiveRadio']"));
    public SelenideElement noRadioButtonLabel = $(By.cssSelector("label[class='custom-control-label'][for='noRadio']"));
    public SelenideElement yesRadioButton = $("#yesRadio");
    public SelenideElement impressiveRadioButton = $("#impressiveRadio");
    public SelenideElement noRadioButton = $("#noRadio");

    /*Web Tables Element Definition*/
    public SelenideElement webTableAddButton = $("#addNewRecordButton");
    public SelenideElement webTableSearchInputField = $("#searchBox");
    public SelenideElement webTableRowsDropdownMenu = $("#app > div > div > div.row > " +
            "div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > " +
            "div.pagination-bottom > div > div.-center > span.select-wrap.-pageSizeOptions > select");
    public SelenideElement registrationFormText = $("#registration-form-modal");
    public SelenideElement registrationFormFirstNameInputField = $("#firstName");
    public SelenideElement registrationFormLastNameInputField = $("#lastName");
    public SelenideElement registrationFormEmailInputField = $("#userEmail");
    public SelenideElement registrationFormAgeInputField = $("#age");
    public SelenideElement registrationFormSalaryInputField = $("#salary");
    public SelenideElement registrationFormDepartmentInputField = $("#department");
    public SelenideElement registrationFormSubmitButton = $("#submit");

    /* Button Page Element Definitions*/
    public SelenideElement doubleClickButton = $("#doubleClickBtn");
    public SelenideElement rightClickButton = $("#rightClickBtn");
    public ElementsCollection dynamicClickButton = $$("#app > div.body-height > div.container.playgound-body > " +
            "div.row > div.col-12.mt-4.col-md-6 > div > div.mt-4 > button");
    public SelenideElement doubleClickButtonReturnedText = $("#doubleClickMessage");
    public SelenideElement rightClickButtonReturnedText = $("#rightClickMessage");
    public SelenideElement dynamicClickButtonReturnedText = $("#dynamicClickMessage");

    /*Links Page Element Definitions*/
    public SelenideElement homeLink = $("#simpleLink");
    public SelenideElement homeDynamicLink = $("#dynamicLink");
    public SelenideElement createdLink = $("#created");
    public SelenideElement noContentLink = $("#no-content");
    public SelenideElement movedLink = $("#moved");
    public SelenideElement badRequestLink = $("#bad-request");
    public SelenideElement unauthorizedLink = $("#unauthorized");
    public SelenideElement forbiddenLink = $("#forbidden");
    public SelenideElement notFoundLink = $("#invalid-url");


    /*TextBox Methods*/
    public void setUserName(String user_name){
        userNameInputField.shouldBe(visible, Duration.ofSeconds(10)).sendKeys(user_name);
    }

    public void setUserEmail(String user_email){
        userEmailInputField.shouldBe(visible, Duration.ofSeconds(10)).sendKeys(user_email);
    }

    public void setUserCurrentAddress(String user_current_address){
        currentAddressInputField.shouldBe(visible, Duration.ofSeconds(10)).sendKeys(user_current_address);
    }

    public void setUserPermanentAddress(String user_permanent_address){
        permanentAddressInputField.shouldBe(visible, Duration.ofSeconds(10)).sendKeys(user_permanent_address);
    }

    public String getUserName(){
        RETURNED_USER_NAME = submittedUserName.shouldBe(visible, Duration.ofSeconds(10)).text();
        RETURNED_USER_NAME = RETURNED_USER_NAME.split("\\(")[0].replace("Name:","");
        return RETURNED_USER_NAME;
    }

    public String getUserEmail(){
        RETURNED_USER_EMAIL = submittedUserEmail.shouldBe(visible, Duration.ofSeconds(10)).text();
        RETURNED_USER_EMAIL = RETURNED_USER_EMAIL.split("\\(")[0].replace("Email:", "");
        return RETURNED_USER_EMAIL;
    }

    public String getUserCurrentAddress(){
        RETURNED_USER_CURRENT_ADDRESS = submittedCurrentAddress.shouldBe(visible, Duration.ofSeconds(10)).text();
        RETURNED_USER_CURRENT_ADDRESS = RETURNED_USER_CURRENT_ADDRESS.split("\\(")[0].replace("Current Address :", "");
        return RETURNED_USER_CURRENT_ADDRESS;
    }

    public String getUserPermanentAddress(){
        RETURNED_USER_PERMANENT_ADDRESS = submittedPermanentAddress.shouldBe(visible, Duration.ofSeconds(10)).text();
        RETURNED_USER_PERMANENT_ADDRESS = RETURNED_USER_PERMANENT_ADDRESS.split("\\(")[0].replace("Permananet Address :", "");
        return RETURNED_USER_PERMANENT_ADDRESS;
    }

    public void clickSubmitButton(){
        actions().moveToElement(submitButton).click().build().perform();
    }

    public void clearUsername(){ userNameInputField.clear(); }

    public void clearUserEmail(){
        userEmailInputField.clear();
    }

    public void clearCurrentAddress(){
        currentAddressInputField.clear();
    }

    public void clearPermanentAddress(){
        permanentAddressInputField.clear();
    }

    public void clickHomeCheckbox(){
        homeCheckboxSVG.should(visible, Duration.ofSeconds(10)).click();
    }

    public void clickDesktopCheckbox(){
        desktopCheckboxSVG.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickDocumentsCheckbox(){
        documentsCheckboxSVG.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickDownloadsCheckbox(){
        downloadsCheckboxSVG.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickExcelFileCheckbox(){
        excelFileCheckboxSVG.should(visible, Duration.ofSeconds(10)).click();
    }

    public void expandAllCheckboxes(){
        checkboxExpandAll.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    //TODO: Create a clear all method for checkboxes. The method has to iterate thru the tree, determine which node is
    // checked, then uncheck it

    public void clickYesRadioButtonLabel(){
        yesRadioButtonLabel.shouldBe(visible, Duration.ofSeconds(10)).click();
    }
    public void clickImpressiveRadioButtonLabel(){
        impressiveRadioButtonLabel.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickNoRadioButtonLabel(){
        noRadioButtonLabel.shouldBe(visible, Duration.ofSeconds(10)).click();
    }
   /*WebTable Methods*/
    public ElementsCollection webTableRows = $$("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > " +
            "div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div.rt-tr-group");

    public ElementsCollection actionButtons = $$("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > " +
            "div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > " +
            "div.rt-tr-group > div.rt-tr.-odd > div.rt-td > div.action-buttons > span > svg");

    public void expandWebTableRows(int numberOfRowsToSet){
        webTableRowsDropdownMenu.shouldBe(visible, Duration.ofSeconds(10)).click();
        webTableRowsDropdownMenu.$("[value='"+numberOfRowsToSet+"']").click();
    }

    public void searchWebTableRecords(String searchRecordsFor){
        webTableSearchInputField.shouldBe(visible, Duration.ofSeconds(10)).sendKeys(searchRecordsFor);
    }

    public void clickEditRecordsButton(){
        actionButtons.get(0).click();
    }

    public void clickDeleteRecordsButton(){
        actionButtons.get(1).click();
    }

    public void clickAddRecordsButton(){
        webTableAddButton.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clearSearchInputField(){
        webTableSearchInputField.click();
        webTableSearchInputField.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
    }

    public void setNewRecordFirstName(String newRecordFirstName){
        registrationFormFirstNameInputField.sendKeys(newRecordFirstName);
    }

    public void setNewRecordLastName(String newRecordLastName){
        registrationFormLastNameInputField.sendKeys(newRecordLastName);
    }

    public void setNewRecordEmail(String newRecordEmail){
        registrationFormEmailInputField.sendKeys(newRecordEmail);
    }

    public void setNewRecordAge(int newRecordAge){
        registrationFormAgeInputField.sendKeys(String.valueOf(newRecordAge));
    }

    public void setNewRecordSalary(int newRecordSalary){
        registrationFormSalaryInputField.sendKeys(String.valueOf(newRecordSalary));
    }

    public void setNewRecordDepartment(String newRecordDepartment){
        registrationFormDepartmentInputField.sendKeys(newRecordDepartment);
    }

    public void clickRegistrationFormSubmitButton(){
        registrationFormSubmitButton.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void editWebTableRow(String newEmail, int newSalary){
        registrationFormText.shouldHave(exactText("Registration Form")).shouldBe(visible, Duration.ofSeconds(10));
        registrationFormEmailInputField.clear();
        registrationFormEmailInputField.sendKeys(newEmail);
        registrationFormSalaryInputField.clear();
        registrationFormSalaryInputField.sendKeys(String.valueOf(newSalary));
    }

    public String getCurrentRecord(String firstNameOnRecord){
        CURRENT_RECORD = webTableRows.filterBy(new Text(firstNameOnRecord)).get(0).text();
        return CURRENT_RECORD;
    }

    public int getNumberOfRecordsInTable(){
        NUMBER_OF_RECORDS = webTableRows.filterBy(new Text("@")).size();
        return NUMBER_OF_RECORDS;
    }

    /*Button Page Methods*/
    public void doDoubleClick(){
        doubleClickButton.shouldBe(visible, Duration.ofSeconds(10)).doubleClick();
    }

    public void doRightClick(){
        rightClickButton.shouldBe(visible, Duration.ofSeconds(10)).contextClick();
    }

    public void doDynamicClick(){
        dynamicClickButton.filterBy(exactText("Click Me")).get(0).click();
    }

    public void getDoubleClickReturnedMessage(){
        doubleClickButtonReturnedText.shouldHave(exactText("You have done a double click"), Duration.ofSeconds(10));
    }

    public void getRightClickMessage(){
        rightClickButtonReturnedText.shouldHave(exactText("You have done a right click"), Duration.ofSeconds(10));
    }

    public void getDynamicClickMessage(){
        dynamicClickButtonReturnedText.shouldHave(exactText("You have done a dynamic click"), Duration.ofSeconds(10));
    }

    /*Links Page Methods*/
    public void clickLinksPageHomeLink(){
        homeLink.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickLinksPageDynamicLink(){
        homeDynamicLink.shouldBe(visible, Duration.ofSeconds(10)).click();
    }
}
