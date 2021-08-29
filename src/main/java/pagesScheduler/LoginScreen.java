package pagesScheduler;

import dto.AuthDTO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;
    //menyaem void na LoginScreen, 4tobi pokazat', 4to mi ostaemsya na str login
    @AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
    MobileElement errorMes;

    public LoginScreen fillEmail(String email) {
        type(emailEditText, email);
        return this;
    }

    public LoginScreen fillPassword(String password) {
        type(passwordEditText, password);
        return this;
    }
    //a teper perehodim na sled str(WizardScreen) i dostraivaem v SplashScreen

    public WizardScreen clickLoginButton() {
        hideKeyBoard();
        loginButton.click();
        return new WizardScreen(driver);
    }

    public WizardScreen loginWithDTO(AuthDTO auth) {
        type(emailEditText, auth.getEmail());
        type(passwordEditText, auth.getPassword());
        hideKeyBoard();
        loginButton.click();
        return new WizardScreen(driver);
    }

    public LoginScreen fillFormLogin(AuthDTO auth){
        type(emailEditText, auth.getEmail());
        type(passwordEditText, auth.getPassword());
        return this;
    }
    public LoginScreen errorLogin(){
        hideKeyBoard();
        loginButton.click();
        return this;
    }

    public String errorMessage(){
        return errorMes.getText();
    }
}
