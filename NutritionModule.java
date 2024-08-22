package com.evergent.corejava.abhi.application4;

class NutritionModule extends FitnessModule {

    public NutritionModule() {
        super();
    }

    @Override
    public void moduleDetails() {
        System.out.println("Nutrition Module: Choose your nutrition plan");
    }

    @Override
    public void displayOptions() {
        System.out.println("1 - Supplements ($30)");
        System.out.println("2 - Diet Plan ($50)");
    }

    @Override
    public void processOption(int option) {
        switch (option) {
            case 1:
                cost = 30;
                displayMessage("You have selected Supplements.");
                break;
            case 2:
                cost = 50;
                displayMessage("You have selected Diet Plan.");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
