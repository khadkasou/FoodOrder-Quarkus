package org.souraj.controller;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.souraj.dto.CategoryDto;
import org.souraj.exceptions.CustomExceptions;
import org.souraj.model.Category;
import org.souraj.response.RestResponse;
import org.souraj.service.CategoryService;
import java.util.List;

@Path("/category")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoryController {

    @Inject
    CategoryService categoryService;

    @POST
    @RolesAllowed({"Admin","User"})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveCategory(Category category) {
        categoryService.save(category);
        return RestResponse.buildResponse(true, "201",
                "Category created successfully", category);
    }

    @GET
    @Path("/{id}")
    public Response findCategoryById(@PathParam("id") Long id) {
        Category category = categoryService.findById(id);
        if (category == null) {
            throw new CustomExceptions("Category with id "+category.getId()+ " could not find.");
        } else {
            return Response.ok(category).build();
        }
    }

    @GET
    @PermitAll
    public List<Category> listAllCategory() {
        return categoryService.findAll();
    }

    @DELETE
    @RolesAllowed({"Admin"})
    @Path("/{id}")
    public Boolean deleteCategory(@PathParam("id") Long id) {
        boolean deleted = categoryService.delete(id);

        return true;
    }

    @PUT
    @RolesAllowed({"Admin","User"})
    @Path("/{id}")
    public Response updateCategory(@PathParam("id") Long id, CategoryDto category) {
        Category updatedCategory = categoryService.update(id, category);
        if (updatedCategory != null) {
            return Response.ok(updatedCategory).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
