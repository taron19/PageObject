package logic.demoqa.registration;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import utils.FakerUtils;


//@Execution(ExecutionMode.SAME_THREAD)
public class BaseTestImplRegistration extends BaseTest {

    private final RegistrationPage registrationPage = new RegistrationPage();
    private final FakerUtils fakerUtils = new FakerUtils();


    @Test
    @Tag("success_registration")
    void successfulRegistration() {


        step("Регистрация пользователя", () -> {
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
        });


        step("Проверка данных пользователя", () -> {
            registrationPage.getCheckingComponent()
                    .checkFirstNameAndLastName(fakerUtils.getFirstName() + " " + fakerUtils.getLastName())
                    .checkEmail(fakerUtils.getEmail())
                    .checkGender(fakerUtils.getGender())
                    .checkNumber(fakerUtils.getPhoneNumber())
                    .checkDate(fakerUtils.getDay() + " " + fakerUtils.getMonth() + "," + fakerUtils.getYear())
                    .checkSubject(fakerUtils.getSubject())
                    .checkHobby(fakerUtils.getSubject())
                    .checkPictureData(fakerUtils.getSubject())
                    .checkAddress(fakerUtils.getAdress())
                    .checkStateAndCity(fakerUtils.selectState() + " " + fakerUtils.selectCity());

        });
    }

    @Test
    void unsuccessfulRegistration_ShouldNotContainWrongData() {
        step("Регистрация пользователя негативный", () -> {
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
                });


        step("Проверка данных пользователя негативный", () -> {
            registrationPage.getCheckingComponent().checkFirstNameAndLastNameNegative("Wrong Name")
                    .checkEmailNegative("wrong@mail.com")
                    .checkGenderNegative("Female1")
                    .checkStateAndCityNegative("Delhi Mumbai")
                    .checkNumberNegative("763463467487")
                    .checkDateNegative("12 December, April")
                    .checkSubjectNegative("Loets")
                    .checkHobbyNegative("Not Reading")
                    .checkPictureDataNegative("hre.jpg")
                    .checkAddressNegative("st Loevv");
        });
    }
}
