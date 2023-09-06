package Model;

import Exception.EmptyStoreException;
import Exception.ProductNotFoundException;
import Exception.WrongNameException;
import Exception.ZeroPriceException;

public interface OnlineShopUI {

    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;

    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    void getAllProducts() throws EmptyStoreException;

}