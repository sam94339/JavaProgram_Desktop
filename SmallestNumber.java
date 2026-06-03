public class SmallestNumber {

    public static void main(String args[]){

        int[] a = {10, 34, 7, 89, 23, 5};
        int smallest = a[0];

        for(int i = 0; i<a.length; i++){

            if(a[i]<smallest){

                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }
}