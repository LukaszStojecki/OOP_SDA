package luk.sto.pl;

public class Rectangle extends  Figures{

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

}
