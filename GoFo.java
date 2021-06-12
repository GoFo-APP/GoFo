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
        Scanner input = new Scanner(System.in);
        Lists list = new Lists();
        System.out.println("Welcome to GoFo!");
        /*User user=new User();
        user.SignUp();
        if("playground Owner".equalsIgnoreCase(user.get_UserType()))
        {
            PlaygroundOwner Po=new PlaygroundOwner(user.get_Name(), user.get_Location(), user.get_Phone(),user.get_Email(), user.get_Password());
            list.playgroundOwnerList.add(Po);
            System.out.println("Playground owner acount created successfully");
        }
        else if("player".equalsIgnoreCase(user.get_UserType()))
        {
            Player player=new Player(user.get_Name(), user.get_Location(), user.get_Phone(),user.get_Email(), user.get_Password());
            list.playerList.add(player);
            System.out.println("Player acount created successfully");
        }
         */
        PlaygroundOwner PO1 = new PlaygroundOwner();
        PO1.requestPlayground();
        //System.out.println(PO1.OwnerPlaygrounds.get(0));

        PO1.requestPlayground();
        //System.out.println(PO1.OwnerPlaygrounds.get(1));

        System.out.println("Book a Playground");
        Player p = new Player();
        p.bookPlayground();

    }

}
