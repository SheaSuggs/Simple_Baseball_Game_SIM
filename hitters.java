/*
the point of this class is to determine if the pitcher has thrown
in the zone or out of the zone

Assume the pitcher has thrown a strike, uses this batter's average 
to determine wheter he hits the pitch (methods returns true) 
or swings and misses (method returns false). 
*/

package Suggs_Project2;

import java.util.Random;

public class hitters 
{
    private String name;
    private double battingAvg;

    public hitters(String name, double battingAvg){
        this.name = name; 
        this.battingAvg = battingAvg;
    }

    public String getName(){
        return name;
    }public void setName(String name){
        this.name = name;
    }public double getBattingAvg(){
        return battingAvg;
    }public void setBattingAvg(double battingAvg){
        this.battingAvg  = battingAvg;
    }


    public boolean hitting()// method to know what team is batting 
    {
        // this function makes a radnom number 
        // this compares a random number to the batting average 
        // if the number is in the zone and then this 
        // returns true the player hit the ball and fasle mean the player missed the ball


        Random rnd = new Random();
        boolean playerHit = true;
        double batingPercent = battingAvg * 100;

        int val1 = rnd.nextInt(100);
        if(batingPercent >= val1)
        {
            playerHit = true;
        }
        else if(batingPercent < val1)
        {
            playerHit = false;
        }

        return playerHit; 
    
    }

    // the draft said i needed this 
    // not sure what the point of this funciton is
    public String toString(){
        String str = ("Batter name: " + name + "batting average: " + battingAvg);
        return str;
    }
}
