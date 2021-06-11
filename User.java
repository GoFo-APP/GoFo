/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

/**
 *
 * @author Nourin
 */
public class User {
    
 private String Name;
   private String Location;
   private String PhoneNumber;
   private String Email;
   private String Password;
   private String UserType;
   /**Parameterized constructor to initialize the attributes
    * 
    * @param n
    * @param address
    * @param phone
    * @param mail
    * @param pass
    * @param type
    */
   public User(String n,String address, String phone, String mail, String pass, String type ){
       Name=n;
       Location=address;
       PhoneNumber=phone;
       Email=mail;
       Password=pass;
       UserType=type;
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
    * getter for the private attribute UserType
    * @return String
    */
   public String get_UserType(){
   return UserType;
   }

    /**
     * @param args the command line arguments
     */
}
