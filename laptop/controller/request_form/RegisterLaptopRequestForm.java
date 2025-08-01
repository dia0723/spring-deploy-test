package com.example.springdeploytest.laptop.controller.request_form;


import com.example.springdeploytest.laptop.service.request.RegisterLaptopRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterLaptopRequestForm {
    final private String name;

    public RegisterLaptopRequest toRegisterLaptopRequest(Long accountId) {
        return new RegisterLaptopRequest(name, accountId);
}
