/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Scanner;

/**
 *
 * @author Glitschen
 */

public class FoodOrderTabulator {
    
    //Variables for the total burgers and soda ordered in a session.
    private static int totalBurgersOrdered = (0);
    private static int totalSodaOrdered = (0);
    
    //Variables for the total burgers and sodas a customer has ordered.
    private static int BurgersOrdered = (0);
    private static int SodaOrdered = (0);
    
    //Hard-coded stock of burgers and soda.
    final static int MAXIMUM_BURGERS = (128);
    final static int MAXIMUM_SODA = (128);
    
    //Hard-coded prices and tax.
    final static double PRICE_BURGER = (1.99);
    final static double PRICE_SODA = (1.99);
    final static double TAX_BURGERS = (0.65);
    final static double TAX_SODA = (0.65);
    
    //Variables for the total costs of a customer's order.
    private static double Total_Cost = (0);
    private static double Total_Tax = (0);
    
    //Variables for the total revenue, taxation and income of a session.
    private static double Total_Revenue = (0);
    private static double Total_Taxation = (0);
    private static double Total_Income = (0);
    
        public static void main(String[] args){
        System.out.println("*Beginning tabulation.*");
        
        //Creating two scanners, and an integer and a string, for user input.
        String choice;       
        Scanner chooser = new Scanner(System.in);
        
        int order;
        Scanner orderer = new Scanner(System.in);

        //Two booleans for helping determine which
        //messages the user should see.
        boolean OrderQuestion = false;
        boolean InvalidOrder = false;
        
        //String is initalized with "Yes", for the while-loop to work.
        String ordering = "Yes";
        
        //While-loop for the user interface, meant to terminate
        //if no more orders are to be made within a given session.
        while("Yes".equals(ordering)){ 
        
        //Boolean is set to false each time the loop begins
        //or begins over again.
        OrderQuestion = false;
        
        //This message both prompts and tells the user how to
        //make their order.
        
        System.out.println("[Burger] or [Soda], "
        + "see your [Totals], [Reset] your order, or [Finish] your order?");
            
        choice = chooser.next();
        
        //Switch for the user's input.
        switch(choice){
        
        //Case for ordering burgers.
        case "Burger":
        System.out.println("How many burgers?");
        order = orderer.nextInt();
        orderBurgers(order);
        break;
        
        //Case for ordering soda.
        case "Soda":
        System.out.println("How many sodas?");
        order = orderer.nextInt();
        orderSoda(order);
        break;
        
        //Case for finalizing an order.
        case "Finish":
        OrderQuestion = true;
        orderFinalize();
        resetData();   
        break;
        
        //Case for displaying current order totals.
        case "Totals":
        displayOrderTotals();
        break;
        
        //Case for resetting order data.
        case "Reset":
        resetData();
        System.out.println("Order data reset.");
        break;
        
        //Case for any other input.
        default:
        InvalidOrder = true;
        System.out.println("Please type your choice exactly.");
        break;
        }
    
    if(OrderQuestion == true){
    System.out.println("New order, [Yes] or [No]?");
    ordering = orderer.next();
    }
    
    else if(InvalidOrder == true){
    System.out.println("Did you want to order an item, [Yes] or [No]?");
    InvalidOrder = false;
    ordering = orderer.next();
    }
    
    else{
    System.out.println("More items to order, [Yes] or [No]?");
    ordering = orderer.next();
    }
    
    }
    
    //If no more orders are to be made, the program is terminated
    //and the final statistics are displayed.
    endProgram();
    }  
        
    //Method for ordering burgers and calculating related variables.
        public static int orderBurgers(int burgers){
            
            BurgersOrdered = burgers;
            
            if(totalBurgersOrdered >= MAXIMUM_BURGERS){
            System.out.println("Sorry, we are out of burgers!");
            System.out.println("***********************");
            return 0;
            }    
            
        else if(totalBurgersOrdered < MAXIMUM_BURGERS){
            
        if(BurgersOrdered <= MAXIMUM_BURGERS){
        totalBurgersOrdered = totalBurgersOrdered + BurgersOrdered;
        Total_Cost = Total_Cost + (PRICE_BURGER * BurgersOrdered);
        Total_Tax = Total_Tax + (TAX_BURGERS * BurgersOrdered);
        System.out.println("Ordering " + burgers + " burgers!");
        }
        
        else if(BurgersOrdered > MAXIMUM_BURGERS){
            BurgersOrdered = 0;
            System.out.println("Sorry, we only have " + 
            (MAXIMUM_BURGERS - totalBurgersOrdered) + " burgers left!");
            System.out.println("Please order that many or fewer burgers.");
            System.out.println("***********************");
            return 0;
        }        

            else if(totalBurgersOrdered >= MAXIMUM_BURGERS){
            BurgersOrdered = 0;
            System.out.println("Sorry, we are out of burgers!");
            System.out.println("***********************");
            return 0;
            }
        
            else if(BurgersOrdered > totalBurgersOrdered){
            System.out.println("Sorry, we are out of burgers!");
            System.out.println("***********************");
            return 0;
            }
            
        else
            System.out.println("Sorry, we are out of burgers!");
            System.out.println("***********************");
            return 0;
        }
            System.out.println("Sorry, we are out of burgers!");
            System.out.println("***********************");    
    return 0;
    }
        
    //Method for ordering soda and calculating related variables.
        public static int orderSoda(int soda){
            
            SodaOrdered = soda;
            
            if(totalSodaOrdered >= MAXIMUM_SODA){
            System.out.println("Sorry, we are out of soda!");
            System.out.println("***********************");
            return 0;
            }    
            
        else if(totalSodaOrdered < MAXIMUM_SODA){
            
        if(SodaOrdered <= MAXIMUM_SODA){
        totalSodaOrdered = totalSodaOrdered + SodaOrdered;
        Total_Cost = Total_Cost + (PRICE_SODA * SodaOrdered);
        Total_Tax = Total_Tax + (TAX_SODA * SodaOrdered);
        System.out.println("Ordering " + soda + " sodas!");
        }
        
        else if(SodaOrdered > MAXIMUM_SODA){
            SodaOrdered = 0;
            System.out.println("Sorry, we only have " + 
            (MAXIMUM_SODA - totalSodaOrdered) + " sodas left!");
            System.out.println("Please order that many or fewer sodas.");
            System.out.println("***********************");
            return 0;
        }        

            else if(totalSodaOrdered >= MAXIMUM_SODA){
            SodaOrdered = 0;
            System.out.println("Sorry, we are out of sodas!");
            System.out.println("***********************");
            return 0;
            }
        
            else if(SodaOrdered > totalSodaOrdered){
            System.out.println("Sorry, we are out of sodas!");
            System.out.println("***********************");
            return 0;
            }
            
        else
            System.out.println("Sorry, we are out of sodas!");
            System.out.println("***********************");
            return 0;
        }
            System.out.println("Sorry, we are out of sodas!");
            System.out.println("***********************");    
    return 0;
    }
    
    //Method for finalizing sales and displaying the customer's order totals.
        public static void orderFinalize(){
            
        Total_Revenue = Total_Revenue + Total_Cost;
        Total_Taxation = Total_Taxation + Total_Tax;
        Total_Income = (Total_Revenue - Total_Taxation);
        
        System.out.println("Burgers Ordered: " + BurgersOrdered);
        System.out.println("Sodas Ordered: " + SodaOrdered);
        System.out.println("Your cost is: " + Total_Cost);
        System.out.println("Your tax is: " + Total_Tax);
        System.out.println("Your cost with tax is: " + (Total_Tax + Total_Cost));
        System.out.println("Thank You, Come Again!");
            System.out.println("***********************");
        }
        
        //Method for displaying order totals, while the customer is ordering.
        public static void displayOrderTotals(){
        System.out.println("Burgers Ordered: " + BurgersOrdered);
        System.out.println("Sodas Ordered: " + SodaOrdered);
        System.out.println("Your cost is: " + Total_Cost);
        System.out.println("Your tax is: " + Total_Tax);
        System.out.println("Your cost with tax is: " + (Total_Tax + Total_Cost));
            System.out.println("***********************");
        }
        
    //Method for resetting order data, after a customer order is finished.
        public static void resetData(){
        totalBurgersOrdered = (totalBurgersOrdered - BurgersOrdered);
        totalSodaOrdered = (totalSodaOrdered - SodaOrdered);
        BurgersOrdered = 0;
        SodaOrdered = 0;
        Total_Cost = 0;
        Total_Tax = 0;
        }
        
    //Method for ending the program, after no more orders are to be made.
        public static void endProgram(){
        System.out.println("Thank You! Come Again!");
            System.out.println("***********************");
        System.out.println("Total burgers ordered: " + totalBurgersOrdered);
        System.out.println("Total soda ordered: " + totalSodaOrdered);
        System.out.println("Total sales generated: " + Total_Revenue);
        System.out.println("Total taxation generated: " + Total_Taxation);
        System.out.println("Total income generated: " + Total_Income);
        System.out.println("***********************");
        System.exit(0);
        }
    }