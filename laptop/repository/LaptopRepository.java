package com.example.springdeploytest.laptop.repository;

import com.example.springdeploytest.laptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
