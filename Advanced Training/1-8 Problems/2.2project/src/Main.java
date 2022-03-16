
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first and second term");

		Scanner s= new Scanner(System.in);
		 int firstTerm = s.nextInt();
		 int secondTerm = s.nextInt();
		int i = 1, n = 13;
		    System.out.println("Next 13 sequence " + n + " terms:");

		    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }

	}

}