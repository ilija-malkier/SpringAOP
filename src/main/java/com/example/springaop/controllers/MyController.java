package com.example.springaop.controllers;

import com.example.springaop.annotations.CustomAnotation;
import com.example.springaop.entity.Product;
import com.example.springaop.exceptions.ProductExceptioin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MyController {


    @GetMapping("/")
    @CustomAnotation
    public Product getProduct(){
        return new Product(UUID.randomUUID(),"Test",20.0);
    }
    @GetMapping("/cao")
    public void getProduct1(){

    }
    @GetMapping("/caogreska")
    public void getProduct2(){
        throw new ProductExceptioin("caogreska");
    }


}
