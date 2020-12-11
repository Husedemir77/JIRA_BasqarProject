package StepDefinitions;

import Pages.Yusuf_Pages.DialogContent;
import cucumber.api.java.en.And;

public class US_08_TC_04_Edit {

    DialogContent dialogContent = new DialogContent();


    @And("^Create a new UserType Choice Student$")
    public void createANewUserTypeChoiceStudent() {

        dialogContent.selectSubject("Student");

    }
}
