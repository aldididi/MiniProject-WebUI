package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisPage extends PageObject {
    private By namaLengkap(){
        return By.id("input-128");
    }
    private By emailRegis(){
        return By.xpath("//*[@id=\"input-98\"]");
    }
    private By passwordRegis(){
        return By.xpath("//*[@id=\"input-101\"]");
    }
    private By header(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
        //tulisan register
    }
    private By regisButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    @Step
    public void openUrl(){

        openUrl("https://qa.alta.id/auth/register");
    }

    @Step
    public boolean validateOnRegistPage(){
        return $(regisButton()).isDisplayed();
    }
    public boolean validateOnRegistPage2() {return $(header()).isDisplayed(); }

    @Step
    public void inputNamaLengkapRegist(String namaLengkap){
        $(namaLengkap()).type(namaLengkap);
    }

    @Step
    public void inputEmailRegist(String emailRegis){
        $(emailRegis()).type(emailRegis);
    }
    @Step
    public void inputPassword(String password){
        $(passwordRegis()).type(password);
    }

    @Step
    public void clickRegisButton(){
        $(regisButton()).click();
    }
}
