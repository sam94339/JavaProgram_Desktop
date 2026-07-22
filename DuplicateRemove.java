import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {


    public static void main(String[] args){

        String name = "my name is name is name bhabesh is bhabesh";
        Set<String> setstring = new LinkedHashSet<>();
        String[] namearray = name.split(" ");


        for (String word: namearray){

            setstring.add(word);
        }

        System.out.println(setstring);

        StringBuilder builder = new StringBuilder();
        for (String data: setstring){

            builder.append(data + " ");
        }

        String newname = builder.toString().trim();

        System.out.println(newname);
    }
}
