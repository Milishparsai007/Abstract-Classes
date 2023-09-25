abstract class Shapes
{
    //a shape does not have particular dimensions because it is different for every shape
    //but it has some methods that are common to every shape that are
    //perimeter,area,etc.

    abstract public double Perimeter();
    abstract public double Area();
    abstract void TypeOfShape();
}

class Circle extends Shapes
{
    double radius=0;
    public Circle(float radius)
    {
        this.radius=radius;
    }
    @Override
    public double Perimeter()
    {
        System.out.printf("Perimeter : ");
        return 2*Math.PI*radius;
    }

    @Override
    public double Area() {
        System.out.printf("Area : ");
        return Math.PI*radius*radius;
    }

    @Override
    void TypeOfShape() {

        System.out.println("Circle");
    }
}

class Rectangle extends Shapes
{
    double length=0;
    double breadth=0;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double Perimeter()
    {
        System.out.print("Perimeter : ");
        return 2*(length+breadth);
    }

    @Override
    public double Area() {
        System.out.print("Area : ");
        return length*breadth;
    }

    @Override
    void TypeOfShape() {
        System.out.println("Rectangle");
    }
}

public class Example_02_Shapes {
    public static void main(String[] args) {

        Shapes s1=new Circle(5);
        s1.TypeOfShape();
        System.out.println(s1.Perimeter());
        System.out.println(s1.Area());

        Shapes s2=new Rectangle(5,10);
        s2.TypeOfShape();
        System.out.println(s2.Perimeter());
        System.out.println(s2.Area());
    }
}