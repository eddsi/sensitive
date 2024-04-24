package com.biunova.sensitive.controller;

import com.github.houbb.sensitive.word.core.SensitiveWordHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensitiveWordController {

    @PostMapping("/api/sensitive/check")
    public boolean checkSensitiveWord(@RequestBody String text) {
        return SensitiveWordHelper.contains(text);
    }
}
