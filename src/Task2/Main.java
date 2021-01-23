package Task2;

@FunctionalInterface
interface IDoSmth{
    void doSmth();
}

class Frog
{
    IDoSmth sleep = () -> System.out.println("Хочу спати!");
    IDoSmth swim = () -> System.out.println("Хочу плавати!");
    IDoSmth walk = () -> System.out.println("Хочу гуляти!");
}

public class Main {

    public static void main(String[] args) {

        Frog frog = new Frog();
        frog.sleep.doSmth();
        frog.swim.doSmth();
        frog.walk.doSmth();
    }

}
