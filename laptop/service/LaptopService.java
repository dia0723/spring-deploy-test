package com.example.springdeploytest.laptop.service;

import com.example.springdeploytest.laptop.service.request.RegisterLaptopRequest;
import com.example.springdeploytest.laptop.service.response.RegisterLaptopResponse;

public interface LaptopService {
    RegisterLaptopResponse register(RegisterLaptopRequest request);
}