class Armstrangnumber{
	
	public static void main(String[] args){

		int no = 153;
		int t = no;
		int length = 0;
		while (t != 0){

			t = t/10;
			length = length+1;
			
		
		}
		System.out.println(length);

		int t1 = no; int rem; int am = 0;
		while(t1 != 0){
		
			rem = t1%10;
			int mul = 1;
			for(int i=1; i<=length; i++){

				mul = mul*rem;
			}

			am = am + mul;
			t1 = t1/10;
		}
		if(am == no){

		System.out.println("Amstrang Number");
		}else{

		System.out.println("Not Amstrang Number");
		}
	
	}
}