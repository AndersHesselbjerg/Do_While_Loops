
public class Car {


    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }


    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }


    public static void main(String[] args) {
        Car myCar = new Car();     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}

