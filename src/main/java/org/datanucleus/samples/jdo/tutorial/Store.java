package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created with IntelliJ IDEA.
 * User: vinay.varma
 * Date: 12/12/13
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
@PersistenceCapable
public class Store {
    @PrimaryKey
    String name;

    Inventory inventory;

    public Store(String name, Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
        inventory.setStore(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
