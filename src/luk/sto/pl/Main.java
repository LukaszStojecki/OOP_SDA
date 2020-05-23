package luk.sto.pl;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Gucio");
        Cat cat2 = new Cat("Olek");
        Cat cat3 = new Cat("Gustaw");
        Cat cat4 = new Cat("Kropek");
        Dog dog1 = new Dog("Ares");
        Dog dog2 = new Dog("Azor");
        Dog dog3 = new Dog("Simba");

        System.out.println("Exercise: 2");
        Cat[] myCat = {cat1, cat2, cat3, cat4};

        for (Cat cat : myCat) {
            cat.makeSound();
        }
        System.out.println("Exercise: 3");
        cat1.eatMouse();
        System.out.println("Exercise 4: ");
        dog1.makeSound();
        System.out.println("Exercise 5: ");

        Animal[] animals = {cat1, dog1, dog2, cat3, dog3};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println("Exercise 10: ");

        Vet vet = new Vet();
        vet.sayHello(dog1, cat1);

        System.out.println("Exercise 11: ");
        Triangle triangle = new Triangle(5.5, 5.5);
        double triangle1 = triangle.getArea();
        System.out.println("Pole trojkata wynosi: " + triangle1);

        Rectangle rectangle = new Rectangle(4.5, 6.5);
        double rectangle1 = rectangle.getArea();
        System.out.println("Pole kwadratu wynosi: " + rectangle1);

        Circle circle = new Circle(3.14, 4.5);
        double circle1 = circle.getArea();
        System.out.println("Pole koła wynosi: " + circle1);

        System.out.println("Exercise 12: ");
        Figures figures = new Figures();
        double figure = figures.getAreaFigures(rectangle, triangle, circle);
        System.out.println("Suma wszystkich figur to: " + figure);

    }
}
