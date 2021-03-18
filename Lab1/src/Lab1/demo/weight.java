package Lab1.demo;

import java.util.Scanner;

public class weight {
	
	    static Scanner keyboard = new Scanner(System.in);

	    public static void main(String[] args)
	    {
	        double weight = getEarthWeight();       
	        double newWeight = CalculateWeight(weight);
	        System.out.println("Your weight on earth is : " + weight );
	        System.out.println("Your weight on Mars is :  " + newWeight );
	        
	    }

	    static double getEarthWeight()
	    {
	        System.out.println("Enter your weight on earth : ");
	        return keyboard.nextDouble();
	    }

	    static double CalculateWeight(double weight)
	        {
	            double newWeight = 0;
	    
	            newWeight = (weight * 0.39);
	                
	            return newWeight;
	            
	        }
	    
	}
