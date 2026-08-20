public class RevwithCaps {

    public static void main(String args[]){

        String input = "my name is soumydeep ghosh";
        String[] inputarr = input.split(" ");
        String rev = "";

        for (int i = 0; i<inputarr.length; i++){

            String val = inputarr[i];
            rev = val + " " + rev;

        }

        System.out.println(rev);

        String[] revarr = rev.split(" ");

        for (String word: revarr){

            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1)+ " ");
        }


    }
}
