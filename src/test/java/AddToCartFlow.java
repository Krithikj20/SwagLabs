import org.example.AddToCartPageObjects;
import org.example.LoginPageObjects;
import org.testng.annotations.Test;

public class AddToCartFlow extends BaseTest {
    @Test
    public void addToCart() throws InterruptedException {
        LoginPageObjects login = new LoginPageObjects(driver);
        login.loginFlow();
        AddToCartPageObjects cart = new AddToCartPageObjects(driver);
        cart.AddToCart();
    }
}


