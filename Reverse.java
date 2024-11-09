import java.util.Scanner;
class Reverse{
		public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
		int number, i;
		System.out.println(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();
		for(i = number; i >= 1; i--)
		{
			System.out.print(i +"\t");
		}	
	}
}