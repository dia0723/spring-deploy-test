package com.example.springdeploytest.laptop.controller.response_form;

import com.example.springdeploytest.laptop.service.response.RegisterLaptopResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterLaptopResponseForm {
    final private String name;
    final private String Productname;
    final private String Producttype;
    final private Long price;

    public static RegisterLaptopResponseForm from(final RegisterLaptopResponse response) {
        return new RegisterLaptopResponseForm(
                response.getName(),
                response.getProductName(),
                response.getProductType(),
                response.getPrice()
        );
    }
}
