package ai.ccinnov.cardgame;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;


public class Passwords {
    //!TODO Compartmentalise and secure
    
    private static char[] specialChars = {'!','@','?','#',';',':','<','>','(',')','%','`','~',("'").toCharArray()[0]};
    private static char[] numberChars = {'0','1','2','3','4','5','6','7','8','9'};

    private static boolean checkForUpperChar(String pw){
        for (int i = 0;i < pw.length(); i++){
            if(Character.isUpperCase(pw.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static String generateHash(String seed){
        return DigestUtils.sha1Hex(seed);
    }
    public static boolean validatePassword(String pw){
        boolean specialCharPresent = false;
        if(
                        pw.length() > 7 && //Validate Minimum Length
                        StringUtils.containsAny(pw,specialChars) && //Validate Special Characters
                        StringUtils.containsAny(pw,numberChars) && //Validate Numbers
                        checkForUpperChar(pw)
        )
        {
            return true;}
        
        else{return false;}
    }
}
