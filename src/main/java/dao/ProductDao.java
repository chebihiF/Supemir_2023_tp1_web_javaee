package dao;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new ArrayList<Product>();

    public void initProducts() {
        products.add(new Product(1L,"TV Sumsung",8000, 10));
        products.add(new Product(2L,"Iphone 12",7000, 30));
        products.add(new Product(3L,"Sumsung Note 12",12000, 100));
        products.add(new Product(4L,"Moniteur",2000, 300));
        products.add(new Product(5L,"Sumsung S12",5000, 200));
        products.add(new Product(6L,"Iphone 13 pro max",15000, 10));
    }

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
