package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    public WebDriver driver;

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@placeholder='Username' and @class='input_error form_input']")
    private WebElement usernameField;

    @FindBy(xpath="//input[@placeholder='Password' and @class='input_error form_input']")
    private WebElement passwordField;

    @FindBy(xpath="//input[@id='login-button']")
    private WebElement loginButton;



    public void loginFlow() {
usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
loginButton.click();
 //       Actions actions = new Actions(driver);

        // Copy text
//        actions.moveToElement(usernameSource)
//                .doubleClick()
//                .keyDown(Keys.CONTROL)
//                .sendKeys("c")
//                .keyUp(Keys.CONTROL)
//                .perform();
//
//        // Paste text
//        actions.moveToElement(usernameDestination)
//                .click()
//                .keyDown(Keys.CONTROL)
//                .sendKeys("v")
//                .keyUp(Keys.CONTROL)
//                .perform();
    }
}
