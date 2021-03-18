package Lab1.demo;

import java.util.Scanner;

public class main {  
    public static void main(String[] args) {      
          
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Please enter how many person's weight you want to store : ");  
    	
    	n=sc.nextInt();  
    	
    	double[] array1 = new double[n];  
    	System.out.print("Please enter all weight on Earth : ");  
    	for(int i=0; i<n; i++)  
    	{  
    	   
    	array1[i]=sc.nextInt();  
    	}     
          
          
        double array2[] = new double[array1.length];  
          
          
        for (int i = 0; i < array1.length; i++) {   
            array2[i] = array1[i]* 0.39;   
        }    
          
           
        System.out.print("The weight on Earth is : ");  
        for (int i = 0; i < array1.length; i++) {   
           System.out.print(array1[i] + ", ");  
        }   
          
        System.out.println();  
          
           
        System.out.print("The weight on Mars is: ");  
        for (int i = 0; i < array2.length; i++) {   
           System.out.print(array2[i] + ", ");  
        }   
    }  
} 
