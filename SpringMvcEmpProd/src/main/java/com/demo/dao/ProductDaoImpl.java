package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Cart;
import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProduct() {
		List<Product> plist = jdbcTemplate.query("select * from product", (rs,num)->{
												Product p = new Product();
												p.setPid(rs.getInt(1));
												p.setPname(rs.getString(2));
												p.setQty(rs.getInt(3));
												p.setPrice(rs.getDouble(4));
												return p;
		});
		return plist;
	}

	@Override
	public List<Cart> getCartProduct() {
		List<Cart> cartlist = jdbcTemplate.query("select * from cart",(rs,num)->{
			Cart p = new Cart();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			return p;
});
		return cartlist;
	}

	@Override
	public void addProdToCart(int pid) {
		jdbcTemplate.update("insert into cart(pname,price) values((select pname from product where pid=?),(select price from product where pid=?))",
							new Object[] {pid,pid});
		
	}

	@Override
	public void removeItem(int pid) {
		jdbcTemplate.update("delete from cart where pid = ? ",
							new Object[] {pid});
	}

	@Override
	public void emptyCart() {
		jdbcTemplate.update("truncate table cart");
		
	}
}
