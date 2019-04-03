package com.capgemini.capstore.beans;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mywishlist")
public class WishList 
{
	@Id
	@Column(name="wishid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int wishId;
	@OneToOne(cascade=CascadeType.ALL)
	private Customer mobileNo;
	@ManyToMany(cascade = CascadeType.ALL)
	
	private List<Product> products;
	public WishList(int wishId, Customer mobileNo, List<Product> products) {
		super();
		this.wishId = wishId;
		this.mobileNo = mobileNo;
		this.products = products;
	}
	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWishId() {
		return wishId;
	}
	public void setWishId(int wishId) {
		this.wishId = wishId;
	}
	public Customer getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(Customer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "MyWishList [wishId=" + wishId + ", mobileNo=" + mobileNo + ", products=" + products + "]";
	}
	
	
	

}
