/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import  java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Glitschen
 */
public class MysteryDoorGame {
    public static void main(String[] args){
        
                String Title1 = "-- WELCOME TO THE GAME OF THE CENTURY --";
                String Title2 = "--------- GRAND PRIZE OR GOATS ---------";        
                String Spacer = "----------------------------------------";
                String Prompt = "CHOSE THE ONE DOOR YOU WANT TO OPEN!";
                String Question = "WILL YOU PLAY, YES OR NO?";
    
            String UserPlaying;
            String UserAnswer;       
            Scanner AnswerScanner = new Scanner(System.in);
            
            System.out.println(Spacer);
            System.out.println(Title1);
            System.out.println(Title2);
            System.out.println(Spacer);
            System.out.println();
            System.out.println(Question);
            UserPlaying = AnswerScanner.nextLine();
            
            boolean playing = true;
            int Try = 3;
            
            if ("No".equals(UserPlaying)){
            playing = false;
            Try = 3;
            cancel();
            }
            
            if ("Yes".equals(UserPlaying)){
            System.out.println("OK!");
            playing = true;}
            
            System.out.println(Prompt);
            UserAnswer = AnswerScanner.nextLine();
            
            while(playing == true){
                
            //Call to door randomizer,
            //so the door with the prize is randomly chosen.
            int CorrectDoor = 0;
            int CorrectDoor1;
            CorrectDoor1 = randomizer(CorrectDoor);
            
        String Answer1 = "";
            
        switch (CorrectDoor1){
            case 0:
                Answer1 = "One";
                break;
            case 1:
                Answer1 = "Two";
                break;
            case 2:
                Answer1 = "Three";
                break;
            default:
                break;
        }
        
            int right;
            
        if (UserAnswer.equals(Answer1))
        right = 1;
        else
        right = 2;
            
            //Beginning a conditional while-loop.
            while(Try <= 3){        
            //Declaring our switch.
        switch(right){
  
        case 1:
            win();
            break;
            
        case 2:
            Try = Try + 1;
            fail();
            tryagain();
        
        default:
            System.out.println("CHOOSE A DOOR BETWEEN ONE AND THREE!");
                    }
            Scanner AnswerScannerTwo = new Scanner(System.in);
            UserAnswer = AnswerScannerTwo.nextLine();
        }
        System.out.println("SORRY, YOU GOT ANOTHER GOAT! THANKS FOR PLAYING!");
        break;
        }
        System.exit(0);
    }
    
    //The single job of this method is to end the program, for if the user says they do not want to play.
    public static void cancel(){
    System.out.println("SORRY FOR BOTHERING YOU!");
    System.exit(0);
    };
    
    //The single job of this method is to randomize which door is correct.
    public static int randomizer(int CorrectDoor1){
    Random rand = new Random();
    int CorrectDoor = rand.nextInt(3);
    return CorrectDoor;
   };
          
    //The single job of this method is to handle a correct aanswer.
    public static void win(){
    System.out.println("CONGRATULATIONS! YOU CHOSE THE DOOR WITH THE PRIZE!");
    System.out.println("THANKS FOR PLAYING!");
    System.out.println("--------------------");
    System.exit(0);
   };
    
    //The single job of this method is to handle an incorrect answer.
    public static void fail(){
    System.out.println("SORRY, YOU CHOSE THE DOOR WITH THE GOAT.");
    System.out.println("--------------------");
   };
    
    //The single job of this method is to offer another chance to the user,
    //intended to be run in response to only one incorrect answer.
    public static void tryagain() {
    System.out.println("DO YOU WANT TO TRY AGAIN?");
    String UserAnswer;
    Scanner AnswerScanner = new Scanner(System.in);
    UserAnswer = AnswerScanner.nextLine();
    int CorrectDoor = 0;
    
            switch(UserAnswer){
                
                case "Yes":
                System.out.println("OK!");
                System.out.println("--------------------");
                break;
                    
                case "No":
                System.out.println("GOODBYE!");
                System.out.println("THANKS FOR PLAYING!");
                System.out.println("--------------------");
                System.exit(0);
                
                default:
                break;
            }
        };
}