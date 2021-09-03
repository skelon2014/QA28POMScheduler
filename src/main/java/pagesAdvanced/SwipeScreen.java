package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class SwipeScreen extends BaseScreenADV {
    public SwipeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "")
    MobileElement swipeBasic;

    public SwipeableBasicScreen selectSwipeBasic(){
        swipeBasic.click();
        return new SwipeableBasicScreen(driver);
    }
}
