package com.alex.recipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.recipe.services.RecipeService;

@Controller
public class IndexController {

	private final RecipeService recipeService;
	
	
	
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}



	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}

}
