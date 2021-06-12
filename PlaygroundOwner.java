/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Zainab
 */
public class PlaygroundOwner extends User {

    ArrayList<Playground> OwnerPlaygrounds = new ArrayList<Playground>();

    /**
     * Default constructor
     */
    public PlaygroundOwner() {
    }

    /**
     * PlaygroundOwner parameterized constructor to initialize the attributes
     *
     * @param name
     * @param address
     * @param phone
     * @param mail
     * @param pass
     */
    public PlaygroundOwner(String name, String address, String phone, String mail, String pass) {
        super(name, address, phone, mail, pass);
    }

    /**
     * requestPlayground request from administrator to add a playground
     */
    public void requestPlayground() {
        Scanner input = new Scanner(System.in);
        System.out.println("Request Adding Playground");
        System.out.println("Playground Name:");
        String playgroundName = input.nextLine();
        System.out.println("Playground Location:");
        String playgroundLocation = input.nextLine();
        System.out.println("Price per hour:");
        double price = input.nextDouble();
        System.out.println("Cancellation Period:");
        int cancel = input.nextInt();
        System.out.println("Opening Time:");
        int openTime = input.nextInt();
        System.out.println("Closing Time:");
        int closeTime = input.nextInt();
        Playground g1 = new Playground(playgroundName, playgroundLocation, price, cancel, openTime, closeTime);
        Lists list = new Lists();
        list.playgroundList.add(g1);
        OwnerPlaygrounds.add(g1);
        System.out.println("Successfully requested.");
    }
}
