package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Cart;
import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService pservice;
	
	//view all products
	@GetMapping("/viewproduct")
	public ModelAndView getAllProduct(){
		List<Product> plist = pservice.getAllProduct();
		return new ModelAndView("displayproducts","plist",plist);
	}
	
	//add new product in cart
	@GetMapping("/addtocart/{pid}")
	public ModelAndView addProdToCart(@PathVariable("pid") int pid) {
		pservice.addProdToCart(pid);
		List<Cart> cartlist=pservice.getCartProduct();
		
		return new ModelAndView("cartproducts","cartlist",cartlist);
	}
	
	//display cart
	@GetMapping("/viewcart")
	public ModelAndView cartProd(){
		List<Cart> cartlist=pservice.getCartProduct();
		
		return new ModelAndView("cartproducts","cartlist",cartlist);
	}
	
	//remove item from cart
	@GetMapping("/removeitem/{pid}")
	public ModelAndView removeItem(@PathVariable("pid") int pid) {
		pservice.removeItem(pid);
		return new ModelAndView("redirect:/product/viewcart");
	}
	
	//to fully empty cart
	@GetMapping("/emptycart")
	public ModelAndView emptyCart() {
		pservice.emptyCart();
		return new ModelAndView("redirect:/product/viewproduct");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}