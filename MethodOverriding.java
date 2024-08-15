class vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("Bike is running");
    }
}
//practical example
class Bank{
    void rateOfInterest(int x){
        System.out.println("Rate of interest is " + x);
    }
}
class SBI extends Bank{
    void rateOfInterest(int x){
        System.out.println("Rate of Interest is "+ x);
    }
}
public class MethodOverriding {
    // If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
    public static void main(String[] args) {
        SBI bank1=new SBI();
        bank1.rateOfInterest(10);
    }
}
