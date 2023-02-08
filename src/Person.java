public class Person {
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
