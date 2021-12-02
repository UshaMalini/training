package training;

public class CurrencyPrgrm {
	 public static void countCurrency(int amount) 
	    { 
	        int[] notes = new int[]{500, 100, 50, 20, 10, 5, 1 }; 
	        int[] noteCounter = new int[9]; 
	       
	        // count notes using Greedy approach 
	        for (int i = 0; i < 6; i++) { 
	            if (amount >= notes[i]) { 
	                noteCounter[i] = amount / notes[i]; 
	                amount = amount - noteCounter[i] * notes[i]; 
	            } 
	        } 
	       
	        // Print notes 
	        System.out.println("Currency Count ->"); 
	        for (int i = 0; i < 6; i++) { 
	            if (noteCounter[i] != 0) { 
	                System.out.println(notes[i] + " : "
	                    + noteCounter[i]); 
	            } 
	        } 
	    } 
	      
	    // driver function  
	    public static void main(String argc[]){ 
	        int amount = 868; 
	        countCurrency(amount); 
	    } 
	      
	  
	} 

