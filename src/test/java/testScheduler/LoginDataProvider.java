package testScheduler;

import config.ConfigScheduler;
import config.MyDataProvider;
import dto.AuthDTO;
import org.testng.annotations.Test;
import pagesScheduler.LoginScreen;
import pagesScheduler.SplashScreen;

public class LoginDataProvider extends ConfigScheduler {

    @Test(dataProvider = "validLoginData", dataProviderClass = MyDataProvider.class)

    public void loginWithDTO(String email, String password) {

        AuthDTO dto = AuthDTO.builder()
                .email(email)
                .password(password)
                .build();

 //       new SplashScreen(driver)
   //             .checkVersion("0.0.3")
                new LoginScreen(driver)
                .loginWithDTO(dto)
                .skipWizard()
                .openMenu()
                .logout();
    }
}
