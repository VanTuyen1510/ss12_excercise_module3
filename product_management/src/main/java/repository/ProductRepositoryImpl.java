package repository;

import model.Product;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository{
    private static Map<Integer,Product> productMap = new HashMap<>();
    //int id, String name, int price, String describe, String origin, Date dateRelease
    static {
        productMap.put(1,new Product(1,"Laptop Dell N1440",12000000,"VIP","Trung Quốc",new Date()));
        productMap.put(2, new Product(2, "Laptop Asus Zenbook",  13000000, "Normal","Trung Quốc",new Date()));
        productMap.put(3, new Product(3, "Iphone 14 pro max", 26000000, "VIP", "Trung Quốc",new Date()));
        productMap.put(4, new Product(4, "Samsung ZFlip",  20000000, "Normal", "Trung Quốc",new Date()));
        productMap.put(5, new Product(5, "LG Oled C2 48inch", 20000000, "VIP", "Trung Quốc",new Date()));
    }
    @Override
    public void add(Product product) {
         productMap.put(product.getId(),product);
    }

    @Override
    public void delete(Product product) {
        productMap.remove(product.getId());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void upDate(Product product) {
         productMap.put(product.getId(),product);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }
}
