package StepDefinitions;

import Pages.Yusuf_Pages.DialogContent;
import cucumber.api.java.en.And;

public class US_08_TC_02_CreateANewItemCategory {

    DialogContent dialogContent = new DialogContent();

    @And("^Create a new UserType Choice Administrator$")
    public void createANewUserTypeChoiceAdministrator() {

        dialogContent.selectSubject("Administrator");

    }
}
