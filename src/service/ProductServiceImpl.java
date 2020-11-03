package service;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
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
        for (Product product : products)
            if (id == product.getId())
                return product;
            return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void edit(int id,Product product) {
        for (Product p : products) {
            if (id == p.getId())
                products.set(id,p);
        }

    }

    @Override
    public void delete(int id) {

    }
}
