package Task1;

@FunctionalInterface
interface    Pet{
     void display();
}

class Dog {
    Pet pt = () -> System.out.println("Я пес гав гав");
}

class  Cat {
    Pet pt = () -> System.out.println("Я кіт мяв мяв");
}

class  Cow {
    Pet pt = () -> System.out.println("Я корова му му");
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.pt.display();

        Cat cat = new Cat();
        cat.pt.display();

        Cow cow = new Cow();
        cow .pt.display();

    }

}



