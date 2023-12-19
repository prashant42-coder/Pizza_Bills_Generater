public class DulexPizza extends Pizza {
    public DulexPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();

    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopping() {}
}
