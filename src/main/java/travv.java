interface  vehicle{
    public void start();
}

class Car implements vehicle{
    public void start() {
        System.out.println("Strat the trip  by CAR////");
    }
}

class bike implements vehicle
{

    public void start() {
        System.out.println("Strat the trip  by Bike////");
    }

}




public class travv {


    static vehicle v;
    public  void setv(vehicle v)
    {
        this.v=v;
    }

    //static Car c = new Car();

   // static bike b= new bike();
    public static void main(String[] args) {

        travv t= new travv();
        t.setv( new Car());
      v.start();


    }


}
