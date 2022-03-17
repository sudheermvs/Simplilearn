import java.util.Scanner;

class Demo
{
	
	public static boolean isInterleaving(String X, String Y, String Z)
	{
		
		if (X.length() == 0 && Y.length() == 0 && Z.length() == 0) {
			return true;
		}

		if (Z.length() == 0) {
			return false;
		}


		boolean x = (X.length() != 0 && Z.charAt(0) == X.charAt(0)) &&
				isInterleaving(X.substring(1), Y, Z.substring(1));


		boolean y = (Y.length() != 0 && Z.charAt(0) == Y.charAt(0)) &&
				isInterleaving(X, Y.substring(1), Z.substring(1));

		return x || y;
	}

	public static void main(String[] args)
	{
		
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter The First String :");
		String X=S.nextLine();
		System.out.println("Enter The Second String :");
		String Y=S.nextLine();
		System.out.println("Enter The Third String :");
		String Z=S.nextLine();		
		

		if (isInterleaving(X, Y, Z)) {
			System.out.print("Interleaving");
		}
		else {
			System.out.print("Given string is not interleaving of X and Y");
		}
	}
}