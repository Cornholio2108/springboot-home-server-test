package com.home_server.example.bootfaces;

import java.util.ArrayList;
import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "shoppingListController")
@ELBeanName(value = "shoppingListController")
@Join(path = "/addshoppinglist", to = "/shoppinglist-form.jsf")
public class ShoppingListController {
	@Autowired
	private ShoppingListRepository shoppingListRepository;

	private ShoppingList shoppingList = new ShoppingList();
	private List<ShoppingList> allShoppingLists = new ArrayList<ShoppingList>();

	public String save() {
		shoppingListRepository.save(shoppingList);
		shoppingList = new ShoppingList();
		return "/shoppinglists.xhtml?faces-redirect=true";
	}

	public ShoppingList getShoppingList() {
		return shoppingList;
	}

	public List<ShoppingList> getAllShoppingLists() {
		return allShoppingLists;
	}
}
