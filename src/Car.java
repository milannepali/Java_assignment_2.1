
public class Car {

    private double tankCapacity;
    private double speed;
    private double targetSpeed;
    private boolean cruiseControlOn = false;

    // First constructor
    public Car() {
        tankCapacity = 50;
        speed = 0;
    }

    // Second constructor
    public Car(double tankCapacity, double speed) {
        this.tankCapacity = tankCapacity;
        this.speed = speed;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    // Set target speed
    public void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    // Get target speed
    public double getTargetSpeed() {
        return targetSpeed;
    }

    // Turn cruise control on
    public boolean turnOnCruiseControl() {

        if (targetSpeed < 40 || targetSpeed > 120) {
            cruiseControlOn = false;
            return false;
        }

        cruiseControlOn = true;
        speed = targetSpeed;

        return true;
    }

    // Turn cruise control off
    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}
