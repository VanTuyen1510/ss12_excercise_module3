package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private static Map<Integer, Customer> customerMap = new LinkedHashMap<>();
    static {
        String image1 = "image/image1.jpg";
        customerMap.put(1,new Customer("Ronaldo","1985-02-05","Bồ Đào Nha",image1));
        String image2 = "/image/image2.jpg";
        customerMap.put(2,new Customer("Ronaldinho","1980-03-21","Brazil",image2));
        String image3 = "/image/image3.jpg";
        customerMap.put(3,new Customer("Messi","1987-06-24","Argentina",image3));
        String image4 = "/image/image4.jpg";
        customerMap.put(5,new Customer("Neymar","1992-02-05","Brazil",image4));
        String image5 = "/image/image5.jpg";
        customerMap.put(4,new Customer("Rosicky","1980-10-04","Cộng Hòa Séc",image5));
    }
    public List<Customer> getList(){
        return new ArrayList<>(customerMap.values());
    }
}
