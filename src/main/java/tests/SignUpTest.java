package tests;

import base.appFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignUpPage;

import java.net.MalformedURLException;

public class SignUpTest {

    SignUpPage signUp;
    appFactory factory;


    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException  {
        factory = new appFactory();
        appFactory.initializer();
        signUp = new SignUpPage();
    }
    @Test
    public void createAccount() throws InterruptedException {
        Thread.sleep(1000);
        signUp.create_new_account();
        signUp.enter_phone();
    }

/*   @AfterTest
    public  void tearDown()
    {
        appFactory.quitDriver();
    }*/
}