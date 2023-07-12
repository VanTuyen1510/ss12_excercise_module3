package ss11_excercise_map.excercsie_two.repository;

import ss11_excercise_map.excercsie_two.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> addProduct(Product P);
    List<Product> editProduct(int id);
    List<Product> deleteProduct(int id);
    List<Product> showProduct();
    List<Product> searchProduct(String name);
    List<Product> ascendingProductSort ();
    List<Product> sortProductsReduced ();
}
