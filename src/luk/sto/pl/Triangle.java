package luk.sto.pl;

public class Triangle extends  Figures{

    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return  0.5 * this.height * this.base;
    }
}
