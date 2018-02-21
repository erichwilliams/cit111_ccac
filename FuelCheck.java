package fuelcheck;

import java.util.Scanner;

public class FuelCheck {

    public static void main(String[] args) {
        
        //Declaring program strings; questions and statements to give to the user.
        
        String Title = "******** Will I make it? ********";
        String Question1 = "How many gallons of gas remain in your tank?";
        String Question2 = "How many miles to the next service station?";
        String Failure = "Red Alert! You'll be marooned soon! Sucker!";
        String Success = "Whew! You'll make it to the next station!";
        
        //Declaring needed variables for program calculations.
        //MilesPerGallon is fixed at 28.
        
        double GasTank;
        double StationDistance;
        double MilesPerGallon = 28;
        
        //Program logic begins with a scanner object for user input.
        
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println(Title);
        System.out.println(Question1);
        
        //GasTank is set to whatever value the user gives.
        
        GasTank = userInputScanner.nextDouble();
        
        System.out.println(Question2);
        
        //StationDistance is set to whatever the user gives.
        
        StationDistance = userInputScanner.nextDouble();
        
        //The GasTank value is multiplied by MilesPerGallon,
        //to calculate how many miles can be traveled.
        //If the miles that can be traveled are greater than
        //or equal to the distance to the gas station, a success message
        //is printed. Otherwise, a failure message is printed.
        
        if
        (GasTank * MilesPerGallon >= StationDistance){
            System.out.println(Success);
        }
        else
        System.out.println(Failure);
    }
}