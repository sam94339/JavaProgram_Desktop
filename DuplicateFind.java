import java.util.HashSet;

class DuplicateFind{

    public static void main(String aregs[]){

        String name = "my is name is is my soumyadeep";
        String[] splitarray = name.split(" ");
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

       for(String word: splitarray){

            if (!seen.add(word)) {
                
                duplicate.add(word);
            }
       }

       System.out.println(duplicate);
    }
}