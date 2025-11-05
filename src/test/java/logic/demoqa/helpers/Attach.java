package logic.demoqa.helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.sessionId;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class Attach {


    /**
     * код создания скриншота
     */
    @Attachment(value = "{attachName}", type = "image/png")
    public static byte[] screenshotAs(String attachName) {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * кодовая база html
     */
    @Attachment(value = "Page source", type = "text/plain")
    public static byte[] pageSource() {
        return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Вложение с любым типом(в данном случае текст type)
     */
    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachAsText(String attachName, String message) {
        return message;
    }

    /**
     * здесь создали отдельный метод с логами чтобы не повторяться если будут другие attaches типо текст
     * например кроме логов могут быть конфиг данные и мы создадим метод configLogs() и вызовем снова
     * attachAsText(String attachName, String message) но с другой логикой
     */
    public static void browserConsoleLogs() {
        attachAsText(
                "Browser console logs",
                String.join("\n", Selenide.getWebDriverLogs(BROWSER))
        );
    }


    /**
     * создает HTML видеоплеер
     *
     */
    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static String addVideo() {
        return "<html><body><video width='100%' height='100%' controls autoplay><source src='"
                + getVideoUrl()
                + "' type='video/mp4'></video></body></html>";
    }

    /**
     * формирует URL видео
     * sessionId() - должен возвращать ID сессии Selenium WebDriver
     * URL формат: https://selenoid.autotests.cloud/video/{sessionId}.mp4
     */
    public static URL getVideoUrl() {
        String videoUrl = System.getProperty("mp4Video") + sessionId() + ".mp4";
        System.out.println("VIDEO "+videoUrl);
        try {
            return new URL(videoUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
