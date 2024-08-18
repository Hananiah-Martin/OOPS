public class Interfaces {
    interface printer{
        void print();
    }
    interface printer2{
        void show();
    }
    //multiple inheritance is possibel through interfaces
    static class Xerox implements printer,printer2{
        public void print(){
            System.out.println("printer is working fine");
        }
        public void show(){
            System.out.println("printer 2 is showing fine");

        }
    }
    public static void main(String[] args) {
        Xerox s=new Xerox();
        s.print();
        s.show();
    }
}
