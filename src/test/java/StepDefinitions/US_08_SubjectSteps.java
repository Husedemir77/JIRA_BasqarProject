package StepDefinitions;

import Pages.Yusuf_Pages.DialogContent;
import Pages.Yusuf_Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class US_08_SubjectSteps {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate a new Subject create and save$")
    public void navigateANewSubjectcreateAndSave(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create a new Subject send Keys$")
    public void createANewSubjectSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^new Subject  click function$")
    public void newSubjectClickFunction(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create a new Subject send businessTurkish$")
    public void createANewSubjectSendbusinessTurkish() {
        dialogContent.selectSubject("Busines Turkish Language Lesson");
    }

    @And("^Delete Subject function$")
    public void deleteSubjectFunction(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {


            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
