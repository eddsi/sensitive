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

    @PostMapping("/api/sensitive/replace")
    public String replaceSensitiveWord(@RequestBody String text) {
        return SensitiveWordHelper.replace(text);
    }

    @PostMapping("/api/sensitive/replaceWith")
    public String replaceSensitiveWordWith(@RequestBody String text) {
        return SensitiveWordHelper.replace(text, '-');
    }
}
