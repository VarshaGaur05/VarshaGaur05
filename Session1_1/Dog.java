public class Dog extends Animal implements Pet{

    // public Dog() {
    //     super();
    // }

    public Dog(int h, int w){
        super(10, w);
    }

    public void guard() {
        System.out.println("I am on guarding duty! Woof!");
    }

    public void MakeNoise() {
        System.out.println("Woof, Woof!!");
    }

    public void play() {
        System.out.println("I am a dog and I want to play... Woof!!!");
    }
}
