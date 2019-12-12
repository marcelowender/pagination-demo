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

    @GetMapping(path = "/products", params = {"page", "size"})
    private List<Product> getAllPersons(@RequestParam("page") int page,
                                        @RequestParam("size") int size) {

        return productService.getAllProducts(page, size);
    }
}
