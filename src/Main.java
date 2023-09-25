// Abstract class example
abstract class Super
{
    Super()
    {
        System.out.println("Super class constructor");
    }

    public void meth1()
    {
        System.out.println("Super meth1");
    }
     abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub class method");
    }
}

public class Main {
    public static void main(String[] args) {

//        Super s1=new Super();  //this will give error as we cannot create objects of abstract classes.
//        Super s1; //this is right because we can create reference of abstract classes.
        Super s1 =new Sub();  //dynamic method dispatch
        s1.meth1();
        s1.meth2();
    }
}