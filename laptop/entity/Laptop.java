package com.example.springdeploytest.laptop.entity;


import com.example.springdeploytest.account.entity.Account;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @CreationTimestamp
    private LocalDateTime created;

    public Laptop(Account account) {
        this.account = account;
    }

    public Object getProductName() {
    }

    public Object getProductType() {
    }
}
