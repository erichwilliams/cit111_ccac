/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
//Source of "number trimming" information.

package week8;
import java.util.Scanner;

/**
 *
 * @author Glitschen
 */
public class UnitConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Title = "**** UNIT CONVERTER ****";
        String Spacer = "************************";
        String Selection1 = "Enter 'C2F' for Celsuis to Farhenheit.";
        String Selection2 = "Enter 'F2M' for Feet to Metres.";
        String Selection3 = "Enter 'P2K' for Pounds to Kilograms.";
        String Conversion1 = "Enter Celsuis; get value in Farhenheit.";
        String Conversion2= "Enter Feet; get value in metres.";
        String Conversion3 = "Enter Pounds; get value in kilograms.";
        String Result1 = "Farhenheit value is: ";
        String Result2 = "Metre value is: ";
        String Result3 = "Kilogram value is: ";
        String Default = "Please enter one of the above.";
        String Question = "Do you want to convert any more units? Y / N";
        String Again = "Ok! Same as always.";
        String Goodbye = "Good luck with whatever!";
        
        String Answer;
        String Choice;  
        
        double Unit;
        double Result;
        
        Scanner UserAnswer = new Scanner(System.in);
        Scanner UnitNumber = new Scanner(System.in);
        
        boolean loop = true;
        
        //Begin printing lines.
        System.out.println(Spacer);
        System.out.println(Title);
        System.out.println(Spacer);
        System.out.println();
        
        //Beginning a loop.
        while (loop == true){
            
        System.out.println(Spacer);           
        System.out.println(Selection1);
        System.out.println(Selection2);
        System.out.println(Selection3);                                
        System.out.println(Spacer);
          
        Choice = UserAnswer.next();
        
        //Declaring a switch, for user selection of unit converters.
        switch(Choice){  
            
        //Celsuis to Farhenheit unit conversion, user is prompted for input.       
        case "C2F":
        System.out.println(Conversion1);
        Unit = UnitNumber.nextDouble();
        Result = convert_Celsuis_to_Farhenheit(Unit);
            System.out.format(Result1 + "%.2f%n", Result);
            System.out.println(Spacer);
            break;
            
            
        //Feet to Metres conversion, user is prompted for input.        
        case "F2M":
        System.out.println(Conversion2);
        Unit = UnitNumber.nextDouble();
        Result = convert_Feet_to_Metres(Unit);
            System.out.format(Result2 + "%.2f%n", Result);
            System.out.println(Spacer);
            break;
        
        //Pounds to Kilograms conversion, user is prompted for input.        
        case "P2K":
        System.out.println(Conversion3);
        Unit = UnitNumber.nextDouble();
        Result = convert_Pounds_to_Kilograms(Unit);
            System.out.format(Result3 + "%.2f%n", Result);
            System.out.println(Spacer);
            break;
        
        //Default case, reminds the user to enter a valid command.    
        default:
            System.out.println(Default);
            break;
        }
        
        //Prompt user if they want to convert any more units.
        System.out.println(Question);
        Answer = UserAnswer.next();
                
        if ("Y".equals(Answer)){
            System.out.println(Again);
            loop = true;
        }
        
        else{
            loop = false;       
        }
        }
        
        System.out.println(Goodbye);
    End_Program();
    
    };
    
    //Celsuis to Farhenheit conversion method.
    public static double convert_Celsuis_to_Farhenheit(double C){
        
        double Farhenheit1 = (C * 9 / 5);
        double Farhenheit2 = (Farhenheit1 + 32);
   
    return Farhenheit2;
    };
    
    
    //Feet to Metres conversion method.
    public static double convert_Feet_to_Metres(double Feet){
        
        double Metres = (Feet / 3.28);

    return Metres;
    };
    
    //Pounds to Kilograms conversion method.
    public static double convert_Pounds_to_Kilograms(double Pounds){
    
        double Kilo1 = (1 / 2.2);
        double Kilo2 = (Kilo1 * Pounds);
    
    return Kilo2;
    };
    
    //Program termination method.
    public static void End_Program(){
    System.exit(0); 
    };
}