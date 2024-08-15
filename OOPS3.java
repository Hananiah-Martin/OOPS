public class OOPS3 {
    static class BaseClass{
        int height;
        int weight;
        int breadth;
        public BaseClass(){
            this.height=4;
            this.weight=5;
            this.breadth=6;
        }
        public BaseClass(int h,int w,int b){
            this.height=h;
            this.weight=w;
            this.breadth=b;
        }
        void area(){
            System.out.println("this is area");
        }
        static void hello(){
            System.out.println("hello i am in base class");
        }
    }
    static class ChildClass extends BaseClass{
        int length;
        public ChildClass(int h,int w,int b,int l){
            super(h,w,b);
            this.length=l;
        }
        static void hello(){
            System.out.println("hello i am in child class");
        }
    }
    static class ChildClassTwo extends ChildClass{
        int price;
        public ChildClassTwo(int h,int w,int b,int l,int p){
            super(h, w, b, l);
            this.price=p;
        }
    }
    public static void main(String[] args) {
        BaseClass one=new ChildClass(0, 0, 0, 0);
        BaseClass.hello();
    }
}