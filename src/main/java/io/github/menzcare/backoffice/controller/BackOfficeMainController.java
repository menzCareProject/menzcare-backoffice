package io.github.menzcare.backoffice.controller;

import io.github.menzcare.backoffice.service.BackOfficeMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BackOfficeMainController {
    private final BackOfficeMainService backOfficeMainService;

    @GetMapping("/test")
    public String controllerTest() {
        return backOfficeMainService.testService();
    }

    @GetMapping("/save")
    public String save() {
        return backOfficeMainService.saveMember();
    }
}
