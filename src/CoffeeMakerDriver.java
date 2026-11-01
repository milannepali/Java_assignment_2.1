
public class CoffeeMakerDriver {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Turn on
        coffeeMaker.setOn(true);
        System.out.println("Coffee maker is on");

        // Select coffee type
        coffeeMaker.setCoffeeType("espresso");
        System.out.println("Coffee type is " + coffeeMaker.getCoffeeType());

        // Select coffee amount
        coffeeMaker.setCoffeeAmount(50);
        System.out.println("Coffee amount is " + coffeeMaker.getCoffeeAmount() + " ml");

        // Turn off
        coffeeMaker.setOn(false);
        System.out.println("Coffee maker is off");
    }
}
