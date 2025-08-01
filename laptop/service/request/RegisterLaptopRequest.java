package com.example.springdeploytest.laptop.service.request;

import com.example.springdeploytest.account.entity.Account;
import com.example.springdeploytest.laptop.entity.Laptop;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RegisterLaptopRequest {
    final private String name;
    final private Long accountId;

    public Laptop tolaptop(Account account) {
        return new Laptop(name, account);
    }
}
