public class TCSHappy {

    public static  void main(String[] args){

        String input = "Happy Biirthday";

        for (int i = 0; i < input.length() - 1; i++) {

            char current = input.charAt(i);
            char next = input.charAt(i + 1);

            if (Character.toLowerCase(current) == Character.toLowerCase(next)) {
                System.out.println(current);
            }
        }
    }
}
