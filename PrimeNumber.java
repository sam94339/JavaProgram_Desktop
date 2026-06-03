import java.util.Scanner;

class PrimeNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 2; i<=number/2; i++){

            if(number%i != 0){

                System.out.println("prime number");
                break;

            }else{

                System.out.println("Non prime number");
                break;
            }
        }
    }
}