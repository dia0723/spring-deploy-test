package com.example.springdeploytest.laptop.service;


import com.example.springdeploytest.account.repository.AccountRepository;
import com.example.springdeploytest.laptop.entity.Laptop;
import com.example.springdeploytest.laptop.repository.LaptopRepository;
import com.example.springdeploytest.laptop.service.request.RegisterLaptopRequest;
import com.example.springdeploytest.laptop.service.response.RegisterLaptopResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LaptopServiceImpl {
    final private AccountRepository accountRepository;
    final private LaptopRepository laptopRepository;

    @Override
    public RegisterLaptopResponse register(RegisterLaptopRequest request) {
        Long accountId = accountRepository.findById(accountId)
                .orElseThrow() ->new RuntimeException("존재하지 않는 사용자입니다.")
    }

    ;

    Laptop requestedLaptop = request.toCompany(account);
    Laptop savedLaptop = laptopRepository.save(requestedLaptop);

    return RegisterLaptopResponse.from(savedLaptop);
}
