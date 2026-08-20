import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepetingchar {

    public static  void main(String[] args){

        String input = "aadgcceb";

        Map<Character, Integer> mapeed = new LinkedHashMap<>();


        for (char c: input.toCharArray()){

            if (mapeed.containsKey(c)){

                mapeed.put(c, mapeed.get(c)+1);
            }else {

                mapeed.put(c, 1);
            }
        }

        for (char c : mapeed.keySet()){

            if (mapeed.get(c) == 1){

                System.out.println(c + ": this is 1st one" );
                break;
            }
        }
    }
}
