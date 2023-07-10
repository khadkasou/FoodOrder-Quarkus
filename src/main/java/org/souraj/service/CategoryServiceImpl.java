package org.souraj.service;

import jakarta.inject.Inject;
import org.souraj.model.Category;
import org.souraj.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    @Inject
    private CategoryRepository categoryRepository;


    @Override
    public void save(Category category) {
       categoryRepository.persist(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> findAll() {
   return (List<Category>) categoryRepository.findAll();
       
    }

    @Override
    public void delete(Long id) {
       categoryRepository.delete(String.valueOf(id));
    }

    @Override
    public void update(Category category) {
        
         categoryRepository.persist(category);
    }
}
