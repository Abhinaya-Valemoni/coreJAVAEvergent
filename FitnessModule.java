package com.evergent.corejava.abhi.application4;

abstract class FitnessModule implements ModuleInterface {
    protected int cost;

    public FitnessModule() {
        this.cost = 0;
    }

    public void displayCost() {
        System.out.println("Current module cost: $" + cost);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    abstract void moduleDetails();
}
