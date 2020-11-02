package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    static List<Product> products;
    static {
        products=new ArrayList<>();
        products.add(new Product(1,"TV","Ti vi"));
        products.add(new Product(2,"Tu lanh","Ti vi"));
        products.add(new Product(3,"May giat","Ti vi"));
        products.add(new Product(4,"Dieu hoa","Ti vi"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for(int i=0;i<products.size();i++)
            if(id==products.get(i).getId())
                return products.get(i);
            return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void edit(int id) {

    }

    @Override
    public void delete(int id) {

    }
}
