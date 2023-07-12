package ss11_excercise_map.excercsie_two.service;

import ss11_excercise_map.excercsie_two.model.Product;
import ss11_excercise_map.excercsie_two.repository.IProductRepository;
import ss11_excercise_map.excercsie_two.repository.ProductRepositoryImpl;

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
        return repository.ascendingProductSort();
    }

    @Override
    public List<Product> sortProductsReduced() {
        return repository.sortProductsReduced();
    }
}
