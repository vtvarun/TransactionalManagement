package com.Transaction2.Repository;

import com.Transaction2.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Integer> {
}
