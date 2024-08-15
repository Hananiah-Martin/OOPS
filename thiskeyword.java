public class thiskeyword {
    static class test{
        test(){
            System.out.println("hello a");
        }
        test(int x){
            //using this keyword as constructor
            this();
            System.out.println(x);
        }
    }
    //example for this constructor 
    static class student{
        int roll;
        String name;
        String city;
        student(int roll,String name){
            this.roll=roll;
            this.name=name;
        }
        student(int roll,String name,String city){
            this(roll,name);
            this.city=city;
        }
    }
    //use of this as return type
    static class A{
       A getA(){
        return this;
       } 
       void msg(){
        System.out.println("hello world");
       }
    }
    public static void main(String[] args) {
       new A().getA().msg();

    }
}
