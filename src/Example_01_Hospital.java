// In this example we'll understand through a real life example of how abstract class works

//Abstract class are used for defining standards and imposing standards.

abstract class Hospital{
    //here is the list of all facilities that a hospital must provide in order to be recognised as a hospital by the
    //government.
    abstract void emergency();
    abstract void admit();
    abstract void billing();
    abstract void doctor();
    //and so on many facilities that a hospital must provide.

}
//now we will make a hospital of our own
class MyHospital extends Hospital
{
    //we'll have to override every abstract method in Hospital in order to make our class concrete.
    //this means our hospital must contain every facility defined by the standard hospital authority.

    MyHospital()
    {
        System.out.println("Welcome to MyHospital");
    }

    @Override
    void emergency()
    {
        System.out.println("Emergency room");
    }
    void admit()
    {
        System.out.println("Admit patient");
    }
    void billing()
    {
        System.out.println("Billing done here");
    }
    void doctor()
    {
        System.out.println("Doctor examines patient here");
    }
}

public class Example_01_Hospital {
    public static void main(String[] args) {

        Hospital H;  //everyone refers MyHospital as a hospital because it is recognised as a hospital.
        H=new MyHospital();//So, using the reference of Hospital a person can come to MyHospital and can
                           //get treatment and access to all the facilities that a hospital should provide
        H.admit();
        //a person can definitely admit patient to MyHospital.
    }
}