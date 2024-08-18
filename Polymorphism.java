public class Polymorphism {

    //Example for RunTime polymorphism
    static class Bike{
        void run(){
            System.out.println("Bike is running fine");
        }
    }
    static class Splendor extends Bike{
        void run(){
            System.out.println("Splendor is Running fine");
        }
    }
    public static void main(String[] args) {
        //polymorphism means doing same action in multiple ways
        //   1)Upcasting
        //      ->Reference variable of Parent class refers to object of Child class

        //In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.Method invocation is done by JVM

        //Run time Polymorphism cannot be achieved by data members
        Bike b=new Splendor();
        b.run();
    }
}
