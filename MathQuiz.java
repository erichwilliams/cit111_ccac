/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import  java.util.Scanner;

/**
 *
 * @author Glitschen
 */
public class MathQuiz {
    public static void main(String[] args){
        
        //Program Strings
        String Title = "--- Math Quiz ---";
        String Spacer = "----------------";
        String Question = "What is eight times eight, divided by two?";
        String Correct = "That's correct!";
        String TooLow = "That's too low...";
        String TooHigh = "That's too high...";
        String TryAgain = "Try Again!";
        String Failure = "The answer is ";
        String Explanation = "8 * 8 / 2 = 64 / 2 = ";
        String Thanks = "Thanks for playing!";
        
        //Program Integers
        int Answer = 8 * 8 / 2;
        int AttemptCounter = 0;
        int UserAnswer;
        
        // Scanner for user input
        Scanner AnswerScanner = new Scanner(System.in);
        
        // First output; a three-line title is printed.
        System.out.println(Spacer);
        System.out.println(Title);
        System.out.println(Spacer);
        
        //While-loop begins; it will end if the user fails three times,
        //or if the loop is broken.
        while(AttemptCounter < 3){
        
        //User is questioned, and their input is accepted.
        System.out.println(Question);
        UserAnswer = AnswerScanner.nextInt();
        
        //For a high answer; the user is told that their answer is too high,
        //and the Attempt Counter is incremented by one.
        if(UserAnswer > Answer){
        System.out.println(TooHigh);
        
        //If they can still give another answer, 
        //the user is also asked to try again.
        if (AttemptCounter < 2){
        System.out.println(TryAgain);
        }
        
        System.out.println(Spacer);
        AttemptCounter = AttemptCounter + 1;
        }
        
        //For a low Answer; the user is told that their answer is too low,
        //aand the Attempt Counter is incremented by one.
        else if(UserAnswer < Answer){
        System.out.println(TooLow);
        
        //If they can still give  another answer, 
        //the user is asked to try again.
        if (AttemptCounter < 2){
        System.out.println(TryAgain);
        }
        
        System.out.println(Spacer);
        AttemptCounter = AttemptCounter + 1;
        }
        
        //For a correct answer, the user is congratulated 
        //and the while-loop is broken.
        else if(UserAnswer == Answer){
        System.out.println(Correct);
        break;
        }
        
        //If the user has failed three times (or somehow more), 
        //the user is informed of the correct answer as the loop ends.
        if(AttemptCounter >= 3){
        System.out.println(Failure + Answer);
        }
    }
        //However the loop may end, the answer is explained,
        //and the user is thanked.
        System.out.println(Explanation + Answer);
        System.out.println(Thanks);
    }
}