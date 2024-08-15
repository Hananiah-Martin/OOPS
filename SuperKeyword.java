class Teacher{
    String name="teacher";
    void intro(){
        System.out.println(" I am a teacher");
    }
}
class Student extends Teacher{
    String name="student";
    void intro(){
        System.out.println("I am student");
        //example for super keyword being used to invoke parent class instance variable
        System.out.println(super.name);
        //to invoke parent class method
        super.intro();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    //example showing super() is being added by compiler even though we not mentioned
    Dog(){
        System.out.println("Dog is Created");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        // 1.super can be used to refer immediate parent class instance variable.
        // 2.super can be used to invoke immediate parent class method.
        // 3.super() can be used to invoke immediate parent class constructor.
        Dog dog=new Dog();
    }
}
