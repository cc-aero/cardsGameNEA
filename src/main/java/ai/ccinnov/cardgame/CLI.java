package ai.ccinnov.cardgame;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String userName;
        String pw;
        while (true){
            System.out.print( "                              Welcome to CardGame!                              "+"\n\n"+
                                "Enter your Username: ");
            userName = scanner.nextLine();

            System.out.print("Enter your Password: ");

        }
    }
}
