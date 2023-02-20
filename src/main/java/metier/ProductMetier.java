package metier;

import dao.ProductDao;
import dao.ProductDaoImpl;
import entities.Product;

import java.util.List;

public class ProductMetier {

    private ProductDaoImpl dao = new ProductDaoImpl();

    public void initProducts(){
        //dao.initProducts();
    }

    public Product addproduct(Product product) throws Exception{
        if(product.getQuantity()<0 || product.getLabel().trim().equals("") || product.getPrice() <0)
            throw new RuntimeException("cannot add this product");
        return dao.save(product);
    }

    public List<Product> getProducts() throws Exception{
        return dao.getAll();
    }

}
