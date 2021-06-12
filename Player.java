package gofo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Rania Alaa
 */
public class Player extends User {

    Scanner input = new Scanner(System.in);
    Lists list = new Lists();

    /**
     * Player default constructor
     */
    public Player() {
    }

    /**
     * Player parameterized constructor to to initialize the attributes
     *
     * @param name
     * @param address
     * @param phone
     * @param mail
     * @param pass
     */
    public Player(String name, String address, String phone, String mail, String pass) {
        super(name, address, phone, mail, pass);
    }

    /**
     * Filter function takes time of slot from user and return all available playground
     * @param time
     * @param inLoc
     */
    public void Filter(int time, ArrayList<Playground> inLoc) {
        ArrayList<Playground> playgroundAreaTime = new ArrayList<>();
        int index;
        for (int i = 0; i < inLoc.size(); i++) {
            if (inLoc.get(i).getStartTime() <= time && inLoc.get(i).getEndTime() > time) {
                index = time - inLoc.get(i).getStartTime();
                if (inLoc.get(i).getTime(index) == 1) {
                    playgroundAreaTime.add(inLoc.get(i));
                }
                for(int j=0; j<playgroundAreaTime.size();j++)
                {
                 System.out.println(playgroundAreaTime.get(j));
                }
            }
        }
    }

    /**
     * PlaygroundsInArea function that takes area from user and return all available playground
     * @param Area
     * @return ArrayList<>
     */
    public ArrayList<Playground> PlaygroundsInArea(String Area) {
        ArrayList<Playground> playgroundArea = new ArrayList<>();
        int size = list.playgroundList.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            if (Area.equalsIgnoreCase(list.playgroundList.get(i).getLocation())) {
                playgroundArea.add(list.playgroundList.get(i));
                System.out.println("Playground(s) available in area:");
                System.out.println(list.playgroundList.get(i));
            }
        }

        return playgroundArea;
    }

    /*
	 * A function that allow the user to search and book a playground
	 * @param area
     */
    public void bookPlayground() {
        System.out.println("Enter Area");
        String area = input.nextLine();
        this.PlaygroundsInArea(area);
        System.out.println("Enter time slot");
        int timeSlot = input.nextInt();
        this.Filter(timeSlot, this.PlaygroundsInArea(area));
        System.out.println("Enter playground Id to book");
        int id=input.nextInt();
        int slot = timeSlot - (list.playgroundList.get(id-1).getStartTime());
        list.playgroundList.get(id-1).setTime(0, slot);
        System.out.println("Booked successfully !");
        System.out.println("Must pay "+list.playgroundList.get(id-1).getPricePerHour()+"  within 2 days");

    }

}
