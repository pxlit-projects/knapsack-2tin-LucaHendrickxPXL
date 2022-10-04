package be.pxl.ja.robbery;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    private double maximumCapacity;
    private List<Product> items = new ArrayList<>();

    public Knapsack(double maximCapacity){
        maximumCapacity = maximCapacity;
    }

    public double getCurrentWeight() {
        double currentWeight = 0;
        for(Product p : items){
            currentWeight += p.getWeight();
        }
        return currentWeight;
    }

    public void add(Product product) throws KnapsackFullException {
        if(product.getWeight() + getCurrentWeight() <= maximumCapacity){
            items.add(product);
        } else {
            throw new KnapsackFullException("[" + product.getName() + "] past niet in de knalzak");
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
