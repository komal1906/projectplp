package com.capgemini.capstore.beans;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mycart")
public class Cart
{
	@Id
	@Column(name="cartId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "mycart")
	
	private List<CartProduct> cartProd = new ArrayList<>();

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	@Override
	public String toString() {
		return "MyCart [cartId=" + cartId + ", cartProd=" + cartProd + "]";
	}

	
	public List<CartProduct> getCartProd() {
		return cartProd;
	}

	public void setCartProd(List<CartProduct> cartProd) {
		this.cartProd = cartProd;
	}

	public Cart(int cartId) {
		super();
		this.cartId = cartId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
