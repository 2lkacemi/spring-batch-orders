package com.batch.springbatchexample;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table( catalog = "batch_demo_db", name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderRef;
    private BigDecimal amount;
    private String note;

    @Transient
    private Date tempOrderDate;

    public Order(String note) {
        this.note = note;
    }
}
