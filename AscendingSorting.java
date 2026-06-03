class AscendingSorting{

    public static void main(String args[]){

        int[] array = {2, 4, 1, 8, 5};
        int tem;
        for(int i = 0; i<array.length; i++){

            for(int j = i+1; j<array.length; j++){

                if(array[j]< array[i]){

                    tem = array[i];
                    array[i] = array[j];
                    array[j] = tem; 
                }
            }

            System.out.print(array[i] + " ");
        }

    }
}