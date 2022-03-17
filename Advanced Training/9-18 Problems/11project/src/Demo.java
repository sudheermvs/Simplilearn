
import java.util.Scanner;
import java.util.Vector;
	  
public class Demo {
	  
	   
	    static int deno[] = {1, 2, 5, 10, 20, 
	    50, 100, 500, 1000};
	    static int n = deno.length;
	  
	    static void findMin(int V)
	    {
	   	        Vector<Integer> ans = new Vector<>();
	  
	       	        for (int i = n - 1; i >= 0; i--)
	        {
	           
	            while (V >= deno[i]) 
	            {
	                V -= deno[i];
	                ans.add(deno[i]);
	            }
	        }
	  
	        
	        for (int i = 0; i < ans.size(); i++)
	        {
	            System.out.print(" " + ans.elementAt(i));
	                
	            
	        }
	        System.out.println("\n The minimum number of coins is "+ans.size());
	    }
	  
	   
	    public static void main(String[] args) 
	    {
	    	 Scanner scanner=new Scanner(System.in);
	    	   System.out.println("Enter the Number");
	    	   int n=scanner.nextInt();
	        
	    	   
	        System.out.print(" Following is minimal number " +"of change for " + n + ": ");
	        findMin(n);
	    }
	}
