package pagesAdvanced;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DragableBasicScreen extends BaseScreenADV {
    public DragableBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/drag_handle']")
    List<MobileElement> list;

    public DragableBasicScreen dragDown(){
        MobileElement element=list.get(0);

        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth()/2;
        int yFrom = rect.getY() + rect.getHeight()/2;

        int xTo = xFrom;
        int yTo = yFrom + rect.getHeight();

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release()
                .perform();

        return this;
    }
    public DragableBasicScreen dragDown(int count){
        MobileElement element=list.get(3);

        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth()/2;
        int yFrom = rect.getY() + rect.getHeight()/2;

        int xTo = xFrom;
        int yTo = yFrom + count * rect.getHeight();

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release()
                .perform();

        return this;
    }


    public DragableBasicScreen dragDownWindow(){
        MobileElement element=list.get(0);

        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth()/2;
        int yFrom = rect.getY() + rect.getHeight()/2;

        Dimension sizeWindows = driver.manage().window().getSize();


        int xTo = xFrom;
        int yTo = sizeWindows.getHeight()-rect.getHeight()/4;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release()
                .perform();

        return this;
    }

}