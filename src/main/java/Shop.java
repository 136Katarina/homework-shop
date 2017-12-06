import java.util.ArrayList;
import java.util.*;

public class Shop {
    String name;
    ArrayList<Item> stock;
    int capacity;

    public Shop(String name, int capacity){
        this.name = name;
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }


    public int itemCount() {
        return stock.size();
    }

    public void add(Item item) {
        stock.add(item);
    }



    public void sell(Item item) {
        stock.remove(2);
    }


    public boolean isFull() {
        return this.stock.size() == capacity;
    }


}
