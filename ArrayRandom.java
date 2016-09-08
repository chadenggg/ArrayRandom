/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chadenggg
 */
import java.util.Scanner;
import java.util.Random;


public class ArrayRandom {
   
        Scanner input = new Scanner(System.in);
        Random c  = new Random();
  
        int array[]; int sum = 0 , max = 0 ;
        double average = 0 ; int size;
   
        
    public void show(){
            
       System.out.print("Input Array Size : " ) ;
            size=input.nextInt();
            array = new int [size];
            
                for (int a = 0 ; a < size; a++){
                    array[a]=c.nextInt(6000);
                    System.out.print(array[a]+" , ") ;           
            }
        }
        
    
       public void max() {
		for(int a = 0; a < size; a++)
                {
			if(array[a] > max)
                        max = array[a];
		}
                System.out.println();
		System.out.print("Max Number : " + max);
	}
	
	public void sum()
        {
		for(int a = 0; a < size; a++)
                {
		sum = sum + array[a];
		}
                
                System.out.println("/n");
                System.out.print("/n");
		System.out.print("Sum : " + sum);
	}

	public void average() {
                 System.out.println();
		 average = sum / size;
		 System.out.print("Average : " + average);		 
	}
    
        public static void main(String [] args){
             ArrayRandom print = new ArrayRandom();
            
            print.average();
            print.show();
            print.max(); 
            print.sum();
            
        }
        
}