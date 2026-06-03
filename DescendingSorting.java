class DescendingSorting{

    public static void main(String args[]){

        
    int[] array = {23, 87, 76, 16};
    int temp;

    for(int i = 0; i<array.length; i++){

        for(int j = i+1; j<array.length; j++){

            if(array[j]> array[i]){

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.print(array[i] + " ");
    }

    }

}