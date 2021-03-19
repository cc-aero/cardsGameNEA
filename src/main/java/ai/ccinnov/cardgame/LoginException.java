package ai.ccinnov.cardgame;

public class LoginException extends Exception{
    public LoginException(int reason) throws LoginException {
        //Reasons:
        //0: Class Error
        //1: Invalid U/N or PW
        throw new LoginException(reason);
    }
}
