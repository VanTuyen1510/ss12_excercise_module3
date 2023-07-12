package ss10_excercise_map.excercsie_two.service;

import ss10_excercise_map.excercsie_two.model.Product;
import ss10_excercise_map.excercsie_two.repository.IProductRepository;
import ss10_excercise_map.excercsie_two.repository.ProductRepositoryImpl;

import java.lang.reflect.Array;
import java.util.List;

public class ProductServiceIpml implements IProductService {
    private IProductRepository repository = new ProductRepositoryImpl();
    @Override
    public List<Product> addProduct(Product product) {
        return repository.addProduct(product);
    }

    @Override
    public List<Product> editProduct(int id) {
        return repository.editProduct(id);
    }

    @Override
    public List<Product> deleteProduct(int id) {
        return repository.deleteProduct(id);
    }

    @Override
    public List<Product> showProduct() {
        return repository.showProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return repository.searchProduct(name);
    }

    @Override
    public List<Product> ascendingProductSort() {
        return null;
    }

    @Override
    public List<Product> sortProductsReduced() {
        return null;
    }
}
