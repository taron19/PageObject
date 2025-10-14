package logic.demoqa.registration;


import org.junit.jupiter.api.Test;
import utils.FakerUtils;

public class BaseTestImplRegistration extends BaseTest {

    private final RegistrationPage registrationPage = new RegistrationPage();
    private final FakerUtils fakerUtils = new FakerUtils();



    @Test
    void successfulRegistration(){
        registrationPage.openPage()
                .setFirstName(fakerUtils.getFirstName())
                .setLastName(fakerUtils.getLastName())
                .setUserEmail(fakerUtils.getEmail())
                .setGender(fakerUtils.getGender())
                .setUserNumber(fakerUtils.getPhoneNumber())
                .setDateOfBirthInput(fakerUtils.getYear(), fakerUtils.getMonth(), fakerUtils.getDay())
                .setSubject(fakerUtils.getSubject())
                .setHobbies(fakerUtils.getHobby())
                .setPicture(fakerUtils.getPictureURL())
                .setAddress(fakerUtils.getAdress())
                .setState(fakerUtils.selectState())
                .setCity(fakerUtils.selectCity());


        registrationPage.getCheckingComponent().checkFirstNameAndLastName(fakerUtils.getFirstName()+" "+fakerUtils.getLastName());
        registrationPage.getCheckingComponent().checkEmail(fakerUtils.getEmail());
        registrationPage.getCheckingComponent().checkGender(fakerUtils.getGender());
        registrationPage.getCheckingComponent().checkNumber(fakerUtils.getPhoneNumber());
        registrationPage.getCheckingComponent().checkDate(fakerUtils.getDay()+" "+fakerUtils.getMonth()+","+fakerUtils.getYear());
        registrationPage.getCheckingComponent().checkSubject(fakerUtils.getSubject());
        registrationPage.getCheckingComponent().checkHobby(fakerUtils.getSubject());
        registrationPage.getCheckingComponent().checkPictureData(fakerUtils.getSubject());
        registrationPage.getCheckingComponent().checkAddress(fakerUtils.getAdress());
        registrationPage.getCheckingComponent().checkStateAndCity(fakerUtils.selectState()+" "+fakerUtils.selectCity());
    }

    @Test
    void unsuccessfulRegistration_ShouldNotContainWrongData() {
        registrationPage.openPage()
                .setFirstName(fakerUtils.getFirstName())
                .setLastName(fakerUtils.getLastName())
                .setUserEmail(fakerUtils.getEmail())
                .setGender(fakerUtils.getGender())
                .setUserNumber(fakerUtils.getPhoneNumber())
                .setDateOfBirthInput(fakerUtils.getYear(), fakerUtils.getMonth(), fakerUtils.getDay())
                .setSubject(fakerUtils.getSubject())
                .setHobbies(fakerUtils.getHobby())
                .setPicture(fakerUtils.getPictureURL())
                .setAddress(fakerUtils.getAdress())
                .setState(fakerUtils.selectState())
                .setCity(fakerUtils.selectCity());


        registrationPage.getCheckingComponent().checkFirstNameAndLastNameNegative("Wrong Name");
        registrationPage.getCheckingComponent().checkEmailNegative("wrong@mail.com");
        registrationPage.getCheckingComponent().checkGenderNegative("Female");
        registrationPage.getCheckingComponent().checkStateAndCityNegative("Delhi Mumbai");
        registrationPage.getCheckingComponent().checkNumberNegative("763463467487");
        registrationPage.getCheckingComponent().checkDateNegative("12 December, April");
        registrationPage.getCheckingComponent().checkSubjectNegative("Loets");
        registrationPage.getCheckingComponent().checkHobbyNegative("Not Reading");
        registrationPage.getCheckingComponent().checkPictureDataNegative("hre.jpg");
        registrationPage.getCheckingComponent().checkAddressNegative("st Loevv");
    }
}
