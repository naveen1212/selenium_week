


class Vehicle {
    public void move () {
         System.out.println ("Vehicles are used for moving from one place to another ");
    }
}

class Car extends Vehicle {
   
	public void move () {

      // invokes the super class method
      System.out.println ("Car is a good medium of transport ");
      super.move();
    }
}

public class TestCar_methodoverriding {
  
	public static void main (String args [])
    {
        Car b = new Car (); // Vehicle reference but Car object
     
        b.move (); //Calls the method in Car class
    }
}











