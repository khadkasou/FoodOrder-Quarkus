package org.souraj.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.souraj.dto.CategoryDto;
import org.souraj.model.Category;
import org.souraj.repository.CategoryRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class CategoryServiceImpl implements CategoryService, Serializable {

    @Inject
    CategoryRepository categoryRepository;



    @Override
    @Transactional
    public Category save(Category category) {
        categoryRepository.persist(category);
        return category;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll().list();
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        categoryRepository.deleteById(id);
        return false;
    }

    @Override
    @Transactional
    public Category update(Long id, CategoryDto categoryDto) {
        Optional<Category> optionalCategory = Optional.ofNullable(categoryRepository.findById(id));
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            category.setName(categoryDto.getName());
            categoryRepository.persist(category);
            return category;
        }
        return null;
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findByIdOptional(id).orElse(null);
    }
}
