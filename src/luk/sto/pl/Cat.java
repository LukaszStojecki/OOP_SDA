package luk.sto.pl;

public class Cat extends  Animal implements Movable {

    String catName;
    int eatMouse = 0;

    public Cat(String catName) {
        this.catName = catName;
    }

    public void makeSound() {
        System.out.println("Imie kota to: " + this.catName + ",ktory wydaje dzwiek: Miau ");

    }

    public void eatMouse() {
            eatMouse++;
            System.out.println("Ate " + eatMouse + " mice ");
    }

    @Override
    public void move(){
        System.out.println("Idę");

    }
}
