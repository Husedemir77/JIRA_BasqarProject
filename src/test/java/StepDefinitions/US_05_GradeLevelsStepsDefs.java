package StepDefinitions;

import Pages.HüseyinPackage.HuseyinPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class US_05_GradeLevelsStepsDefs {

    HuseyinPage gradeLevels=new HuseyinPage();

    @Given("^Navigate to Grade Levels Page$")
    public void navigateToGradeLevelsPage(DataTable elements) {

        List<String > clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {
            gradeLevels.findElementAndClickFunction(clickElements.get(i));
        }

    }

    @When("^Create a Grade Levels$")
    public void createAGradeLevels(DataTable elements) {

        gradeLevels.waitUntilNeed("btnAdd");
        gradeLevels.findElementAndClickFunction("btnAdd");

        List<List<String >> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {

            gradeLevels.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }
        gradeLevels.findElementAndClickFunction("btnSave");


    }

    @And("^Check control whether succesfully message displayed$")
    public void checkControlWhetherSuccesfullyMessageDisplayed() {


    }

    @When("^Update the same Grade Levels$")
    public void updateTheSameGradeLevels() {


    }

    @When("^Delete the edited Grade Levels$")
    public void deleteTheEditedGradeLevels() {


    }
}
