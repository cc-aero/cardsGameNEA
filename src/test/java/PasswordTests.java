import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ai.ccinnov.cardgame.Passwords;

public class PasswordTests {
    @Test
    @DisplayName("Valid Password")
    void validPw(){
        Assertions.assertTrue(Passwords.validatePassword("123456A7#"));
    }

    @Test
    @DisplayName("Invalid Password No Caps")
    void noCapsPw(){
        Assertions.assertFalse(Passwords.validatePassword("nocap1talshere!"));
    }

    @Test
    @DisplayName("Invalid Password No Number")
    void noNumberPw(){
        Assertions.assertFalse(Passwords.validatePassword("noNumbersHere!"));
    }

    @Test
    @DisplayName("Invalid Password No Special Chars")
    void noSpecialCharPw(){
        Assertions.assertFalse(Passwords.validatePassword("noSpecialCh4rs"));
    }

    @Test
    @DisplayName("Invalid Password Too Short")
    void badLengthPw(){
        Assertions.assertFalse(Passwords.validatePassword("tooshor"));
    }
}
