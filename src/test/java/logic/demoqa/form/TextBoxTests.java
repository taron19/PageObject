package logic.demoqa.form;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TextBoxTests {
    private static FormFillingPage formFillingPage;

    @BeforeAll
    static void beforeAll() {
        formFillingPage = new FormFillingPage();
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTestSuccess() {
        formFillingPage.openPage()
                .setUserName("Alex")
                .setuserEmail("alex@egorov.com")
                .setcurrentAddress("Some street 1")
                .setPermanentAddres("Another street 1");

        formFillingPage.getFormComponent().nameCheck("Alex");
        formFillingPage.getFormComponent().nameEmailCheck("alex@egorov.com");
        formFillingPage.getFormComponent().nameCurrentAddressCheck("Some street 1");
        formFillingPage.getFormComponent().namePermanentAddressCheck("Another street 1");


    }


    @Test
    void fillFormTestSuccessNegative() {
        formFillingPage.openPage()
                .setUserName("Alex")
                .setuserEmail("alex@egorov.com")
                .setcurrentAddress("Some street 1")
                .setPermanentAddres("Another street 1");

        formFillingPage.getFormComponent().nameCheckNegative("Alex1");
        formFillingPage.getFormComponent().emailCheckNegative("alex@egorov.ru");
        formFillingPage.getFormComponent().currentAddressCheckNegative("Some street 12");
        formFillingPage.getFormComponent().permanentAddressCheckNegative("Another street 111");



    }
}
