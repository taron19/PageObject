package pages.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckingComponent {
    private final SelenideElement tableResponsive = $(".table-responsive");


    public void checkFirstNameAndLastName(String firstNameAndLastName) {
        tableResponsive.shouldHave(text(firstNameAndLastName));
    }

    public void checkEmail(String email) {
        tableResponsive.shouldHave(text(email));
    }

    public void checkGender(String gender) {
        tableResponsive.shouldHave(text(gender));
    }

    public void checkNumber(String number) {
        tableResponsive.shouldHave(text(number));
    }

    public void checkDate(String date) {
        tableResponsive.shouldHave(text(date));
    }

    public void checkSubject(String subject) {
        tableResponsive.shouldHave(text(subject));
    }

    public void checkHobby(String hobby) {
        tableResponsive.shouldHave(text(hobby));
    }

    public void checkPictureData(String pictureName) {
        tableResponsive.shouldHave(text(pictureName));
    }

    public void checkAddress(String address) {
        tableResponsive.shouldHave(text(address));
    }

    public void checkStateAndCity(String stateAndCity) {
        tableResponsive.shouldHave(text(stateAndCity));
    }

    public void checkFirstNameAndLastNameNegative(String unexpectedName) {
        tableResponsive.shouldNotHave(text(unexpectedName));
    }

    public void checkEmailNegative(String wrongEmail) {
        tableResponsive.shouldNotHave(text(wrongEmail));
    }

    public void checkGenderNegative(String wrongGender) {
        tableResponsive.shouldNotHave(text(wrongGender));
    }

    public void checkNumberNegative(String wrongNumber) {
        tableResponsive.shouldNotHave(text(wrongNumber));
    }

    public void checkDateNegative(String wrongDate) {
        tableResponsive.shouldNotHave(text(wrongDate));
    }

    public void checkSubjectNegative(String wrongSubject) {
        tableResponsive.shouldNotHave(text(wrongSubject));
    }

    public void checkHobbyNegative(String wrongHobby) {
        tableResponsive.shouldNotHave(text(wrongHobby));
    }

    public void checkPictureDataNegative(String wrongPictureName) {
        tableResponsive.shouldNotHave(text(wrongPictureName));
    }

    public void checkAddressNegative(String wrongAddress) {
        tableResponsive.shouldNotHave(text(wrongAddress));
    }

    public void checkStateAndCityNegative(String wrongStateAndCity) {
        tableResponsive.shouldNotHave(text(wrongStateAndCity));
    }
}
