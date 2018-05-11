/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;

/**
 *
 * @author Glitschen
 */

//This class acts as the template for a VendingMachine object, with it's name
//stock, and collected cash to be set by a main class that uses it.
public class VendingMachine {

    //Declaring strings related to object operation.
    String name;
    String stock_set = "'s stock has been set!";
    String money_set = " has been entered into ";
    String cash_earned = "The total money in the machine: $";
    String cash_leftover = " cash is leftover!";
    String not_enough_money_chips = "Sorry, you cannot purchase any chips!";
    String too_many_chips = "Sorry, you cannot purchase that many chips!";
    String sold_out_chips = "Sorry, we are out of chips!";
    String not_enough_money_candy = "Sorry, you cannot purchase any candy!";
    String too_much_candy = "Sorry, you cannot purchase that much candy!";
    String sold_out_candy = "Sorry, we are out of candy!";
    String not_enough_money_nuts = "Sorry, you cannot purchase any nuts!";
    String too_much_nuts = "Sorry, you cannot purchase that many nuts!";
    String sold_out_nuts = "Sorry, we are out of nuts!";
    String you_selected = "You have selected ";
    String chips = " potato chips.";
    String candy = " candy";
    String nuts = " nuts.";
    String totaled_cost = "The total cost is $";
    String thank_you = "Thank You!";
        
    //Private variables
    private double cash_register = 0.00;
    private double chips_Price = 1.25;
    private double candy_Price = 1.50;
    private double nuts_Price = 1.00;
    
    //public variables
    public int chips_stock;
    public int candy_stock;
    public int nuts_stock;
    double total_money;
    double total_price;
    
    //Method for setting the name of this machine.
    public void set_name(String new_name){
    name = new_name;
    };
    
    //Method for getting the name of this machine
    public void get_name(){
    System.out.println(name);
    };
    
    //Method for setting the stock of our items.
    public void set_stocks(int chips_stocks, int candy_stocks, int nuts_stocks){
    chips_stock = chips_stocks;
    candy_stock = candy_stocks;
    nuts_stock = nuts_stocks;
    System.out.println(name + stock_set);
    };
    
    //Method for setting the money the customer has placed into the machine.
    public void set_money(double money){
    total_money = total_money + money;
    System.out.println("$" + total_money + money_set + name + "!");
    };
    
    //Method for reporting the money the customer has placed in this machine,
    //and adding it to the total money that has ever been spent on a vending
    //machine object.
    public double get_money(double money){
    System.out.println("$" + total_money + cash_leftover);
    return money + cash_register;
    };
    
    //Method for resetting the total_price variable after a purchase,
    //and incrementing the tally of total purchases made with any
    //vending machine object
    public int reset_total_price(int reset){
    total_price = 0;
    reset = reset + 1;
    return reset;
    };
    
    //Method for checking the total money spent.
    public void get_cash_register(){
    System.out.println(cash_earned + cash_register);
    };
    
    //Method for purchasing chips.
    public void purchase_chips(int total_purchase){
    if (total_money < chips_Price){
    System.out.println(not_enough_money_chips);
    }
    else
        
    if (total_purchase > chips_stock){
    System.out.println(too_many_chips);
    }
    
    else
    if (chips_stock > 0){
    total_price = chips_Price * total_purchase;
    cash_register = cash_register + total_price;
    total_money = total_money - total_price;
    chips_stock = chips_stock - total_purchase;
    
    System.out.println(you_selected + total_purchase + chips);
    System.out.println(totaled_cost + total_price);
    System.out.println(thank_you);
        }
    
    else
    System.out.println(sold_out_chips);
    };
    
    
    
    //Method for purchasing candy.
    public void purchase_candy(int total_purchase){
    if (total_money < candy_Price){
    System.out.println(not_enough_money_candy);
    }
    else
        
    if (total_purchase > candy_stock){
    System.out.println(too_much_candy);
    }
    
    else
    if (candy_stock > 0){
    total_price = candy_Price * total_purchase;
    cash_register = cash_register + total_price;
    total_money = total_money - total_price;
    candy_stock = candy_stock - total_purchase;
    
    System.out.println(you_selected + total_purchase + candy);
    System.out.println(totaled_cost + total_price);
    System.out.println(thank_you);
        }
    
    else
    System.out.println(sold_out_candy);
    };
    
    
    
    //Method for purchasing nuts.
    public void purchase_nuts(int total_purchase){
    if (total_money < nuts_Price){
    System.out.println(not_enough_money_nuts);
    }
    
    else
    if (total_purchase > nuts_stock){
    System.out.println(too_much_nuts);
    }
    
    else
    if (nuts_stock > 0){
    total_price = nuts_Price * total_purchase;
    cash_register = cash_register + total_price;
    total_money = total_money - total_price;
    nuts_stock = nuts_stock - total_purchase;
    
    System.out.println(you_selected + total_purchase + nuts);
    System.out.println(totaled_cost + total_price);
    System.out.println(thank_you);
        }
    
    else
    System.out.println(sold_out_nuts);
    };
    
}//End of class.