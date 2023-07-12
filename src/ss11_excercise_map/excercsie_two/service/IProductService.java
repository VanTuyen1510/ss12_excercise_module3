package ss11_excercise_map.excercsie_two.service;

import ss11_excercise_map.excercsie_two.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> addProduct(Product product);
    List<Product> editProduct(int id);
    List<Product> deleteProduct(int id);
    List<Product> showProduct();
    List<Product> searchProduct(String name);
    List<Product> ascendingProductSort ();
    List<Product> sortProductsReduced ();
}
