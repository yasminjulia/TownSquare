package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    public LoginPage open() throws InterruptedException {
        Selenide.open("/login");
        Thread.sleep(10000);
        //precisei inserir muitos sleeps pois o tempo de resposta no meu ambiente foi muito longo.
        return this;
    }

    public LoginPage with(String email, String password) throws InterruptedException {
        $(By.xpath("/html//input[@id='login--input--email']")).setValue(email);
        $("input#login--input--password").setValue(password);
        $("button#login--button--submit").click();
        Thread.sleep(10000);

        return this;
    }

    public LoginPage create(String title, String description) throws InterruptedException {
        $(".ng-star-inserted.ng-tns-c236-15.ng-trigger.ng-trigger-menuItemEnterLeave").click();
        $("button#create-announcement").click();
        $("input#alert-title").setValue(title);
        $("textarea#alert-description").setValue(description);
        $("div:nth-of-type(7) > tsq-color-picker-item > .color-item").click();
        $("div:nth-of-type(3) > tsq-icon-picker-item > .circle").click();
        $("#tsq-add-files").click();
        Thread.sleep(8000);
        return this;
    }

    public LoginPage upload(File file) {
        $("input#file-select-input").uploadFile(file);
        return this;
    }

    public LoginPage set() throws InterruptedException {
        $("[ng-reflect-label='Avisar moradores'] small").click();
        $("tsq-switch-collapse#add-reminder-switch > div#switch-collapse-container sc-switch  small").click();
        $("button#confirm-button").click();
        return this;
    }

}

