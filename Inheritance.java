public class Inheritance {
    static class Student1{
        void name(){
            System.out.println("My name is Student 1");
        }
    }
    static class Student2 extends Student1{
        void age(){
            System.out.println("I am 19 years old.");
        }
    }
    public static void main(String[] args) {
        
        Student1 s1=new Student1();
        s1.name();
        Student2 s2=new Student2();
        s2.age();
    }
}
