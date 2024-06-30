package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Cart;
import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.getAllProduct();
	}

	@Override
	public List<Cart> getCartProduct() {
		// TODO Auto-generated method stub
		return pdao.getCartProduct();
	}

	@Override
	public void addProdToCart(int pid) {
		// TODO Auto-generated method stub
		 pdao.addProdToCart(pid);
	}

	@Override
	public void removeItem(int pid) {
		pdao.removeItem(pid);
		
	}

	@Override
	public void emptyCart() {
		// TODO Auto-generated method stub
		pdao.emptyCart();
	}
	
}
