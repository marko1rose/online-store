package com.marko.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.marko.shoppingbackend.dao.CategoryDAO;
import com.marko.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List <Category> categories = new ArrayList<Category>();
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("Random description mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("Random description laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Television");
		category.setDescription("Random description television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category:categories) {
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
