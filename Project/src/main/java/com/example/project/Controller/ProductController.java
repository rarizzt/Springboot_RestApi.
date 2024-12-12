package com.example.project.Controller;


import com.example.project.Models.entities.Product;
import com.example.project.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id") Long id) {
        return productService.findOne(id);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }


    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        productService.removeOne(id);
    }

}

