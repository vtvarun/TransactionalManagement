package com.Transaction2.Repository;

import com.Transaction2.Model.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderTable,Integer> {
}
