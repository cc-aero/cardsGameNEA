import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ai.ccinnov.cardgame.Passwords;

public class PasswordTests {
    @Test
    @DisplayName("Password with no special char")
    void noSpecialCharPw(){
        Assertions.assertEquals(true,Passwords.validatePassword("1234567#"));
    }
}
