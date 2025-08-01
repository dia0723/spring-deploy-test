package com.example.springdeploytest.laptop.controller;


import com.example.springdeploytest.laptop.controller.request_form.RegisterLaptopRequestForm;
import com.example.springdeploytest.laptop.controller.response_form.RegisterLaptopResponseForm;
import com.example.springdeploytest.laptop.service.LaptopService;
import com.example.springdeploytest.laptop.service.request.RegisterLaptopRequest;
import com.example.springdeploytest.laptop.service.response.RegisterLaptopResponse;
import com.example.springdeploytest.redis_cache.RedisCacheService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("laptop")
public class LaptopController {

    final private LaptopService laptopService;
    final private RedisCacheService redisCacheService;

    @PostMapping("/register")
    public RegisterLaptopResponseForm registerLaptop(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody RegisterLaptopRequestForm requestForm) {

        log.info(registerLaptop());

        String userToken = authorizationHeader.replace("Bearer ", "").trim();
        Long accountId = redisCacheService.getValueByKey(userToken, Long.class);

        RegisterLaptopRequest request = requestForm.toRegisterLaptopRequest(accountId);
        RegisterLaptopResponse response = laptopService.register(request);

        return RegisterLaptopResponseForm.from(response);
    }
}
