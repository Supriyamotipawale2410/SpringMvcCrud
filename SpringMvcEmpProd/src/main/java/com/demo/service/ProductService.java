package com.demo.service;

import java.util.List;

import com.demo.beans.Cart;
import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProduct();

	List<Cart> getCartProduct();

	 void addProdToCart(int pid);

	void removeItem(int pid);

	void emptyCart();

}
