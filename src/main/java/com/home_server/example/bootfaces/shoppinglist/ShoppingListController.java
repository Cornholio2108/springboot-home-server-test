package com.home_server.example.bootfaces.shoppinglist;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "shoppingListController")
@ELBeanName(value = "shoppingListController")
//@Join(path = "/shoppinglists", to = "/shoppinglist-form.jsf")
public class ShoppingListController {
	@Autowired
	private ShoppingListRepository shoppingListRepository;

	private ShoppingList shoppingList = new ShoppingList();
	private ShoppingList selectedShoppingList = new ShoppingList();
	private List<ShoppingList> allShoppingLists = new ArrayList<ShoppingList>();

	@PostConstruct
	private void init() {
		allShoppingLists = shoppingListRepository.findAll();
	}

	public String save() {
//		shoppingListRepository.save(shoppingList);
//		shoppingList = new ShoppingList();
//		return "/shoppinglists.xhtml?faces-redirect=true";
		selectedShoppingList = shoppingListRepository.save(selectedShoppingList);
		return null;
	}

	public void onNewClick() {
		selectedShoppingList = new ShoppingList();
	}

	public void editList() {
		int i = 0;
	}

	public ShoppingList getShoppingList() {
		return shoppingList;
	}

	public List<ShoppingList> getAllShoppingLists() {
		return allShoppingLists;
	}

	public ShoppingList getSelectedShoppingList() {
		return selectedShoppingList;
	}

	public void setSelectedShoppingList(ShoppingList selectedShoppingList) {
		this.selectedShoppingList = selectedShoppingList;
	}

}
