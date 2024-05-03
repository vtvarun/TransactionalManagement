package com.Transaction2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @JsonIgnore
    @OneToOne
    private Products product;

    @JsonIgnore
    @ManyToOne
    private Customers customers;

    private boolean isPaid;

    private Integer quantity;

    private boolean isDelivered;
}
