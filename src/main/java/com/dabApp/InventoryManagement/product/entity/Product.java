package com.dabApp.InventoryManagement.product.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "sku", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id" , referencedColumnName = "id")
    private String sku;

    @CreationTimestamp
    @Column(name = "created_at" ,nullable = false , updatable = false)
    private Instant createdAt;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;


    //constructors
    //getter and setters

}
