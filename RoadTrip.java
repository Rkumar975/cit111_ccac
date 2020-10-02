/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * simulates basic recorded data about a road trip to Moab, Utah
 * @author Rachhpal
 */
public class RoadTrip {
   @SuppressWarnings("UnusedAssignment")
   public static void main(String[] args){
       
       final double NEDS_MILES_PER_GALLON = 32.0;
       final double AVERAGE_GAS_PRICE = 2.65;
       // declaring and initializing variables
       String carMake = "2015 Toyota Corolla";
       String carName = "AJ";
       int maxPassengers = 5; // primitive type variable
       int currentNumberOfPassengers = 1;
       boolean carFull = false; 
       double tripOdometer = 0.0;
       double cashOnHand = 300.00;
       double distancetoMoabUtah = 1806.0;
       boolean destinationreached = false;
       
       double legDistance; // declairing this variable but not initializing
       
       // simulation of th roadtrip
       System.out.println("***Road Trip Simulator***"); 
       System.out.println("- -> Beginning of trip stats <- -");
       System.out.println("Make of car: " + carMake + " That can carry: " + maxPassengers);
       System.out.println("This car's name is " + carName);
       System.out.println("Distance to Destination: " + distancetoMoabUtah);
       System.out.println("Full Car? " + carFull + "; Current odometer; " + tripOdometer);
       System.out.println("I have $ " + cashOnHand + " to spend on this trip");      
       System.out.println("String trip with " + currentNumberOfPassengers + " Passenger");
       System.out.println("Destination Reached? " + destinationreached);
       System.out.println("***********************************************************");
       
       System.out.println();
       System.out.println("Beginning leg 1:");
       
       // calculate leg distance: 25% of total trip, store in legDistance
       double decimalOfOneQuarter = .25;
       legDistance = distancetoMoabUtah * decimalOfOneQuarter ;
       System.out.println("Check leg distance: " + legDistance);
       // increment trip odometer by leg distance, over-write odometer
       tripOdometer = tripOdometer + legDistance;
       // subtract leg distance from distanceTo destination, over-write distance
       distancetoMoabUtah = distancetoMoabUtah - legDistance;
       // "see" hitch hiker heading west
       System.out.println("Oh, look! A person who wants to go west, too!");
       // check if there is room in the car, if so. pick up hitch hiker
       if(carFull == false){
           System.out.println("car is not full, picking up hitcher");
           currentNumberOfPassengers = currentNumberOfPassengers + 1;
           // alternative shorter version: currentNumberOfPassengers++
           // do the code in this block
       } // close if ()
       // calculate price of gas for first leg and store in temp variable
       // gas price = (distance / milesPerGallon) * price per gallon
       Double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
       // deduct $ spent on gas from money remaining and over-write tripBudget
       cashOnHand = cashOnHand - gasPriceForLeg;
       // reprint status of variables to the console
       System.out.println();
       System.out.println("****Variable stats at the end of the leg 1****");
       System.out.println("Distance to Destination: " + distancetoMoabUtah);
       System.out.println("Full Car? " + carFull + "; Current odometer; " + tripOdometer);
       System.out.println("I have $ " + cashOnHand + " to spend on this trip");      
       System.out.println(currentNumberOfPassengers + " Passengers in car");
       System.out.println("Destination Reached? " + destinationreached);
   } // close main method
} // close class RoadTrip
