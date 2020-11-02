package service;

import model.Product;

import java.beans.Customizer;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void edit(int id);
    void delete(int id);
}
