package com.evergent.corejava.abhi.application4;

class ExerciseModule extends FitnessModule {

    public ExerciseModule() {
        super();
    }

    @Override
    public void moduleDetails() {
        System.out.println("Exercise Module: Choose your exercise type");
    }

    @Override
    public void displayOptions() {
        System.out.println("1 - Cardio ($20)");
        System.out.println("2 - Strength ($30)");
        System.out.println("3 - Flexibility ($25)");
    }

    @Override
    public void processOption(int option) {
        switch (option) {
            case 1:
                cost = 20;
                displayMessage("You have selected Cardio exercises.");
                break;
            case 2:
                cost = 30;
                displayMessage("You have selected Strength training.");
                break;
            case 3:
                cost = 25;
                displayMessage("You have selected Flexibility exercises.");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
