package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableBasicScreen extends BaseScreenADV{
    public SwipeableBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='android:id/text1']")
    List<MobileElement>list;
    @FindBy(xpath = "//*[@resource-id='android:id/button1']")
    MobileElement okButton;

    public SwipeableBasicScreen swipeLeftToRight(){
        MobileElement element = list.get(1);

        Rectangle rect = element.getRect();
        int xFrom = (int) (rect.getX() + rect.getWidth()*0.2);
        //xFrom = rect.getX() + 20;
        int yFrom = rect.getY() + rect.getHeight()/2;

        int xTo = (int) (xFrom + rect.getWidth()*0.6);
        int yTo = yFrom;

        TouchAction<?>action = new TouchAction<>(driver);
        action
                .longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo,yTo))
                .release().perform();
        return this;
    }

    public SwipeableBasicScreen swipeRightToLeft() {
        MobileElement element = list.get(1);

        Rectangle rect = element.getRect();
        int xFrom = (int) (rect.getX() + rect.getWidth() * 0.8);
        //xFrom = rect.getX() + 20;
        int yFrom = rect.getY() + rect.getHeight() / 2;

        int xTo = (int) (xFrom - rect.getWidth() * 0.6);
        int yTo = yFrom;

        TouchAction<?> action = new TouchAction<>(driver);
        action
                .longPress(PointOption.point(xFrom, yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release().perform();
        okButton.click();
        return this;
    }

}
