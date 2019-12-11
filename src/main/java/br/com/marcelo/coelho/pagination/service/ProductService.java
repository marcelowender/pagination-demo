package br.com.marcelo.coelho.pagination.service;


import br.com.marcelo.coelho.pagination.model.*;
import br.com.marcelo.coelho.pagination.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }

}
