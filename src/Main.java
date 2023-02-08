public class Main {
    public static void main(String[] args) {
        Person girl = new Person();
        Person boy = new Person("Паша", 17);
        girl.move();
        boy.move();
        girl.talk();
        boy.talk();
    }
}