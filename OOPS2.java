public class OOPS2 {
    static class Human{
        int age;
        String gender;
        String name;
        static int roll;
        //when the property is object independent we use static 
        //here popuation is object independent so we have used static 
        // and when we are accessing we are accessing through class name
        static int population;
        static{
            roll=roll+50;
            System.out.println("iam in static block");
        }
        Human(int age,String gender,String name){
            this.age=age;
            this.gender=gender;
            this.name=name;
            Human.population+=1;
        }
    }
    public static void main(String[] args) {
         
    }
}
