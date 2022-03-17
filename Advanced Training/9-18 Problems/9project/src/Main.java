import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array : ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        HashMap<Integer, Integer> freqMap = solveIterative(arr);
 
        for(int value : freqMap.keySet())
        {
            System.out.println(value + " occurs " + freqMap.get(value)+ " times");
        }
 
    }
 
    public static HashMap<Integer, Integer> solveIterative(int[] arr)
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int value : arr)
        {
            if(!freqMap.containsKey(value))
            {
                freqMap.put(value, 1);
            }
            else {
                freqMap.put(value, freqMap.get(value)+1);
            }
        }   
        return freqMap;
    }
}