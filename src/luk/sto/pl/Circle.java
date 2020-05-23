package luk.sto.pl;

public class Circle {

    double pi;
    double radius;

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public double getArea() {
        return this.pi * this.radius * this.radius;
    }


}
