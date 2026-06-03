class MaxSubArray{

    public static void main(String args[]){

         int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max_so_far = Integer.MIN_VALUE;
        int max_ending = 0;

        for(int i = 0; i<a.length; i++){

            max_ending = max_ending + a[i];

            if(max_ending>max_so_far){

                max_so_far = max_ending;
            }

            if(max_ending<0){

                max_ending = 0;
            }
        }

        System.out.println(max_so_far);

        
    }
}


