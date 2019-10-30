package com.suyeb.security.jwtsecurity.controller;

import com.suyeb.security.jwtsecurity.model.JwtUser;
import com.suyeb.security.jwtsecurity.security.JwtTokenGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtTokenGenerator jwtTokenGenerator;

    public TokenController(JwtTokenGenerator jwtTokenGenerator) {
        this.jwtTokenGenerator = jwtTokenGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtTokenGenerator.generate(jwtUser);

    }
}
