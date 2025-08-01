package com.example.springdeploytest.laptop.service.response;


import com.example.springdeploytest.laptop.entity.Laptop;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterLaptopResponse {
    final private String name;
    final private String Productname;
    final private String Producttype;
    final private Long price;

    public static RegisterLaptopResponse from(final Laptop laptop) {
        return new RegisterLaptopResponse(
                laptop.getName(),
                laptop.getProductName(),
                laptop.getProductType(),
                laptop.getPrice()
        );
    }
}
