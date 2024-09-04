package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageObjects {
    public WebDriver driver;

    public AddToCartPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="(//div[@class='inventory_item_img'])[1]")
    private WebElement FirstProductImage;

    @FindBy(xpath = "(//button[@data-test='add-to-cart'])[1]")
    private WebElement AddToCartButton;
@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement ShoppingCartIcon;
@FindBy(xpath = "//div[@class='cart_item_label']")
private WebElement ProductNameInCart;
@FindBy(xpath="//div[@class='cart_quantity']")
private WebElement QuantityInCart;

    public void AddToCart() {
        FirstProductImage.click();
        AddToCartButton.click();
        ShoppingCartIcon.click();
        System.out.println(ProductNameInCart.getText());
        System.out.println( QuantityInCart.getText());
    }
}
