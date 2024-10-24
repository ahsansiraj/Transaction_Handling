package dsa_questions.src.OOPS_Practice;

public class pract3 {
    int roll;
    String name;
    pract3(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
     public void display()
     {
         System.out.println(roll+" "+name);
     }


     pract3()
     {
         System.out.println("constructor");
     }
    public static void main(String[] args) {
        pract3 obj =new pract3(23,"ahsan");
        obj.display();

//        System.out.println(obj.roll+" "+obj.name);//print 23 ahsan

        pract3 obj2 =new pract3(24,"ilma");
        obj2.display();

//        pract3 obj=new pract3();//constructor
//        pract3 obj2=new pract3();//constructor
//        pract3 obj3=new pract3();//constructor

        //
    }

}

/*
    rule for defining constructor
    1.when ever we create an object a construtor is autmatically created by the jvm
      compiler .so it will already call the constructor without calling it.

    2.return type not allowed for constuctor even void
    3.only public private protected and default is allowed
    4.static final synchronized is not allowed

    5.when a class is declared constructor is declared by the jvm automaticlly and this is knows as defautlt constructor
    example= class demo{

                        }
                    now here constructor is declared
                every class in java including abstrat class create default constructor

     6.but if user craete constructor then jvm will(compiler) not assighn
    7.when we add void in before constructor jvm will take it as method


*/
