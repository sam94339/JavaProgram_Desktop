import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PracticeThree{

    //Easy Way
    public static void main(String[] args){

        String input = "aceg";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  
            ch++;   
            System.out.println(ch);                    
            output.append(ch);          
        }

        System.out.println("Input  : " + input);
        System.out.println("Output : " + output.toString());

    }
    
    
}