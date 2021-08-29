package testScheduler;

import config.ConfigScheduler;
import dto.AuthDTO;
import dto.AuthTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesScheduler.LoginScreen;
import pagesScheduler.SplashScreen;
import pagesScheduler.WizardScreen;

public class LoginTest extends ConfigScheduler {

    @Test
    public void loginTest() {

        boolean isFabButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("skelon+125@bk.ru")
                .fillPassword("Qwerty$4")
                .clickLoginButton()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabButtonPresent);
        System.out.println(isFabButtonPresent);

  /*      SplashScreen splashScreen = new SplashScreen(driver);
          splashScreen.checkVersion("0.0.3");
          new LoginScreen(driver).fillEmail("").fillPassword("").clickLoginButton();
          new WizardScreen(driver).skipWizard();*/
    }
//====================================
    @Test//with AuthTest
    public void loginWithDTO() {
       /* AuthTest testA = new AuthTest()
                .withEmail("------")
                .withPassword("-------");
        AuthTest testB = new AuthTest()
                .withEmail("");*/


        AuthDTO dto = AuthDTO.builder()
                .email("skelon+225@bk.ru")
                .password("Qwerty$4")
                .build();

        boolean isFabbButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDTO(dto)
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabbButtonPresent);
    }
}
