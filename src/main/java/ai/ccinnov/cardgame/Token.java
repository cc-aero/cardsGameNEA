package ai.ccinnov.cardgame;

//Access token

public class Token {
    static Login l;
    public Token(Login l){
        this.l = l;
    }
    public String[] tokensList = new String[]{};

    public int generateToken(){
        Token newToken = new Token(l);
        char parity = '1';
        String rubbishToken = (l.getUn()+"xx"+l.getSha1()+"xx"+(System.currentTimeMillis())+parity);
        System.out.print("Access token: "+rubbishToken+"\n");
        tokensList+= ["e"];
        return 0;
    }

    public static int revokeToken(Token t){

    }
}
