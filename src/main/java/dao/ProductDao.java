package dao;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new ArrayList<Product>();

    public Product addProduct(Product product) throws Exception{
        // add product to DB
        products.add(product);
        return product;
    }

    public Product updateProduct(Product product) throws Exception{
        // add product to DB
        Product prod = products
                .stream()
                .filter(p -> p.getCode() == product.getCode())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("product not found"));
        prod.setLabel(product.getLabel());
        prod.setPrice(product.getPrice());
        prod.setQuantity(product.getQuantity());

        return product;
    }

    public List<Product> getProducts() throws Exception{
        return products;
    }





}
