

	import java.util.*;
	 
	public class Demo {
	
	    static void printFirstRepeating(int arr[])
	    {
	       
	        int min = -1;
	 

	        HashSet<Integer> set = new HashSet<>();
	 
	       
	        for (int i=arr.length-1; i>=0; i--)
	        {
	            
	            if (set.contains(arr[i]))
	                min = i;
	 
	            else   
	                set.add(arr[i]);
	        }
	 
	       
	        if (min != -1)
	          System.out.println("The first repeating element is " + arr[min]);
	        else
	          System.out.println("There are no repeating elements");
	    }
	 
	    
	    public static void main (String[] args) throws java.lang.Exception
	    {
	        int arr[] = {1, 2, 3, 10, 2, 4, 5, 7, 8 };
	        printFirstRepeating(arr);
	        
	        int arr1[] = {1, 2, 3, 10, 6, 4, 3, 7, 10};
	        printFirstRepeating(arr1);
	        
	        
	    }
	}


