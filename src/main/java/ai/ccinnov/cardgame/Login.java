package ai.ccinnov.cardgame;

public class Login {
    private String un;
    private String pw;
    private String sha1;
    private static Token t;
    public Login(String un, String pw){
        this.un = un;
        this.pw = pw;
        logIn(this);
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    private String getPw(){
        return pw;
    }

    public static int logIn(Login l){
        //!TODO Make this actually work
        l.setSha1(Passwords.generateHash(l.getPw()));
        //Compare to DB
        //If valid;

        //Generate token
        t = new Token(l);
        //Then do a return
        boolean valid = false;
        if(valid){
            return 0;
        }

        return -1;
    }

}
