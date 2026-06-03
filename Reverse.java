class Reverse
{

	public static void main(String[] args){

		String name = "My name is Soumyadeep Ghosh";
		String[] splitname = name.split(" ");
		String newname = "";
		
		for(int i = 0; i<splitname.length; i++){
			
			newname = splitname[i] + " " + newname; 
		}

		System.out.println(newname);

		String myname = "Soumyadeep";
		String revname = "";

		for(int i = 0; i<myname.length(); i++){
		
			revname = myname.charAt(i) + revname;
		}
		System.out.println(revname);

	}

}