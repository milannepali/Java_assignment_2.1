
public class CarDriver {

    public static void main(String[] args) {

        Car car = new Car(60, 50);

        System.out.println("Current speed: " + car.getSpeed());

        // Set target speed
        car.setTargetSpeed(80);

        // Turn cruise control on
        if (car.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
            System.out.println("Target speed: " + car.getTargetSpeed());
            System.out.println("Current speed: " + car.getSpeed());
        } else {
            System.out.println("Cruise control cannot be turned on");
        }

        // Turn cruise control off
        car.turnOffCruiseControl();
        System.out.println("Cruise control is off");

        // Test invalid target speed
        car.setTargetSpeed(150);

        if (car.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
        } else {
            System.out.println("Cruise control cannot be turned on");
        }
    }
}
