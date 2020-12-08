package tests;

import browser.base;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Challenge extends base {
    @Test
    public void login(){
        try {
            login
                    .open()
                    .with("eduarda.carvalho.eeec50@townsq.com.br", "julia123")
                    .create("Aferição de temperatura", "Fica determinado que a partir desta quarta-feira 9 de dezembro de 2020 todos os condomininos que acessarem os espaços públicos do condominio passarão " +
                            "primeiro por uma aferição de temperatura.")
                    .upload(new File("C:\\Users\\Yasmin\\IdeaProjects\\townsq_challenge\\src\\main\\resources\\fileUpload.pdf/"))
                    .set();
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        //Alguns elementos(locators) funcionaram em alguma execuções em outras não
       /* $("tsq-info-card:nth-of-type(1) .title.title-avocado")
                .shouldHave(Condition.text("Aferição de temperatura"));*/
    }


}
