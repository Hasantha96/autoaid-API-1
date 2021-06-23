package com.alpha5.autoaid.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rate_and_review")
public class RateAndReview {

    @Id
    @GeneratedValue
    private long rateId;

    @CreationTimestamp
    private Date date;

    @Column(nullable = false)
    private int systemRate;

    @Column(nullable = false)
    private int repairRate;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "repair_id")
    Repair repair;
}