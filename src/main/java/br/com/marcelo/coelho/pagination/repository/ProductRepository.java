package br.com.marcelo.coelho.pagination.repository;

import br.com.marcelo.coelho.pagination.model.*;
import org.springframework.data.repository.*;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}