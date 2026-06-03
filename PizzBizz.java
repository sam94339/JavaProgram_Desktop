class PizzBizz {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("PizzaBizz");
            } else if (i % 3 == 0) {

                System.out.println("Pizz");
            } else if (i % 5 == 0) {

                System.out.println("Bizz");
            } else {

                System.out.println(i);
            }

        }
    }
}