package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutFlowPageObjects {
    public WebDriver driver;

    public CheckoutFlowPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[contains(text(),'Checkout')]")
    private WebElement CheckoutButton;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement LastName;
    @FindBy(xpath = "//input[@id='postal-code']\n")
    private WebElement PostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement ContinueButton;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement FinishButton;
    @FindBy(xpath="//h2[@class='complete-header']")
    public WebElement ThankYouPageHeader;

    public String Checkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOf(CheckoutButton));
        wait.until(ExpectedConditions.elementToBeClickable(CheckoutButton));
        CheckoutButton.click();
        FirstName.click();
        FirstName.sendKeys("krithi");
        LastName.click();
        LastName.sendKeys("kj");
        PostalCode.click();
        PostalCode.sendKeys("574118");
        ContinueButton.click();
        FinishButton.click();
        String ThankYouTitle= ThankYouPageHeader.getText();
        return ThankYouTitle;
    }
}
