package com.brian.vinne.repository;

import com.brian.vinne.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {


    @Query(value = "CALL sp_AllCategories();", nativeQuery = true)
    List<Category> findAllCategories();

    @Query(value = "CALL sp_findByCategoryId(:id_cat);", nativeQuery = true)
    Category findCatById(@Param("id_cat") String id_cat);

    @Query(value = "CALL sp_AddCategory(:#{#category.id_cat}, :#{#category.name});", nativeQuery = true)
    Category addCategory(@Param("category") Category category);

    @Query(value = "CALL sp_UpdateCategory(:#{#category.id_cat}, :#{#category.name});", nativeQuery = true)
    Category updateCategory(@Param("category") Category category);

    @Query(value = "CALL sp_DeleteCategory(:id_cat);", nativeQuery = true)
    List<Category> deleteCategory(@Param("id_cat") String id_cat);







}
