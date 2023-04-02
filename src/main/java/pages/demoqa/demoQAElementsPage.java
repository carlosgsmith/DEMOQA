package pages.demoqa;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.security.KeyStore;
import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class demoQAElementsPage {

    //Text-Box Form Element Definitions & Methods
    public String RETURNED_USER_NAME;
    public String RETURNED_USER_EMAIL;
    public String RETURNED_USER_CURRENT_ADDRESS;
    public String RETURNED_USER_PERMANENT_ADDRESS;

    public SelenideElement userNameInputField = $("#userName");
    public SelenideElement userEmailInputField = $("#userEmail");
    public SelenideElement currentAddressInputField = $("#currentAddress");
    public SelenideElement permanentAddressInputField = $("#permanentAddress");

    public SelenideElement submittedUserName = $("#name");
    public SelenideElement submittedUserEmail = $("#email");
    public SelenideElement submittedCurrentAddress = $("#currentAddress.mb-1");
    public SelenideElement submittedPermanentAddress = $("#permanentAddress.mb-1");
    public SelenideElement submitButton = $("#submit");

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
        submitButton.shouldBe(visible, Duration.ofSeconds(10)).click();
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



    //Check Box String & Methods

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

}
