package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Student;
import com.geekbrains.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products-list")
    public String returnProductList(Model model) {
        model.addAttribute("name", "(Полный список)");
        model.addAttribute("products", productsService.getAll());
        return "products/products-list";
    }

    @GetMapping("/product-add")
    public String addProduct(Model model) {
        Product product = new Product(-1, "", 0);
        model.addAttribute("product", product);
        return "products/product-add";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productsService.addProduct(product);
        return "products/product-add-result";
    }
}
