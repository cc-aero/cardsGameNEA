import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ai.ccinnov.cardgame.Passwords;

public class PasswordTests {
    @Test
    @DisplayName("Valid Password")
    void validPw(){
        Assertions.assertEquals(true,Passwords.validatePassword("123456A7#"));
    }

    @Test
    @DisplayName("Invalid Password No Caps")
    void noCapsPw(){
        Assertions.assertEquals(false,Passwords.validatePassword("nocap1talshere!"));
    }
}
