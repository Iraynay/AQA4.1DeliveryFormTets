import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Visible;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;

public class DeliveryFormTest {



    @Test
    void shouldReturnOkMessage() {
        open("http://localhost:9999");

        // Configuration.holdBrowserOpen = true;
        $x("//*[@id=\"root\"]/div/form/fieldset/div[1]/div/span/span/span[1]/input").setValue("Москва");
        //  $x("//a[contains(text(),'город']/..").setValue("Казань");
        $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span/span/span/span[1]/input").setValue("15.11.2022");
        $x("//input[@name='name']").setValue("Дим Димин");
        $x("//*[@id=\"root\"]/div/form/fieldset/div[4]/span/span/span[2]/input").setValue("+70001234567");
        //  $("[data-test-id='phone']").setValue("+70001234567");
        $("[data-test-id='agreement']").click();
        $x("//*[@id=\"root\"]/div/form/fieldset/div[6]/div[2]/div/button/span/span[2]").click();
        $x("//*[@id=\"root\"]/div/div").should(visible, Duration.ofSeconds(15));

    }
}
