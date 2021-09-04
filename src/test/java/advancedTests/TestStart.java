package advancedTests;

import config.ConfigAdvanced;
import org.testng.annotations.Test;
import pagesAdvanced.DragScreen;

public class TestStart extends ConfigAdvanced {
    @Test
    public void dragDownTest(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown();
logger.info("DragDownTest");
logger.info("+++++++++++++++++++");

    }

    @Test
    public void dragDownCountTest(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown(4);

    }
    @Test
    public void dragDownCountTestWindow(){
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDownWindow();
    }

    @Test
    public void swipeTest(){
        new DragScreen(driver)
                .selectSwipe()
                .selectSwipeBasic()
                .swipeLeftToRight()
                .swipeRightToLeft();
    }
}
