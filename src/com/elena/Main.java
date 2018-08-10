package com.elena;

public class Main {

    public static void main(String[] args) {
        FishDrop fishDrop = new FishDrop();
        fishDrop.setArea("Tasmania and Australia");
        fishDrop.setFishSize("30 sm");
        fishDrop.setDive(1200);
        fishDrop.setWater("sea water");
        fishDrop.setSwimmingBladder(false);

        Tuna tuna = new Tuna();
        tuna.setArea("Atlantic ocean");
        tuna.setFishSize("50 sm");
        tuna.setDive(200);
        tuna.setWater("sea water");
        tuna.setColorOfMeat("red meat");

        Som som = new Som();
        som.setArea("Russia");
        som.setFishSize("5 m");
        som.setDive(2000);
        som.setWater("freshwater");
        som.setMustache(true);
    }
}
