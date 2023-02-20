package dao;

import entities.Product;

import java.util.List;

public interface IProductDao {
    Product save(Product product) throws Exception;
    Product update(Product product) throws Exception;
    Product delete(Product product) throws Exception;
    Product getById(Long id) throws Exception;
    List<Product>    getAll() throws Exception;

}
