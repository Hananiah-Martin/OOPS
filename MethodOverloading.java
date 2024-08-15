public class MethodOverloading {
    void sum(int a,int b){System.out.println("int arg method invoked");}  
    void sum(long a,long b){System.out.println("long arg method invoked");}  
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.sum(10,10);//int sum method is invoked
    }
}
