class CharArraySortingTwo{

    public static void main(String args[]){

        char[] arrychar = {'t', 'q', 'g', 'a', 'o'};
        char temp;

        for(int i = 0; i<arrychar.length-1; i++){

            for(int j = 0; j<arrychar.length-1-i; j++){

                if(arrychar[j]> arrychar[j+1]){

                    temp = arrychar[j];
                    arrychar[j] = arrychar[j+1];
                    arrychar[j+1] = temp;
                }
                
            }

        }

        for(char a:arrychar){

            System.out.print(a + " ");
        }
    }
}