class Rectangle{

    double width;
    double height;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }

    public double area(){

        return width*height;
    }

    public double perimeter(){

        return 2*(width + height);
    }

    public void setWidth(double width){

        this.width = width;
    }
    public void setHeight(double height){

        this.height = height;

    }

}