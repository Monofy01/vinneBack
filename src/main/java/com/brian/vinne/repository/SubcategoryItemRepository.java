package com.brian.vinne.repository;

import com.brian.vinne.model.Subcategory;
import com.brian.vinne.model.SubcategoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryItemRepository extends JpaRepository<SubcategoryItem, String> {
    @Query(value = "CALL sp_AllSubCategoriesItem();", nativeQuery = true)
    List<SubcategoryItem> findAllSubItemCategories();

    @Query(value = "CALL sp_findBySubCategoryItemId(:id_subItem);", nativeQuery = true)
    SubcategoryItem findSubItemById(@Param("id_subItem") String id_subItem);

    @Query(value = "CALL sp_AddSubcategoryItem(:#{#subcategoryItem.id_subitem}, :#{#subcategoryItem.name}, :#{#subcategoryItem.id_sub});", nativeQuery = true)
    SubcategoryItem addSubItemCategory(@Param("subcategoryItem") SubcategoryItem subcategoryItem);

    @Query(value = "CALL sp_UpdateSubCategoryItem(:#{#subcategoryItem.id_subitem}, :#{#subcategoryItem.name}, :#{#subcategoryItem.id_sub});", nativeQuery = true)
    SubcategoryItem updateSubItemCategory(@Param("subcategoryItem") SubcategoryItem subcategoryItem);

    @Query(value = "CALL sp_DeleteSubCategoryItem(:id_subItem);", nativeQuery = true)
    List<SubcategoryItem> deleteSubItemCategory(@Param("id_subItem") String id_subItem);
}
