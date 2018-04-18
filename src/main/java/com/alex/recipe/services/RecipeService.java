package com.alex.recipe.services;

import java.util.Set;

import com.alex.recipe.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
