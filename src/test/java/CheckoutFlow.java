import org.example.AddToCartPageObjects;
import org.example.CheckoutFlowPageObjects;
import org.example.LoginPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class CheckoutFlow extends BaseTest {
        @Test
        public void checkoutFlow() throws InterruptedException {
            LoginPageObjects login = new LoginPageObjects(driver);
            login.loginFlow();
            AddToCartPageObjects cart = new AddToCartPageObjects(driver);
            cart.AddToCart();
            CheckoutFlowPageObjects checkoutPage = new CheckoutFlowPageObjects(driver);
            checkoutPage.Checkout();
            Assert.assertEquals(checkoutPage.Checkout(), "Thank you for your order!");
        }
    }