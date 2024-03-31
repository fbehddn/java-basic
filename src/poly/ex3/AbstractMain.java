package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow caw = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }
}
