import java.util.Arrays;

class CharArraySortingOne{

    // Using sort function.

    public static void main(String args[]){

        char[] chararray = {'w', 'o', 'h', 'b'};
        
        Arrays.sort(chararray);

        for(char a : chararray){

            System.out.print(a + " ");
        }
    }
}