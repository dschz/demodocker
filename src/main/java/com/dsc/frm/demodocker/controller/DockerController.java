package com.dsc.frm.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DSchneider
 */
@RestController
public class DockerController {
    @GetMapping("/dscdocker")
    public String dockerDemo() {
        return "dsc test dockerizing spring boot app demo";
    }
}
