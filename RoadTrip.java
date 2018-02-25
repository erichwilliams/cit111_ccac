package roadtrip;

public class RoadTrip {

    public static void main(String[] args) {
    String carMake = "1996 Madza Protege";
    String carName = "Nedfry";
    
    double MilesPerGallon = 32;
    double GasPrice = 2.65;
    
    int maxPassengers = 5;
    int currentPassengers = 1;
    boolean carFull = false;
    
    double tripOdometer = 0.0;
    double tripBudget = 300.0;
    double distancetoUtah = 1806.5;
    boolean destinationReached = false;
    
    double cashonhand = 300.00;
    double legDistance;
    
    System.out.println("********Road Trip Simulator********");
    System.out.println("-> Beginning of trip stats: <-");
    System.out.println("Make of car: " + carMake + " that can carry " + maxPassengers);
    System.out.println("The car's name is: " + carName);
    System.out.println("Distance to destination: " + distancetoUtah);
    System.out.println("Full Car? " + carFull + "; current odometer: " + tripOdometer);
    System.out.println("I have $" + tripBudget + " to spend on this trip.");
    System.out.println("Starting trip with " + currentPassengers + " passengers.");
    System.out.println("Destination reached? " + destinationReached);
    System.out.println("****************");
    System.out.println("");
    
        System.out.println("Beginning leg 1: ");
    
    double decimalofonequarter = 0.25;
    legDistance = distancetoUtah * decimalofonequarter;
    
    System.out.println("Check leg distance: " + legDistance);
    
    tripOdometer = tripOdometer + legDistance;
    distancetoUtah = distancetoUtah - legDistance;
    
    System.out.println("Oh look! A person who want to go west!");
    
    if (carFull == false){
            System.out.println("Car is not full; picking up hitchers.");
                    currentPassengers = currentPassengers + 1;
    }
    else
    System.out.println("Car is full; cannot pick up hitchers.");    
    
        System.out.println("");
        System.out.println("**** Variable stats at the end of leg 1: ****");
        System.out.println("Distance to Destination: " + distancetoUtah);
        System.out.println("Full Car? " + carFull + "; current odometer: " + tripOdometer);
        System.out.println("I have $" + cashonhand + " to spend on this trip.");
        System.out.println(currentPassengers + " passengers in car.");
        System.out.println("Destination reached? " + destinationReached);
    
    double gasPrice = (legDistance / MilesPerGallon) * GasPrice;
    
    cashonhand = cashonhand - gasPrice;
    
    legDistance = 500;
    
        System.out.println("Oh look! Another person who want to go west!");
                
        if ((currentPassengers + 2) <= 5){
            carFull = true;}
        if ((currentPassengers + 2) < 5){
            carFull = false;}
         
   if (carFull == false){
            System.out.println("Car is not full; picking up hitchers.");
                    currentPassengers = currentPassengers + 2;
                    
    }
   else if (carFull == true){
    System.out.println("Car is full; cannot pick up hitchers.");
   }
        
        gasPrice = (legDistance / MilesPerGallon) * GasPrice;
        cashonhand = cashonhand - gasPrice;
        
        System.out.println("");
        System.out.println("Gas spent on leg 2: " + gasPrice);
            
        System.out.println("**** Variable stats at the end of leg 2: ****");
        System.out.println("Distance to Destination: " + distancetoUtah);
        System.out.println("Full Car? " + carFull + "; current odometer: " + tripOdometer);
        System.out.println("I have $" + cashonhand + " to spend on this trip.");
        System.out.println(currentPassengers + " passengers in car.");
        System.out.println("Destination reached? " + destinationReached);
        
        legDistance = distancetoUtah - legDistance;
        
        System.out.println("Oh look! Two more who want to go west!");
        
        if ((currentPassengers + 2) <= 5){
            carFull = true;}
        if ((currentPassengers + 2) < 5){
            carFull = false;}
         
        
    if (currentPassengers + 2 < maxPassengers){
            System.out.println("Car is not full; picking up hitchers.");
            currentPassengers = currentPassengers + 2;
    } else {
        System.out.println("Car is full; cannot pick up hitchers.");
    };    
    
        gasPrice = (legDistance / MilesPerGallon) * GasPrice;
        cashonhand = cashonhand - gasPrice;
        System.out.println("Amount spent on gas at leg 3: " + gasPrice);
        
        destinationReached = true;
        
        System.out.println("");
        System.out.println("**** Variable stats at the end of leg 3: ****");
        System.out.println("Distance to Destination: " + distancetoUtah);
        System.out.println("Full Car? " + carFull + "; current odometer: " + tripOdometer);
        System.out.println("I have $" + cashonhand + " to spend on this trip.");
        System.out.println(currentPassengers + " passengers in car.");
        System.out.println("Destination reached? " + destinationReached);
    }
    }