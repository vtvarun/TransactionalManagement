package com.Transaction2.Service;

import com.Transaction2.DTO.OrderDTO;
import com.Transaction2.Model.Customers;
import com.Transaction2.Model.OrderTable;
import com.Transaction2.Model.Products;
import com.Transaction2.Repository.CustomerRepository;
import com.Transaction2.Repository.OrderRepository;
import com.Transaction2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderTableService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;


    public OrderTable placeOrder(OrderDTO orderDTO) {

        // get the product from product ID
        Products pro = productRepository.findById(orderDTO.getProductId()).orElse(null);

        // get the customer from customer ID
        Customers cust = customerRepository.findById(orderDTO.getCustomerId()).orElse(null);

        OrderTable orderTable = new OrderTable();
        orderTable.setCustomers(cust);
        orderTable.setProduct(pro);
        orderTable.setPaid(false);
        orderTable.setDelivered(false);
        orderTable.setQuantity(orderDTO.getQuantity());

        return orderRepository.save(orderTable);

    }
}
