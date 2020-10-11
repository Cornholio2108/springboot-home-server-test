package com.home_server.example.bootfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "shoppinglist")
public class ShoppingList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shoppinglist_id")
	private Long shoppingListID;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Column(name = "modification_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationDate;

	@OneToMany(mappedBy = "shoppingList", cascade = CascadeType.ALL)
	private List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();

	public ShoppingList() {
		super();
	}

	public Long getShoppingListID() {
		return shoppingListID;
	}

	public void setShoppingListID(Long shoppingListID) {
		this.shoppingListID = shoppingListID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public List<ShoppingListItem> getItems() {
		return items;
	}

	public void setItems(List<ShoppingListItem> items) {
		this.items = items;
	}
}
