import java.lang.reflect.Array;
import java.util.Arrays;

class AnagramChecker{

    //Java code for two strings are anagrams or not
    public static void main(String args[]){

        String a1 = "Soumyadeep Ghosh";
        String a2 = "ghosh Soumyadeep    34";

        String manua1 = a1.replaceAll("\\s", "").toLowerCase();
        String manua2 = a2.replaceAll("\\s", "").toLowerCase();

        char[] caha1 = manua1.toCharArray();
        char[] caha2 = manua2.toCharArray();

        Arrays.sort(caha1);
        Arrays.sort(caha2);

        System.out.println(caha1);

        if(caha1.length != caha2.length){

            System.out.println("Not anagram");

        }else if(Arrays.equals(caha1, caha2)){

            System.out.println("anagram");
        }

    }
}