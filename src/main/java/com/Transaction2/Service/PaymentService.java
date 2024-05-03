package com.Transaction2.Service;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class PaymentService {

    HashMap<Integer,Integer> map;

    PaymentService(){
        map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,1000);
    }

    public boolean checkPayment(Integer customerId, Integer productPrice){

        if(map.get(customerId) >= productPrice){
           Integer newAmount =  map.get(customerId) - productPrice;
           map.put(customerId,newAmount);
            return true; // customer has money
        }

        return false; // customer doesn't have money
    }
}
