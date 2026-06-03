class Main{

    public static void main(String args[]){

        Rectangle rectobj = new Rectangle(2.00, 3.00);
        System.out.println(rectobj.area());
        System.out.println(rectobj.perimeter());
        rectobj.setWidth(5.00);
        rectobj.setHeight(4.00);
        System.out.println(rectobj.area());
        System.out.println(rectobj.perimeter());
    }
}