import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeoutException;

public class TotalPractice {

    public static void main(String[] args) {

        String name = "my name is soumyadeep";
        String namLow = name.toLowerCase();
        Map<Character, Integer> mapped = new HashMap<>();

        for (char c: namLow.toCharArray()){

            if(mapped.containsKey(c)){

                mapped.put(c, mapped.get(c)+1);
            }else {

                mapped.put(c, 1);
            }
        }

        Set<Character> stess = mapped.keySet();

        for (char val : stess){

            if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u'){

                System.out.println(val + " : " + mapped.get(val));
            }
        }
    }

}


