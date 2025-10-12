package logic.demoqa.form;

import com.codeborne.selenide.SelenideElement;
import pages.component.CheckingComponent;
import pages.component.FormComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormFillingPage {
    private final SelenideElement userName = $("#userName");
    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement permanentAddress = $("#permanentAddress");
    private final SelenideElement submit = $("#submit");
    private final FormComponent formComponent = new FormComponent();
    private final CheckingComponent checkingComponent = new CheckingComponent();


    public FormFillingPage openPage() {
        open("/text-box");
        return this;
    }

    public FormFillingPage setUserName(String userName) {
        this.userName.setValue(userName);
        return this;
    }
    public FormFillingPage setuserEmail(String userEmail) {
        this.userEmail.setValue(userEmail);
        return this;
    }
    public FormFillingPage setcurrentAddress(String currentAddress) {
        this.currentAddress.setValue(currentAddress);
        return this;
    }
    public FormFillingPage setPermanentAddres(String permanentAddres) {
        this.permanentAddress.setValue(permanentAddres);
        submit.click();
        return this;
    }

    public FormComponent getFormComponent() {
        return formComponent;
    }

    public CheckingComponent getCheckingComponent() {
        return checkingComponent;
    }
}
