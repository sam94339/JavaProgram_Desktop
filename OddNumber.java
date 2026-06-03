import java.util.Scanner;

class OddNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int fstnumber = sc.nextInt();
        int scndnumber = sc.nextInt();

        for(int i = fstnumber; i<=scndnumber; i++){

            if(i%2 != 0){

                System.out.println(i);
            }
        }
    }
}