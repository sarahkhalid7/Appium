package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()),this);

    }
    @FindBy(id="com.instagram.android:id/sign_up_with_email_or_phone")
    public WebElement create_new_account;

    @FindBy(id="com.instagram.android:id/phone_field")
    public WebElement phone_field;

    @FindBy(id="com.instagram.android:id/log_in_button")
    public WebElement login_Button;

    public void create_new_account()
    {
        create_new_account.click();
    }
    public void enter_phone()
    {
        phone_field.click();
        phone_field.sendKeys("8004689081");
    }
}

