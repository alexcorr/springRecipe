package com.alex.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.recipe.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByName(String name);
}
