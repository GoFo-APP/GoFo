/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.Scanner;

/**
 *
 * @author Zainab
 */
public class GoFo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GoFo!");
        System.out.println("For signning up fill the following: ");
        System.out.println("Name:");
        String UserName = input.nextLine();
        System.out.println("Location:");
        String UserLocation = input.nextLine();
        System.out.println("Phone Number:");
        String phoneNum = input.nextLine();
        System.out.println("Email Address:");
        String emailAddress = input.nextLine();
        System.out.println("Password:");
        String password = input.nextLine();
        System.out.println("Sign up as a Player or Playground Owner:");
        String uType = input.nextLine();
        User u1 = new User(UserName, UserLocation, phoneNum, emailAddress, password, uType);
        if (u1.get_UserType().equalsIgnoreCase("player")) {
            System.out.println("Book a Playground");
        } else if (u1.get_UserType().equalsIgnoreCase("playground owner")) {
            System.out.println("To request adding playground fill the following:");
            System.out.println("Playground Name:");
            String playgroundName = input.nextLine();
            System.out.println("Playground Location:");
            String playgroundLocation = input.nextLine();
            System.out.println("Price per hour:");
            double price = input.nextDouble();
            System.out.println("Available Hours:");
            double Hours = input.nextDouble();
            System.out.println("Cancellation Period:");
            int cancel = input.nextInt();

            Playground g1 = new Playground(playgroundName, playgroundLocation, price, Hours, cancel);
            playgroundList.add(g1);
        }

    }

}
