package br.com.marcelo.coelho.pagination.controller;


import br.com.marcelo.coelho.pagination.model.*;
import br.com.marcelo.coelho.pagination.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    private List<Product> getAllPersons() {
        return productService.getAllProducts();
    }
}
