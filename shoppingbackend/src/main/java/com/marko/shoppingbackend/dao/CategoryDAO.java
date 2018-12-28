package com.marko.shoppingbackend.dao;

import java.util.List;

import com.marko.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
	
}
