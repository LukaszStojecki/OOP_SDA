package luk.sto.pl;

public class Figures {


    public double getAreaFigures(Rectangle rectangle, Triangle triangle,Circle circle) {
        return rectangle.getArea() + triangle.getArea() + circle.getArea();
    }

    public boolean checkIfEnoughPaint(double paint, double figuresArea){
        boolean isEnough = false;
        if (paint >= figuresArea){
            isEnough = true;
        } else {
            System.out.println("Mając: " + paint + " litrów farby, " +
                    "nie zamalujemy wszystkich figur o powierzchni: " + figuresArea);
        }
    return  isEnough;
    }
}
