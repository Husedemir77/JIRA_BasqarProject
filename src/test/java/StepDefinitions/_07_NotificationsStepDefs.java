package StepDefinitions;

import Pages.LoginPage;
import Pages.MalikPackage.MalikPage;
import Pages.Parent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class _07_NotificationsStepDefs {
    MalikPage mlk = new MalikPage();

    @And("^Click on Elements$")
    public void clickOnElements(DataTable elements) {
        List<String> clickToElements = elements.asList(String.class);
        for (int i = 0; i < clickToElements.size(); i++) {
            mlk.findElementAndClickFunction(clickToElements.get(i));
            new Parent().waiting(500);
        }
    }

    @When("^Create a new Notification$")
    public void createANewNotification() {
        mlk.findElementAndSendKeysFunction("dialogInput1", "Message2825");
        mlk.findElementAndClickFunction("typeSelectBtn");
        mlk.findElementAndClickFunction("option1");
        new Parent().waiting(500);
        mlk.findElementAndSendKeysFunction("notifDecription", "Hello World");
        mlk.findElementAndClickFunction("tabSMS");
        mlk.findElementAndClickFunction("saveButton");


    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        new LoginPage().checkTheMessage("successMessage", "successfully");
    }

    @Then("^Search for the name you created and verify it matches the result\\.$")
    public void searchForTheNameYouCreatedAndVerifyItMatchesTheResult() {
        mlk.findElementAndSendKeysFunction("dialogInput1", "Message2825");
        mlk.findElementAndClickFunction("searchButton");
        Assert.assertEquals(mlk.searchResult.getText(),"Message2825");


    }

    @And("^Edit the Notification$")
    public void editTheNotification() {
        mlk.elementMustBeClickable("editButton");
        mlk.findElementAndClickFunction("editButton");
        mlk.findElementAndSendKeysFunction("dialogInput1", "Message2828");
        mlk.findElementAndClickFunction("typeSelectBtn");
        mlk.findElementAndClickFunction("option2");
        new Parent().waiting(500);
        mlk.findElementAndSendKeysFunction("notifDecription", "Merhaba");
        mlk.findElementAndClickFunction("tabEmail");
        mlk.findElementAndClickFunction("saveButton");
    }

    @And("^Delete the Notification$")
    public void deleteTheNotification() {
        mlk.findElementAndSendKeysFunction("dialogInput1", "Message2828");
        mlk.findElementAndClickFunction("searchButton");
        mlk.elementMustBeClickable("deleteButton");
        mlk.findElementAndClickFunction("deleteButton");
        mlk.findElementAndClickFunction("yesButton");
    }

}