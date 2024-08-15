public class OOPS1 {
    static class Student{
        int rollno;
        float marks;
        String name;
        Student(int roll,float  marks,String name){
            this.rollno=roll;
            this.marks=marks;
            this.name=name;
        }
        Student(Student other){
            this.rollno=other.rollno;
            this.marks=other.marks;
            this.name=other.name;
        }
        //calling constructor from another constructor
        Student(){
            //internally it is same as Student(rollno,marks,name)
            this(15,89.0f,"defalut person");
        }
    }
    public static void main(String[] args) {
        Student hananiah=new Student();
        Student one=new Student();
        //when we are doing this two reference variables refer to same object
        // so changes in one will be seen in other.
        Student two=one;
        one.marks=96.2f;
        two.marks=76.7f;
        System.out.println("one's marks is "+one.marks);
        System.out.println("tow's marks is "+two.marks);
    }
}
