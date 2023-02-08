public class Main {
    public static void main(String[] args) {
        Person girl = new Person();
        Person boy = new Person("Паша", 17);
        girl.move();
        boy.move();
        girl.talk();
        boy.talk();
    }
    public static class Person{
        String fullname;
        int age;
        public void move(){
            System.out.println(this.fullname + " говорит");
        }
        public void talk(){
            System.out.println(this.fullname + " говорит");
        }
        Person(){

        }
        Person(String fullname, int age){
            this.fullname = fullname;
            this.age = age;
        }
    }
}