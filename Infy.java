import java.util.Scanner;

public class Infy {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();   // example: aceg

        StringBuilder out = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            out.append((char) (c + 1));
        }

        System.out.println(out.toString()); // output: bdfh
        sc.close();

    }
    
}
