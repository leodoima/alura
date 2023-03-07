package org.example.collections;

public class Drink implements Comparable<Drink> {

    private String drinkName;
    private double amount;

    public Drink(String drinkName, double amount) {
        try {

            if (drinkName.isBlank()) {
                throw new NullPointerException("Drink name is blank");
            }

            if (amount < 0) {
                throw new IllegalArgumentException("Amount value is invalid");
            }

            this.drinkName = drinkName;
            this.amount = amount;

        } catch (NullPointerException | IllegalArgumentException e) {
            e.getMessage();
        }
    }

    public Drink(String drinkName) {
        this(drinkName, 0.0);
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public int compareTo(Drink drink) {
        return this.drinkName.compareTo(drink.drinkName);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
