package org.souraj.service;

import org.souraj.model.Category;

import java.util.List;

public interface CategoryService {

    void save(Category category);

    Category findById(Long id);

    List<Category> findAll();

    void delete(Long id);
    void update(Category category);



}
