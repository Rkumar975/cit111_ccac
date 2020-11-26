/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2;

/**
 *
 * @author Rachhpal
 */
public class Car {
    // public member variables: we don't need to implement logic 
    // to change these values
    public int year;
    public String makeModel;
    
    // private member variables because we want to control 
    // their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;
    
    /**
     * simulates starting this car instance's engine
     */
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }
    
    /**
     * Simulates stopping this car instance's engine
     */
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("...grblllll....shldunk");
    }
    
    /**
     * Allows access to our private engine status boolean member 
     * variable called isEngineRunning
     * @return the status of the engine: true means on, false means off
     */
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    /**
     * Allows access to our private speed variable
     * @return this car object's current speed
     */
    public double getCurrentSpeed(){
        return speed;
    }
    
    /**
     * Controls the car's increases in speed
     * @param mphIncrease 
     * @return the current speed of the car after the acceleration
     * has been taken into account
     */
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }
    /**
     * Controls the car's decreases in speed
     * @param mphDecrease
     * @return the current speed of the car after the deceleration
     */
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }
    
}