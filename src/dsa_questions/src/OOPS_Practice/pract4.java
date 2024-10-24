package OOPS_Practice;
class demo
{
    String name="ahsan";
}
public class pract4 extends demo {
    String name="abdil";

    public  void print()
    {
        System.out.println(name);//child clas
        System.out.println(this.name);//child  class
        System.out.println(super.name);//parent class
    }

    public static void main(String[] args) {
        pract4 obj =new pract4();
        obj.print();
    }
}

/*super keuword is used to access the parent class variable
when a constuctor is crated by compiler then it contains only super keyword in the
first line. example class test()
{
super();
}

this and super is alwauys use to refer instant varible and objcts except static area
*/
