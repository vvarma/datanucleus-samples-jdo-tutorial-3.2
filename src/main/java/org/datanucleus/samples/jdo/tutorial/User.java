package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: vinay.varma
 * Date: 12/12/13
 * Time: 1:02 AM
 * To change this template use File | Settings | File Templates.
 */
@PersistenceCapable
public class User {
    @PrimaryKey
    String name;
    Set<Product> products;

    public User(String name) {
        this.name = name;
        products=new HashSet<Product>();
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
