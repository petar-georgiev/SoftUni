package restaurant.entities.healthyFoods;

import restaurant.common.ExceptionMessages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;

public abstract class Food implements HealthyFood {
    private String name;
    private double portion;
    private double price;

    protected Food(String name, double portion, double price) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public double getPortion() {
        return this.portion;
    }

    public void setPortion(double portion) {
        if (portion <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PORTION);
        }
            this.portion = portion;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }
        this.price = price;
    }
}
