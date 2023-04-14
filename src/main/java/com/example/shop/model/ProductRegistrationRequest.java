package com.example.shop.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Organization organization;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    @Embedded
    private KeywordAndCharacteristics keywordAndCharacteristics;
}
