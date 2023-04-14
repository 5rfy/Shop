package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
    private BigDecimal price;
    private Integer quantity;
    @ManyToMany
    @JoinTable(
            name = "products_discounts",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "discount_id")
    )
    private List<Discount> discounts;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
    @OneToMany(mappedBy = "product")
    private List<Rating> ratings;
    @Embedded
    private KeywordAndCharacteristics keywordAndCharacteristics;

}
