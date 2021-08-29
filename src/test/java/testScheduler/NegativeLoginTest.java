package testScheduler;

import config.ConfigScheduler;
import dto.AuthDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesScheduler.LoginScreen;
import pagesScheduler.SplashScreen;

public class NegativeLoginTest extends ConfigScheduler {

    @Test//with AuthTest
    public void negativeLoginWithDTO() {
        AuthDTO negdto = AuthDTO.builder()
                .email("skelon+225@bk.ru")
                .password("Qwerty$$")
                .build();

        String error = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillFormLogin(negdto)
                .errorLogin()
                .errorMessage();
        Assert.assertEquals(error, "Wrong email or password");

    }
}