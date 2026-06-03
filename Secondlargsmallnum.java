class Secondlargsmallnum{

    public static void main(String[] args){

        int[] arr = {43, 76, 12, 18, 90};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int val : arr){

            if(val<smallest){

                secondsmallest = smallest;
                smallest = val;
            }
            else if(val<secondsmallest && val != smallest){

                secondsmallest = val;
            }

            if(val> largest){

                secondlargest = largest;
                largest = val;
            }
            else if(val > secondlargest && val != largest){

                secondlargest = val;
            }
        }

        System.out.println("Second Largest: " + secondlargest);
        System.out.println("Second Smallest: "+ secondsmallest);


    }
}