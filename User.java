/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeruser;

import java.util.Scanner;

/**
 *
 * @author nourin
 */
public class User {
   private String Name;
   private String Location;
   private String UserType;
   private String PhoneNumber;
   private String Email;
   private String Password;
   /**parameterised constructor to initialize the attributes
    * 
    * @param n
    * @param address
    * @param ID 
    * @param phone
    * @param mail
    * @param pass
    */
   public User(String n,String address, String Type, String phone, String mail, String pass ){
       Name=n;
       Location=address;
       UserType=Type;
       PhoneNumber=phone;
       Email=mail;
       Password=pass;
   }
   /**setter for the private attribute name
    * @param n
    */
   public void set_Name(String n){
       Name=n;
   }
   /**
    * setter for the private attribute address
    * @param address 
    */
   public void set_Location(String address){
       Location=address;
   }
   /**
    * setter for the private attribute Type
    * @param Type 
    */
   public void set_Type(String Type){
       UserType=Type;
   }
   /**
    * setter for the private attribute phone
    * @param phone 
    */
   public void set_Phone(String phone){
       PhoneNumber=phone;
   }
   /**
    * setter for the private attribute Email
    * @param mail 
    */
   public void set_Email(String mail){
       Email=mail;
   }
   /**
    * setter for the private attribute Password
    * @param pass 
    */
   public void set_Password(String pass){
       Password=pass;
   }
   /**
    * getter for the private attribute Name
    * @return name
    */
   public String get_Name(){
       return Name;
   }
   /**
    * getter for the private attribute Location
    * @return Location
    */
   public String get_Location(){
       return Location;
   }
   /**
    * getter for the private attribute UserType
    * @return UserType
    */
   public String get_Type(){
       return UserType;
   }
   /**
    * getter for the private attribute PhoneNumber
    * @return PhoneNumber
    */
   public String get_Phone(){
       return PhoneNumber;
   }
   /**
    * getter for the private attribute Email
    * @return Email
    */
   public String get_Email(){
       return Email;
   }
   /**
    * getter for the private attribute Password
    * @return Password
    */
   public String get_Password(){
       return Password;
   }
    /**
    *Function SignUp allow user (player or playground owner ) to create an account
    *  
    */
   public void SignUp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GoFo!");
        System.out.println("signn up ");
        System.out.println("Name:");
        String n = input.nextLine();
        System.out.println("Location:");
        String address = input.nextLine();
        System.out.println("Phone Number:");
        String phone = input.nextLine();
        System.out.println("Email Address:");
        String mail = input.nextLine();
        System.out.println("Password:");
        String pass = input.nextLine();
        System.out.println("Sign up as a Player or Playground Owner:");
        String Type = input.nextLine();
        User u1 = new User(n, address, Type, phone, mail, pass);
   }
}