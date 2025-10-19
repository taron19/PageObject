package pages.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckingComponent {
    private final SelenideElement tableResponsive = $(".table-responsive");


    public CheckingComponent checkFirstNameAndLastName(String firstNameAndLastName) {
        tableResponsive.shouldHave(text(firstNameAndLastName));
        return this;
    }

    public CheckingComponent checkEmail(String email) {
        tableResponsive.shouldHave(text(email));
        return this;
    }

    public CheckingComponent checkGender(String gender) {
        tableResponsive.shouldHave(text(gender));
        return this;
    }

    public CheckingComponent checkNumber(String number) {
        tableResponsive.shouldHave(text(number));
        return this;
    }

    public CheckingComponent checkStateAndCity(String stateAndCity) {
        tableResponsive.shouldHave(text(stateAndCity));
        return this;
    }

    public CheckingComponent checkDate(String date) {
        tableResponsive.shouldHave(text(date));
        return this;
    }

    public CheckingComponent checkSubject(String subject) {
        tableResponsive.shouldHave(text(subject));
        return this;
    }

    public CheckingComponent checkHobby(String hobby) {
        tableResponsive.shouldHave(text(hobby));
        return this;
    }

    public CheckingComponent checkPictureData(String pictureName) {
        tableResponsive.shouldHave(text(pictureName));
        return this;
    }

    public CheckingComponent checkAddress(String address) {
        tableResponsive.shouldHave(text(address));
        return this;
    }


    public CheckingComponent checkFirstNameAndLastNameNegative(String unexpectedName) {
        tableResponsive.shouldNotHave(text(unexpectedName));
        return this;
    }

    public CheckingComponent checkEmailNegative(String wrongEmail) {
        tableResponsive.shouldNotHave(text(wrongEmail));
        return this;
    }

    public CheckingComponent checkGenderNegative(String wrongGender) {
        tableResponsive.shouldNotHave(text(wrongGender));
        return this;
    }

    public CheckingComponent checkNumberNegative(String wrongNumber) {
        tableResponsive.shouldNotHave(text(wrongNumber));
        return this;
    }

    public CheckingComponent checkDateNegative(String wrongDate) {
        tableResponsive.shouldNotHave(text(wrongDate));
        return this;
    }

    public CheckingComponent checkSubjectNegative(String wrongSubject) {
        tableResponsive.shouldNotHave(text(wrongSubject));
        return this;
    }

    public CheckingComponent checkHobbyNegative(String wrongHobby) {
        tableResponsive.shouldNotHave(text(wrongHobby));
        return this;
    }

    public CheckingComponent checkPictureDataNegative(String wrongPictureName) {
        tableResponsive.shouldNotHave(text(wrongPictureName));
        return this;
    }

    public CheckingComponent checkAddressNegative(String wrongAddress) {
        tableResponsive.shouldNotHave(text(wrongAddress));
        return this;
    }

    public CheckingComponent checkStateAndCityNegative(String wrongStateAndCity) {
        tableResponsive.shouldNotHave(text(wrongStateAndCity));
        return this;
    }
}
