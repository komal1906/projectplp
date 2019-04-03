package com.capgemini.capstore.beans;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer
{
	@Id
	@Column(name="mobileNo",length=10)
	private String mobile;
	@Column(name="name",length=50)
	private String name;
	@Column(name="email",length=70)
	private String email;
	@Column(name="gender",length=6)
	private String gender;
	@Column(name="dob",length=20)
	private Date Dob;
	
	@OneToMany(mappedBy="customerAdd",cascade=CascadeType.ALL)
	private List<Address> MyAddress = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private WishList wishlistId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	private SavedCardDetails cardDetail;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Orders> myOrders;
	
	@Column(name="active",length=5)
	private boolean active;
	
	public Customer()
	{
		super();
	}

	public Customer(String name, String email, String mobile, String gender, Date dob, List<Address> MyAddress,WishList wishlist, Cart cart, SavedCardDetails cardDetail, List<Orders> myOrders, boolean active) 
	{
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		Dob = dob;
		this.MyAddress = MyAddress;
		this.wishlistId = wishlist;
		this.cart = cart;
		this.cardDetail = cardDetail;
		this.myOrders = myOrders;
		this.active = active;
	}


	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public List<Address> getMyAddress() {
		return MyAddress;
	}
	public void setMyAddress(List<Address> MyAddress) {
		this.MyAddress = MyAddress;
	}
	public WishList getWishlist() {
		return wishlistId;
	}
	public void setWishlist(WishList wishlistId) {
		this.wishlistId = wishlistId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public SavedCardDetails getCardDetail() {
		return cardDetail;
	}
	public void setCardDetail(SavedCardDetails cardDetail) {
		this.cardDetail = cardDetail;
	}
	public List<Orders> getMyOrders() {
		return myOrders;
	}
	public void setMyOrders(List<Orders> myOrders) {
		this.myOrders = myOrders;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() 
	{
		return "CustomerDetail [name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", Dob="
				+ Dob + ", wishlistId=" + wishlistId + ", cart=" + cart + ", cardDetail=" + cardDetail + ", myOrders="
				+ myOrders + "]";
	}
	
	
}

