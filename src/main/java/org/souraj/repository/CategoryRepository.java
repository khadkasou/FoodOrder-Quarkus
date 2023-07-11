package org.souraj.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.souraj.model.Category;


public interface CategoryRepository extends PanacheRepository<Category> {

}
