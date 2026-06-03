class SelectionSort{

    public static void main(String[] args){

        int[] arr = {7, 4, 2, 6, 1};
        

        for(int i = 0; i<arr.length-1; i++){

            int smallest = i;

            for(int j = i+1; i<arr.length; j++){

                if(arr[j] < arr[smallest]){

                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        for(int val : arr){

            System.out.println(val);
        }
    }
}