package com.brian.vinne.repository;

import com.brian.vinne.model.Category;
import com.brian.vinne.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, String> {

    @Query(value = "CALL sp_AllSubCategories();", nativeQuery = true)
    List<Subcategory> findAllSubCategories();

    @Query(value = "CALL sp_findBySubCategoryId(:id_sub);", nativeQuery = true)
    Subcategory findSubById(@Param("id_sub") String id_sub);

    @Query(value = "CALL sp_AddSubCategory(:#{#subcategory.id_sub}, :#{#subcategory.name}, :#{#subcategory.id_cat});", nativeQuery = true)
    Subcategory addSubCategory(@Param("subcategory") Subcategory category);

    @Query(value = "CALL sp_UpdateSubCategory(:#{#subcategory.id_sub}, :#{#subcategory.name}, :#{#subcategory.id_cat});", nativeQuery = true)
    Subcategory updateSubCategory(@Param("subcategory") Subcategory category);

    @Query(value = "CALL sp_DeleteSubCategory(:id_sub);", nativeQuery = true)
    List<Subcategory> deleteSubCategory(@Param("id_sub") String id_sub);



}
