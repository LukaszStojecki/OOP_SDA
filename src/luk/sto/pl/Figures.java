package luk.sto.pl;

public class Figures {


    public double getAreaFigures(Rectangle rectangle, Triangle triangle,Circle circle) {
        return rectangle.getArea() + triangle.getArea() + circle.getArea();
    }
}
