package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppings;
    private int takeAwayPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isBillGenerated=false;
        this.isToppingAdded=false;
        this.isCheeseAdded=false;
        this.isTakeAwayAdded=false;
        this.extraCheesePrice = 80;

        this.takeAwayPrice = 20;

        if (isVeg == true){
            this.price = 300;
            this.extraToppings = 70;
        }
        else {
            this.price = 400;
            this.extraToppings = 120;
        }

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!isCheeseAdded){
            this.price += this.extraCheesePrice;

        isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price += this.extraToppings;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price += this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            isBillGenerated=true;

            if(isCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }

            if(isToppingAdded == true){
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppings + "\n";
            }

            if(isTakeAwayAdded == true){
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }

            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
