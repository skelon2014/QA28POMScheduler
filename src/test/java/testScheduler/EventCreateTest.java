package testScheduler;

import config.ConfigScheduler;
import dto.AuthDTO;
import dto.EventDTO;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagesScheduler.HomeScreen;
import pagesScheduler.SplashScreen;

public class EventCreateTest extends ConfigScheduler {
    @Test
    public void eventCreationTest() {
       boolean isEventCreated =  new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDTO(AuthDTO.builder()
                        .email("kselon+225@bk.ru")
                        .password("Qwerty$4")
                        .build())
                .skipWizard()
                .initCreationEvent()
                .fillCreationEditForm("Event", "QWERTY", 3, 450)
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventCreated);

    }
    @AfterTest
    public void postCondition(){
        new HomeScreen(driver)
                .openMenu()
                .logout();
    }


}
