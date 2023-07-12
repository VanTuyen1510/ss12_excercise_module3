package ss10_excercise_map.excercsie_two.model;

import java.util.Comparator;
import java.util.List;

public class Product {
    private int id ;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



//    @Override
//    public int compareTo(Product product) {
//        return this.getName().compareTo(product.getName());
//    }
//   Comparable chỉ sử dụng được String à ???


}
