package dsa_questions.src.OOPS_Practice;


//note
//an object is an instance of a class
//a class is a blue print of an object
class Student
{
    int age;
    String sclass;
    int rollnumber;
}
public class pract1 {
    public static void main(String[] args) {
//        System.out.println("hello ooops");

        Student obj = new Student();
        int a=obj.age=20;
         String b=obj.sclass="bca";
        int c=obj.rollnumber=222;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Student obj2 = new Student();
        int x=obj2.age=21;
        String y=obj2.sclass="bca";
        int z=obj2.rollnumber=222;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int arr[]={1,3,3,4,4,5,5,};
        System.out.println(arr.length);
    }
}
