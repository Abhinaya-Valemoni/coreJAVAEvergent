package com.evergent.corejava.abhi.application4;

class PaymentModule extends FitnessModule {
    private int totalCost;
    private final double DISCOUNT = 0.1; // 10% Discount

    public PaymentModule(int totalCost) {
        super();
        this.totalCost = totalCost;
    }

    @Override
    public void moduleDetails() {
        System.out.println("Payment Module: Handle your payments here");
    }

    @Override
    public void displayOptions() {
        System.out.println("1 - Apply Discount");
        System.out.println("2 - Proceed to Payment");
    }

    @Override
    public void processOption(int option) {
        switch (option) {
            case 1:
                applyDiscount();
                break;
            case 2:
                makePayment();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private void applyDiscount() {
        double discountedCost = totalCost - (totalCost * DISCOUNT);
        System.out.println("Discount applied. New total: $" + discountedCost);
        totalCost = (int) discountedCost; // Update total cost after discount
    }

    private void makePayment() {
        System.out.println("Payment successful! Amount paid: $" + totalCost);
    }
}
