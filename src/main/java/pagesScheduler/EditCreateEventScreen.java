package pagesScheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditCreateEventScreen extends BaseScreen{
    public EditCreateEventScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_title_input']")
    MobileElement title;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_type_input']")
    MobileElement type;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_break_plus_btn']")
    MobileElement breakPlusButton;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_edit']")
    MobileElement wageEdit;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_input']")
    MobileElement wageInput;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_wage_save']")
    MobileElement wageSave;
    @AndroidFindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/info_save_btn']")
    MobileElement confirmCreationEvent;

    public EditCreateEventScreen fillCreationEditForm(String titleS, String eventS, int breaksS, int wageS){
        type(title,titleS);
        type(type,eventS);
        hideKeyBoard();
        if(breaksS > 0){
            for(int i = 0; i <= breaksS; i++){
                breakPlusButton.click();
            }
        }
        wageEdit.click();
        type(wageInput,String.valueOf(wageS));
        wageSave.click();
        return this;
    }
    public HomeScreen confirmCreationEvent(){
        confirmCreationEvent.click();
        return new HomeScreen(driver);
    }
}
