import java.util.Scanner;

class Practice{

    public static void main(String[] args){
       
        int[] a = {12, 13, 34, 1};
        int[] b = {19, 20, 22};

        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        boolean isprime;

        for(int i = 0; i<result.length; i++){

            
            isprime = true;
            for(int j = 2; j<=result[i]/2; j++){

            if(result[i]%j == 0){

                isprime = false;
                break;
            }
            }

            if (isprime) {

                if(result[i] == 1){

                    System.out.println("This is one");
                }else{

                    System.out.println(result[i] + "This is a prime number");
                }
                
            }else{

                System.out.println(result[i] + "This is not a prime number");
            }
        }
      
    }
}