package testScheduler;

import config.ConfigScheduler;
import dto.AuthDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
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
                .iniCreationEvent()
                .fillCreationEditForm("Event", "QWERTY", 3, 450)
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventCreated);
    }

}
