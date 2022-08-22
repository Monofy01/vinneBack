package com.brian.vinne.repository;

import com.brian.vinne.model.Category;
import com.brian.vinne.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "CALL sp_AllProducts();", nativeQuery = true)
    List<Product> findAllProducts();

    @Query(value = "CALL sp_findByProductId(:sku);", nativeQuery = true)
    Product findProdById(@Param("sku") Integer sku);

    @Query(value = "CALL sp_AddProduct(:#{#product.sku}, :#{#product.name}, :#{#product.code}, :#{#product.stock}, :#{#product.id_subitem});", nativeQuery = true)
    Product addProduct(@Param("product") Product product);

    @Query(value = "CALL sp_UpdateProduct(:#{#product.sku}, :#{#product.name}, :#{#product.code}, :#{#product.stock}, :#{#product.id_subitem});", nativeQuery = true)
    Product updateProduct(@Param("product") Product product);

    @Query(value = "CALL sp_DeleteProduct(:sku);", nativeQuery = true)
    List<Product> deleteProduct(@Param("sku") Integer sku);

    @Query(value = "CALL sp_GroupProductByCatSUb();", nativeQuery = true)
    List<Object> groupProduct();

    @Query(value = "CALL sp_ProductStockRange(:val1, :val2);", nativeQuery = true)
    List<Object> productRange(@Param("val1") Integer val1, @Param("val2") Integer val2);


}
