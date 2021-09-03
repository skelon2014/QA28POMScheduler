package pagesScheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeScreen extends BaseScreen {
    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/fab_main']")
    MobileElement fabAdd;
    @AndroidFindBy(xpath = "//*[@content-desc = 'Open']")
    MobileElement burgerMenu;
    @AndroidFindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/nav_fr_logout']")
    MobileElement logoutButton;
    @AndroidFindBy(xpath = "//*[@resource-id = 'com.example.svetlana.scheduler:id/fab_add_event']")
    MobileElement fabbAddEvent;

    public boolean isFabAddPresent() {
        should(fabAdd, 15);
        return true;
    }

    public HomeScreen openMenu(){
        burgerMenu.click();
        return this;
    }

    public LoginScreen logout(){
        logoutButton.click();
        return new LoginScreen(driver);
    }

    public EditCreateEventScreen initCreationEvent(){
        fabAdd.click();
        fabbAddEvent.click();
        return new EditCreateEventScreen(driver);

    }




}
