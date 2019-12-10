package br.com.marcelo.coelho.pagination.model;


import lombok.*;

import javax.persistence.*;
import java.math.*;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private BigDecimal value;
}
