package service;

import model.Product;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private ProductRepositoryImpl repository = new ProductRepositoryImpl();
    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public Product findById(int id) {
      return repository.findById(id);
    }

    @Override
    public void upDate(Product product) {
        repository.upDate(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
