import org.example.LoginPageObjects;
import org.testng.annotations.Test;

public class LoginFlow extends BaseTest {

    @Test
    public void LoginTest() {
        LoginPageObjects login = new LoginPageObjects(driver);
        login.loginFlow();
    }
}