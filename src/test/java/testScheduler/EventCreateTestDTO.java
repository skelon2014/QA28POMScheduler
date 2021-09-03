package testScheduler;

import config.ConfigScheduler;
import dto.AuthDTO;
import dto.EventDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesScheduler.LoginScreen;
import pagesScheduler.SplashScreen;

public class EventCreateTestDTO extends ConfigScheduler {
    @Test
    public void eventCreationTestDTO(){
        boolean isEventCreated = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDTO(AuthDTO.builder()
                        .email("skelon+225@bk.ru")
                        .password("Qwerty$4")
                        .build())
                .skipWizard()
                .initCreationEvent()
                .fillCreationEditFormDTO(EventDTO.builder()
                        .title("New event")
                        .type("New type")
                        .breaks(3)
                        .ammount(50).build())
                .confirmCreationEvent()
                .isFabAddPresent();
        Assert.assertTrue(isEventCreated);
    }

    @Test
    public void eventCreationTestDTOWithLogOut(){
    for(int i = 1; i<=3;i++) {
        new LoginScreen(driver)
                .loginWithDTO(AuthDTO.builder()
                        .email("skelon+225@bk.ru")
                        .password("Qwerty$4")
                        .build())
                .skipWizard()
                .initCreationEvent()
                .fillCreationEditFormDTO(EventDTO.builder()
                        .title("New event" + i)
                        .type("New type" + i)
                        .breaks(3)
                        .ammount(50).build())
                .confirmCreationEvent()
                .openMenu()
                .logout();
    }
      //  Assert.assertTrue(isEventCreated);
    }
}
