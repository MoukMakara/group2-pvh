abstract class Animal{
    abstract void makeSound();

    public void eat() {
        System.out.println("This animal eats food.");
    }

}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class run implements Service{
    @Override
    public void execute() {
        System.out.println("Service is executing.");
    }

    @Override
    public void stop() {
        System.out.println("Service has stopped.");
    }

    @Override
    public void restart() {
        System.out.println("Service is restarting.");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        
    }

    
}
