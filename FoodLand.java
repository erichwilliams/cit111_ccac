/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Glitschen
 */

//Initially based off of an example java class given by our instructor, 
//Eric Darsow; most of that however is around
//the structure of some "println" lines.

public class FoodLand {
    
    public static void main(String[] args){
        
        //creating three integers for use in 'eating' the following items
        int DonutPercentEaten;
        int ChipsPercentEaten;
        int FriesPercentEaten;
        
        //creating three handle variables for three food items
        Donut My_Donut;
        BagOfChips My_Chips;
        CupOfFries My_Fries;
        
        //creating three new instances of these food items and attaching
        //them to the handle variables
        My_Donut = new Donut();
        My_Chips = new BagOfChips();
        My_Fries = new CupOfFries();
        
        //giving the three food items some generic names
        My_Donut.name = "Chloe's donuts";
        My_Chips.name = "David's chips";
        My_Fries.name = "John's fries";
        
        //Setting the default calories of two of the food items
        My_Donut.calories = 100;
        My_Chips.calories = 145;
        My_Fries.calories = 135;
        
        //Setting the default salting of two of the food items
        My_Chips.salt = false;
        My_Fries.salt = false;
        
        //Setting the presense of ridges for the chips
        My_Chips.ridged = false;
        
        //Setting the flavors of two of the food items
        My_Donut.Flavor = "Plain";
        My_Chips.Flavor = "Regular";
        My_Fries.Flavor = "Regular";
        
        
        //Printing a confirmation that our food items are still 'whole'.
        System.out.println(My_Donut.name + " precent remaining is " 
                + My_Donut.getPercRemaining());
        
        System.out.println(My_Chips.name + " precent remaining is " 
                + My_Chips.getPercRemaining());
        
        System.out.println(My_Fries.name + " precent remaining is " 
                + My_Fries.getPercRemaining());          
        
        //Calorie counting for My_Donut
        System.out.println(My_Donut.name + " have " + My_Donut.calories +
        " calories; they are " + My_Donut.Flavor + " flavor");
        System.out.println("Are they glazed: " + My_Donut.glazed);
        
        //And when they are glazed
        My_Donut.glaze(true);
        System.out.println(My_Donut.name + " have " + My_Donut.calories +
        " calories when glazed; they are " + My_Donut.Flavor + " flavor."); 
        System.out.println("Are they glazed: " + My_Donut.glazed);
        
        //Calorie counting for My_Chips
        System.out.println(My_Chips.name + " have " + My_Chips.calories +
        " calories; they are " + My_Chips.Flavor + " flavor");
        System.out.println("Are they ridged: " + My_Chips.ridged);
        System.out.println("Are they salted: " + My_Chips.salt);
        
        //And when they are the salted flavor.
        My_Chips.salted(true);
        System.out.println(My_Chips.name + " have " + My_Chips.calories +
        " calories when salted; they are " + My_Chips.Flavor + " flavor.");
        
        //And when they are ridged.
        My_Chips.ridge();
        System.out.println("Are they ridged: " + My_Chips.ridged);
        System.out.println("Are they salted: " + My_Chips.salt);     
        
        //Calorie counting for My_Fries
        System.out.println(My_Fries.name + " have " + My_Fries.calories +
        " calories; they are " + My_Fries.Flavor + " flavor.");
        System.out.println("Are they salted: " + My_Fries.salt);
        
        //And when they are the salted flavor.  
        My_Fries.salted(true);
        System.out.println(My_Fries.name + " have " + My_Fries.calories +
        " calories when salted; they are " + My_Fries.Flavor + " flavor.");
        System.out.println("Are they salted: " + My_Fries.salt);
        
        //Setting how much of the donut is eaten, and then printing how much
        //of it is still remaining.
        DonutPercentEaten = 67;
        My_Donut.simulateEating(DonutPercentEaten);
        
        System.out.println("After being eaten, " + My_Donut.name 
                + " percent remaining is " + My_Donut.getPercRemaining());
    
        //Setting how much of the chips are eaten, and then printing how much
        //of it is still remaining.
        ChipsPercentEaten = 77;
        My_Chips.simulateEating(ChipsPercentEaten);
       
        System.out.println("After being eaten, " + My_Chips.name 
                + " percent remaining is " + My_Chips.getPercRemaining());
    
        //Setting how much of the fries are eaten, and then printing how much
        //of it is still remaining.
        FriesPercentEaten = 99;
        My_Fries.simulateEating(FriesPercentEaten);
        
        System.out.println("After being eaten, " + My_Fries.name 
                + " percent remaining is " + My_Fries.getPercRemaining());
    }   
};