/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;
import java.util.Scanner;

/**
 *
 * @author Glitschen
 */
public class VendingMachineLand {
            public static void main(String[] args){
            
            //Declaring strings related to program operation.
            String title = "VENDING MACHINE";
            String spacer = "**************";
            String name_question = "What is this vending machine's name?";
            String name_statement = "The name of this machine is: ";
            String stock_question = "How many bags of chips, candies and nuts are in stock?";
            String money_question = "Enter how much money you have to spend:";
            String purchase_question = "Do you want to purchase chips[1], candy[2] or nuts[3]?";
            String purchase_chips_question = "How many bags of chips?";
            String purchase_candy_question = "How much candy?";
            String purchase_nuts_question = "How many bags of nuts?";
            String invalid_choice = "Invalid choice.";
            String total_money_spent_message = " money has been spent on vending machines.";
            String total_purchases_message = "The total times you have purchased from a vending machine is: ";
            String loop_question1 = "Are you done purchasing items, [y] or [n]?";
            String loop_question2 = "Do you want to play with any more vending machines, [y] or [n]?";
            
            //Declaring two booleans related to program loops.
            boolean loop1 = true;
            boolean loop2 = true;
            
            //Declaring variables related to user choices.
            double input_money;
            int input_stock1;
            int input_stock2;
            int input_stock3;
            int choice;
            int total_purchases = 0;
            double money_spent = 0;
            double total_money_spent = 0;
            
            //Declaring strings related to user choices.
            String chooser;
            String input_name;
            
            //Declaring two scanners
            Scanner Inputter = new Scanner(System.in);
            Scanner Namer = new Scanner(System.in);
            
            //First output is a little title.
            System.out.println(spacer);
            System.out.println(title);
            System.out.println(spacer);
            
            //Beginning the UI loop.
            while(loop2 == true){
            
            //Creating a vending machine object.
            VendingMachine Vender;
            Vender = new VendingMachine();
            
            //Asking the user to set the name of their vending machine,
            //and then setting and reporting back what that name is
            System.out.println(name_question);
            input_name = Namer.next();
            Vender.set_name(input_name);
            System.out.println(name_statement);
            Vender.get_name();
            
            //Asking the user to determine what stock of each item is availible.
            System.out.println(stock_question);
            
            input_stock1 = Inputter.nextInt();
            input_stock2 = Inputter.nextInt();
            input_stock3 = Inputter.nextInt();
            Vender.set_stocks(input_stock1, input_stock2, input_stock3);
            
            //Asking the user to determine what money they may spend on
            //the machine.
            System.out.println(money_question);
            input_money = Inputter.nextDouble();
            Vender.set_money(input_money);
            
            //Beginning the purchasing loop.
            while(loop1 == true){
            System.out.println(purchase_question);
            choice = Inputter.nextInt();
            
            //Beginning a switch for purchasing different items.
            switch(choice){
                
            //Case for purchasing chips.
            case 1:
            System.out.println(purchase_chips_question);
            choice = Inputter.nextInt();
            Vender.purchase_chips(choice);
            Vender.reset_total_price(total_purchases);
            total_purchases = Vender.reset_total_price(total_purchases);
            Vender.get_cash_register();
            total_money_spent = Vender.get_money(total_money_spent);
            System.out.println(total_money_spent + total_money_spent_message);
            System.out.println(total_purchases_message + total_purchases);
            break;
            
            //Case for purchasing candy.
            case 2:
            System.out.println(purchase_candy_question);
            choice = Inputter.nextInt();
            Vender.purchase_candy(choice);
            Vender.reset_total_price(total_purchases);
            total_purchases = Vender.reset_total_price(total_purchases);
            Vender.get_cash_register();
            total_money_spent = Vender.get_money(total_money_spent);
            System.out.println(total_money_spent + total_money_spent_message);
            System.out.println(total_purchases_message + total_purchases);
            break;
            
            //Case for purchasing nuts.
            case 3:
            System.out.println(purchase_nuts_question);
            choice = Inputter.nextInt();
            Vender.purchase_nuts(choice);
            Vender.reset_total_price(total_purchases);
            total_purchases = Vender.reset_total_price(total_purchases);
            Vender.get_cash_register();
            total_money_spent = Vender.get_money(total_money_spent);
            System.out.println(total_money_spent + total_money_spent_message);
            System.out.println(total_purchases_message + total_purchases);
            break;
            
            //Default case.
            default:
            System.out.println(invalid_choice);
            System.out.println(total_money_spent + total_money_spent_message);
            System.out.println(total_purchases_message + total_purchases);
            break;
            
            }//End of switch.
        
        //Once the switch has been gone through, the user is asked if they
        //want to stop purchasing items; the purchasing loop is broken
        //if they say yes.
        System.out.println(loop_question1);
        chooser = Inputter.next();
        
        if( "y".equals(chooser)){
        loop1 = false;
        }
        
        }//End of purchasing loop.
            
    //Once the purchasing loop is broken, the user is asked if they want to
    //play with any more vending machine objects; if they say no, the loop is
    //broken and the program comes to an end.
    System.out.println(loop_question2);  
    chooser = Inputter.next();
    if( "n".equals(chooser)){
    loop2 = false;}
    
    else
    if ("y".equals(chooser)){
        loop1 = true;
            }
    
        }//End of main loop.
    }//End of main.
}//End of class.