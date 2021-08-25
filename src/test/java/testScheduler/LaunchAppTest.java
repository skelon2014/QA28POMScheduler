package testScheduler;

import config.ConfigScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;
import pagesScheduler.SplashScreen;

public class LaunchAppTest extends ConfigScheduler {
    @Test
    public void launchTest(){
        String version = new SplashScreen(driver).getCurrentvesion();
        Assert.assertEquals(version, "0.0.3");
    }

}
