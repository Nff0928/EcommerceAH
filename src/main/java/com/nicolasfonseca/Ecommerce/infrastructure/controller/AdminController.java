package com.nicolasfonseca.Ecommerce.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nicolasfonseca.Ecommerce.application.service.ProductService;
import com.nicolasfonseca.Ecommerce.domain.Product;
import com.nicolasfonseca.Ecommerce.domain.User;



@Controller
@RequestMapping("/admin")
public class AdminController {

    private final  ProductService productService;




    public AdminController (ProductService productService) {
        this.productService = productService;
    }




    @GetMapping
    public String home(Model model){
        User user = new User();
        user.setId(1);
        Iterable<Product> products = productService.getProductByUser(user);
        model.addAttribute("products", products);
        return "admin/home";
    }
    
}
