package com.Transaction2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String customerName;


    @Column(name = "address")
    private String customerAddress;


    @Column(name = "phoneNo")
    private Long customerNumber;

    @OneToMany(mappedBy = "customers")
    private List<OrderTable> orderTableList;
}
