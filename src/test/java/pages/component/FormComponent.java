package pages.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FormComponent {

    public void nameCheck(String name) {
        $("#output #name").shouldHave(Condition.text(name));
    }

    public void nameEmailCheck(String email) {
        $("#output #email").shouldHave(Condition.text(email));
    }

    public void nameCurrentAddressCheck(String address) {
        $("#output #currentAddress").shouldHave(Condition.text(address));
    }

    public void namePermanentAddressCheck(String permanentAddress) {
        $("#output #permanentAddress").shouldHave(Condition.text(permanentAddress));
    }

    public void nameCheckNegative(String unexpectedName) {
        $("#output #name").shouldNotHave(Condition.text(unexpectedName));
    }

    public void emailCheckNegative(String unexpectedEmail) {
        $("#output #email").shouldNotHave(Condition.text(unexpectedEmail));
    }

    public void currentAddressCheckNegative(String unexpectedAddress) {
        $("#output #currentAddress").shouldNotHave(Condition.text(unexpectedAddress));
    }

    public void permanentAddressCheckNegative(String unexpectedPermanentAddress) {
        $("#output #permanentAddress").shouldNotHave(Condition.text(unexpectedPermanentAddress));
    }
}
