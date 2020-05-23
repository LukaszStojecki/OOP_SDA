package luk.sto.pl;

public class Vet{

    public void sayHello(Cat cat2){

        System.out.println("Hello: " + cat2.catName);
    }

    public  void sayHello(Dog dog1, Cat cat1){

        System.out.println("Hello: " + dog1.dogName + " Hello: " + cat1.catName);
    }

}
