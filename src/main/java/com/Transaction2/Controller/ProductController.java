package com.Transaction2.Controller;

import com.Transaction2.Model.Products;
import com.Transaction2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add-product")
    public ResponseEntity<Products> addProduct(@RequestBody Products products){
        Products products1 = productService.addProduct(products);
        return new ResponseEntity<>(products1, HttpStatus.CREATED);
    }

}
