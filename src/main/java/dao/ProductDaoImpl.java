package dao;

import entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements IProductDao {

    private SessionFactory factory = HibernateUtil.getFactory();
    private Session session = null ;
    @Override
    public Product save(Product product) throws Exception {
        try {
            if(session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            return product;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new RuntimeException("cannot save this product");
        }finally {
            session.close();
        }


    }

    @Override
    public Product update(Product product) throws Exception {
        try {
            if(session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
            return product;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new RuntimeException("cannot save this product");
        }finally {
            session.close();
        }
    }

    @Override
    public Product delete(Product product) throws Exception {
        try {
            if(session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
            return product;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new RuntimeException("cannot save this product");
        }finally {
            session.close();
        }
    }

    @Override
    public Product getById(Long id) throws Exception {
        Product product = null;
        try {
            if(session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();
            product =  session.find(Product.class,id);
            session.getTransaction().commit();
            return product;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new RuntimeException("cannot save this product");
        }finally {
            session.close();
        }
    }

    @Override
    public List<Product> getAll() throws Exception {
        List<Product> products = new ArrayList<>();
        try {
            if(session!=null && session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();
            products =  session.createQuery("from Product",Product.class).getResultList();
            session.getTransaction().commit();
            return products;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new RuntimeException("cannot save this product");
        }finally {
            session.close();
        }
    }
}
