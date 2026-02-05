package com.dabApp.InventoryManagement.product.entity;

import com.dabApp.InventoryManagement.business.entity.Business;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(
        name = "products"
)
public class Product
{

}
