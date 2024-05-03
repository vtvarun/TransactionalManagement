package com.Transaction2.Service;

import com.Transaction2.DTO.PaymentDTO;
import com.Transaction2.Model.Customers;
import com.Transaction2.Model.OrderTable;
import com.Transaction2.Model.Products;
import com.Transaction2.Repository.CustomerRepository;
import com.Transaction2.Repository.OrderRepository;
import com.Transaction2.Repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PaymentService paymentService;

    @Autowired
    ProductRepository productRepository;

    public Customers addCustomer(Customers customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    public void makePayment(PaymentDTO paymentDTO) throws Exception {


        // i will get the order details
        OrderTable order = orderRepository.findById(paymentDTO.getOrderId()).orElse(null);

        Products product = order.getProduct();

        // reduce the quantity from the product database
        product.setQuantity(product.getQuantity() - order.getQuantity());

        //saved the product with updated quantity
        productRepository.save(product);

        log.info("Updated the quantity");

        int amountTobePaid = (int) (product.getProductPerPrice() * order.getQuantity());


        boolean paymentSuccessful = paymentDTO.getAmount() == amountTobePaid;

        if(paymentSuccessful == false){
            throw new RuntimeException("Your account doesn't have enough money");
        }

        order.setPaid(true);
        orderRepository.save(order);
    }
}
