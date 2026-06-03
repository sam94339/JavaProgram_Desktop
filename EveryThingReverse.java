public class EveryThingReverse {

    public static void main(String[] args){
       
        String name = "Soumyadeep Ghosh";
        String[] spl = name.split(" ");
        String rev = "";
        String revna = "";

        for(int i = 0; i<spl.length; i++){

            String a = spl[i];
            for(int j=0; j<a.length(); j++){

                char b = a.charAt(j);
                revna = b+revna;
            }
            rev = revna+" "+rev;
            revna = "";
        }
        System.out.println(rev);
    }
}