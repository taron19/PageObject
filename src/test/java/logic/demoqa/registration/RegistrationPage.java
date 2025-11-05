package logic.demoqa.registration;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.component.CalendarComponent;
import pages.component.CheckingComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement genterWrapper = $("#genterWrapper");
    private final SelenideElement userNumber = $("#userNumber");
    private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private final SelenideElement subject = $("#subjectsInput");
    private final SelenideElement hobbies =  $("#hobbiesWrapper");
    private final SelenideElement upload = $("#uploadPicture");
    private final SelenideElement address = $("#currentAddress");
    private final SelenideElement state =  $("#state");
    private final SelenideElement city =  $("#city");
    private final SelenideElement submit = $("#submit");
    private final CalendarComponent calendarComponent = new CalendarComponent();
    private final CheckingComponent checkingComponent = new CheckingComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        // executeJavaScript("const iframe = document.querySelector('iframe[id^=google_ads_iframe]'); if(iframe) iframe.remove();");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        this.firstName.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        this.lastName.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String userEmail) {
        this.userEmail.setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        SelenideElement element = this.genterWrapper.$(byText(gender));
        element.scrollIntoView(true).click();
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {
        this.userNumber.setValue(userNumber);
        return this;
    }

    public RegistrationPage setDateOfBirthInput(String year, String month, String day) {
        this.dateOfBirthInput.click();
        calendarComponent.setDate(year, month, day);
        return this;
    }

    public RegistrationPage setSubject(String subject) {
        this.subject.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String hobbies) {
        this.hobbies.$(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage setPicture(String fileName) {
        this.upload.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        this.address.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        this.state.click();
        SelenideElement element = $(byText(state));
        //элементы веб странцы могут не поместитсья в видимой части экрана поэтому мы скролим так чтобы она стала видна для компьютера
        element.scrollIntoView(true).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        this.city.click();
        $(byText(city)).click();
        this.submit.click();
        return this;
    }


    public CheckingComponent getCheckingComponent() {
        return checkingComponent;
    }




}
