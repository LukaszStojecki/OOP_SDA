package luk.sto.pl;

public class Dog extends Animal{

    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void makeSound(){
        System.out.println("Imie psa to: " + this.dogName + ",ktory wydaje dzwiek: Woof ");
    }



}
