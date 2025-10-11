package logic.demoqa.registration;

import org.junit.jupiter.api.Test;

public class TestImplRegistration extends TestInitRegistration {

    private final RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void successfulRegistration(){
        registrationPage.openPage()
                .setFirstName("Igor")
                .setLastName("Igorov")
                .setUserEmail("i@mail.ru")
                .setGender("Male")
                .setUserNumber("9096776688")
                .setDateOfBirthInput("2023","December","22")
                .setSubject("Maths")
                .setHobbies("Reading")
                .setPicture("Снимок экрана 2025-02-21 130657.png")
                .setAddress("Flot st")
                .setState("Haryana")
                .setCity("Panipat");


        registrationPage.getCheckingComponent().checkFirstNameAndLastName("Igor Igorov");
        registrationPage.getCheckingComponent().checkEmail("i@mail.ru");
        registrationPage.getCheckingComponent().checkGender("Male");
        registrationPage.getCheckingComponent().checkNumber("9096776688");
        registrationPage.getCheckingComponent().checkDate("22 December,2023");
        registrationPage.getCheckingComponent().checkSubject("Maths");
        registrationPage.getCheckingComponent().checkHobby("Reading");
        registrationPage.getCheckingComponent().checkPictureData("Снимок экрана 2025-02-21 130657.png");
        registrationPage.getCheckingComponent().checkAddress("Flot st");
        registrationPage.getCheckingComponent().checkStateAndCity("Haryana Panipat");
    }

    @Test
    void unsuccessfulRegistration_ShouldNotContainWrongData() {
        registrationPage.openPage()
                .setFirstName("Igor")
                .setLastName("Igorov")
                .setUserEmail("i@mail.ru")
                .setGender("Male")
                .setUserNumber("9096776688")
                .setDateOfBirthInput("2023","December","22")
                .setSubject("Maths")
                .setHobbies("Reading")
                .setPicture("Снимок экрана 2025-02-21 130657.png")
                .setAddress("Flot st")
                .setState("Haryana")
                .setCity("Panipat");


        registrationPage.getCheckingComponent().checkFirstNameAndLastNameNegative("Wrong Name");
        registrationPage.getCheckingComponent().checkEmailNegative("wrong@mail.com");
        registrationPage.getCheckingComponent().checkGenderNegative("Female");
        registrationPage.getCheckingComponent().checkStateAndCityNegative("Delhi Mumbai");
    }
}
