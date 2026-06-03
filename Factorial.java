import java.util.Scanner;

class Factorial{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int number = sc.nextInt();
		int facnum = 1;
		for(int i = number; i>=1; i--){
			facnum = facnum*i;	
		}
		System.out.println(facnum);
	
	}


}