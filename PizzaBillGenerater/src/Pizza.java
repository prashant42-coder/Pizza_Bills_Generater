public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int BackpackPrice= 20;
    private int  basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedForTakeAway=false;



    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            System.out.println("Veg Pizza");
            this.price=300;
        }else{
            System.out.println("Non-Veg Pizza");
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price +=100;
    }
    public  void addExtraTopping(){
        isExtraToppingAdded=true;

        this.price += 150;
    }
    public void takeAway(){
        isOptedForTakeAway=true;
        this.price+=BackpackPrice;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza Price:"+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill +="Extra cheese added:"+extraCheesePrice+"\n";
         }
        if(isExtraToppingAdded){
            bill +="Extra Topping is Added: "+extraToppingPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill +="Take Away here:"+BackpackPrice+"\n";
        }
        bill += "Bill "+this.price + "\n";
        System.out.println(bill);

    }
}
