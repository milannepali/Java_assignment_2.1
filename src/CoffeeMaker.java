
public class CoffeeMaker {

    private boolean on = false;
    private String coffeeType = "normal";
    private int coffeeAmount = 10;

    // Turn coffee maker on or off
    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    // Set coffee type
    public void setCoffeeType(String type) {
        if (on) {
            if (type.equals("normal") || type.equals("espresso")) {
                coffeeType = type;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    // Set coffee amount
    public void setCoffeeAmount(int amount) {
        if (on) {
            if (amount >= 10 && amount <= 80) {
                coffeeAmount = amount;
            }
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
