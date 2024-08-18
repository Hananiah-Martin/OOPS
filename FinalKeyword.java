public class FinalKeyword {
    static class Bike{
        //once you declare a variable as final you cannot change its value;it will give CT error
        final int speedLimit=100;
        //example for final method
        //this method cannot be overriden
        //final method can be inherited but cannot be overriden
        final void run(){
            System.out.println("Bike is running with speed " + speedLimit);
        }
        //final class cannot be inherited
    }
    static class Honda extends Bike{
        //As we declared a method final we cannot override it
        void run2(){
            System.out.println("Honda is running with speed "+speedLimit);
        }
    }
    public static void main(String[] args) {
        //If you make any variable as final, you cannot change the value of final variable(It will be constant).
        Honda bike=new Honda();
        bike.run();
    }
}
