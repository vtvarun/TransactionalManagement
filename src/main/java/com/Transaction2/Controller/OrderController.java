package com.Transaction2.Controller;

import com.Transaction2.DTO.OrderDTO;
import com.Transaction2.Model.OrderTable;
import com.Transaction2.Service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderTableService orderTableService;

    @PostMapping("/place-order")
    public ResponseEntity<OrderTable> placeOrders(@RequestBody OrderDTO orderDTO){
        return new ResponseEntity<>(orderTableService.placeOrder(orderDTO), HttpStatus.CREATED);
    }
}
