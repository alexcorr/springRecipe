package com.alex.recipe.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.alex.recipe.domain.Recipe;
import com.alex.recipe.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
	   private final RecipeRepository recipeRepository;

	    public RecipeServiceImpl(RecipeRepository recipeRepository) {
	        this.recipeRepository = recipeRepository;
	    }

	    @Override
	    public Set<Recipe> getRecipes() {
	        Set<Recipe> recipeSet = new HashSet<>();
	        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
	        return recipeSet;
	}
}
