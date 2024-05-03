package com.Transaction2.Controller;

import com.Transaction2.DTO.PaymentDTO;
import com.Transaction2.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/make-Payments")
public class PaymentController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/make-payment")
    public String makePayment(@RequestBody PaymentDTO paymentDTO) throws Exception {
        customerService.makePayment(paymentDTO);
        return "Payment is successful";
    }


}
