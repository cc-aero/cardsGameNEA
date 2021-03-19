import ai.ccinnov.cardgame.Login;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests {
    @Test
    @DisplayName("Invalid Credentials Provided")
    @Disabled //Invalid login function not done yet
    void invalidCredentials(){
        Assertions.assertEquals(-1,Login.logIn(makeLoginInstance()));
    }

    private Login makeLoginInstance(){
        Login l = new Login("userName","passPhrase");
        return l;
    }
}
