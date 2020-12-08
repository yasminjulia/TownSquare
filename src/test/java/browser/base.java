package browser;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class base {
    protected static LoginPage login;
    protected static LoginPage user;

    @BeforeMethod
    public void start(){
        Configuration.browser="chrome";
        Configuration.baseUrl="https://qa.townsq.io";
        Configuration.timeout=5000;

        login = new LoginPage();
        user = new LoginPage();
    }
}
