package com.example.shop.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "organizations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private byte[] logo;
    @OneToMany(mappedBy = "organization")
    private List<Product> products;
    @OneToMany
    @JoinColumn(name = "product_registration_request_id")
    private List<ProductRegistrationRequest> registrationRequests;
    private BigDecimal commissionRate;
    private boolean isActive;
}
