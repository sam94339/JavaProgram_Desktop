import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class DuplicateCount{

    public static void main(String args[]){

        String name = "My name is name is is Soumyadeep Ghosh";
        String[] splitname = name.split(" ");

        Map<String, Integer> maped = new HashMap<String, Integer>();

        for(String word: splitname){

            if(maped.containsKey(word)){

                maped.put(word, maped.get(word)+1);
            }else{

                maped.put(word, 1);
            }
        }

        Set<String> seted = maped.keySet();

        for(String word: seted){

            if(maped.get(word)>1){

                System.out.println(word+": " + maped.get(word));
            }
        }
    }

}