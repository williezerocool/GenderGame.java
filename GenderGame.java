/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gendergame;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class GenderGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String firstName, lastName, gender, married;
        int age;
        
        
        System.out.print("What is your gender (M or F)? ");
        gender = keyboard.next();
        
        System.out.print("What is your first name? ");
        firstName = keyboard.next();
        
        System.out.print("What is your lasst name? ");
        lastName = keyboard.next();
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        if("m".endsWith(gender) && age >= 20){
            System.out.println("Then I shall call you Mr. " + lastName);
        }else if("m".endsWith(gender) && age < 20){
            System.out.println("Then I shall call you " + firstName + " " +lastName);
        }
   
        if("f".endsWith(gender) && age >= 20){
            System.out.print("Are you married? ");
            married = keyboard.next();
            if("yes".equals(married) ){
                System.out.println("Then I shall call you Mrs. " + lastName);
            }else{
                System.out.println("Then I shall call you Ms. " + lastName);
            }
        }else if("f".endsWith(gender) && age < 20){
            System.out.println("Then I shall call you " + firstName + " " +lastName);
        }
    
    
    
    
    }
    
}
