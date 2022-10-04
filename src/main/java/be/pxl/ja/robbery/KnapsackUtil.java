package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public KnapsackUtil(){

    }

    public static void fill(Knapsack knapsack, Shop shop){
        List<Product> sortedItems = shop.items;
        Collections.sort(sortedItems);
        Collections.reverse(sortedItems);
        for (Product p : sortedItems){
            try{
                knapsack.add(p);
            } catch (KnapsackFullException message){
                System.out.println(message);
                break;
            }
        }
    }
}
