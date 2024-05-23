package org.example;
import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {


    Scanner myObj = new Scanner(System.in);
    String userName;

    // Enter username and press Enter
    System.out.println("Enter username");
    userName = myObj.nextLine();

    for (int i = 0; i < userName.length(); i++) {

        System.out.println("Buchstabe "+(i+1)+" is " + userName.charAt(i));
    }

}
}
