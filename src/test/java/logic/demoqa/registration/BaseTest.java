package logic.demoqa.registration;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void init(){
        Configuration.pageLoadStrategy="eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout=6000;

    }
}
