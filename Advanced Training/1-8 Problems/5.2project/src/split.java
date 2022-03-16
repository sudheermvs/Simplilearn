public class split
{
	public static void main(String[] args) {
		
	
	String txt= (" 23  +  45  -  (  343  /  12  ) ");
	String[] w=txt.split("\\\s");
	
	for(String w1:w){  
		System.out.println(w1); 
		//System.out.println(" ");
	}
}

}