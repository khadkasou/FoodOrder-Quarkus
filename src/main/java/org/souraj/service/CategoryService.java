package org.souraj.service;


import org.souraj.dto.CategoryDto;
import org.souraj.model.Category;

import java.util.List;


public interface CategoryService {

    Category save(Category category);

    Category findById(Long id);

    List<Category> findAll();

    boolean delete(Long id);
    Category update(Long id,CategoryDto category);



}
