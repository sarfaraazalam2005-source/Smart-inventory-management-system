import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int qty;
    
    Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    void display() {
        System.out.println(id + " | " + name + " | Rs." + price + " | Qty:" + qty);
    }
}

class InventoryManager {
    HashMap<Integer, Product> map = new HashMap<>();
    
    void add(Product p) {
        if (map.containsKey(p.id)) {
            System.out.println("Duplicate ID!");
            return;
        }
        map.put(p.id, p);
        System.out.println("Added: " + p.name);
    }
    
    void showAll() {
        System.out.println("\n--- INVENTORY ---");
        for (Product p : map.values()) {
            p.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryManager inv = new InventoryManager();
        
        inv.add(new Product(101, "Resistor-Kit", 250, 50));
        inv.add(new Product(102, "Arduino-Uno", 1200, 20));
        inv.add(new Product(103, "Sensor-Module", 800, 15));
        
        inv.showAll();
        
        System.out.println("\nProject Running Successfully!");
    }
}