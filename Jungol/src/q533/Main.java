package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char str1=sc.next().charAt(0);
		int b=sc.nextInt();
		sc.close();
		if (str1=='M' && b<18)  {
			System.out.println("BOY");
		} else if(str1=='M' && b>=18) {
			System.out.println("MAN");
		} else if(str1=='F' && b<18) {
			System.out.println("GIRL");
		} else if(str1=='F' && b>=18) {
			System.out.println("WOMAN");
		}
}
}