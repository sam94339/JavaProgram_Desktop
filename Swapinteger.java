class Swapinteger
{

	public static void main(String[] args){

		//using addition and subtraction

		int a = 10; int b = 11;

		a = a+b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

		//without using addition and subtration using bitwise xor
		
		int c = 18; int d = 20;
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;

		System.out.println(c);
		System.out.println(d);
	}

}