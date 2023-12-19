//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   // create the instance of pizza class
//        Pizza basePizza =new Pizza(false);
//        basePizza.addExtraTopping();
//        basePizza.addExtraCheese();
//        basePizza.getBill();
        DulexPizza dp = new DulexPizza(false);
        // we provide power to user to change add toppings & chees
        // we use Override methods
//        dp.addExtraCheese();
//        dp.addExtraTopping();
        dp.takeAway();
        dp.getBill();
    }
}