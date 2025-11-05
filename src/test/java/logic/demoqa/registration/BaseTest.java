package logic.demoqa.registration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import logic.demoqa.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BaseTest {


    /**
     * Configuration.remote
     * Это настройка для  тестов , чтобы они НЕ запускались локально, а подключались к удалённому Selenoid.
     * Вместо запуска Chrome на локальной машине, тесты посылают команды на Selenoid, а он уже запускает браузер в Docker-контейнере.
     * Легкая интеграция с CI/CD (Jenkins, GitLab CI),Экономия ресурсов локальной машины,Не нужно устанавливать браузеры и драйверы
     * Configuration.browserCapabilities = capabilities;
     *  Добавляем возможность видеть видеозапись теста (Можно показать заказчику как работает автотест, видео записи для отчетов)
     */
    @BeforeAll
    public static void init(){
        Configuration.pageLoadStrategy="eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout=6000;
       // Configuration.remote = System.getProperty("remoteUrl");
       // Configuration.browser = System.getProperty("browser","chrome");
        System.out.println(Configuration.remote = System.getProperty("remoteUrl"," https://user1:1234@selenoid.autotests.cloud/wd/hub"));
        System.out.println(  Configuration.browser = System.getProperty("browser","chrome"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());


    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }

}
