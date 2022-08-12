package com.enterprise.taxationapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.taxationapi.service.ImobileService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/imobile")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ImobileController {

    private final ImobileService imobileService;
    
    @GetMapping
    public ResponseEntity<?> listImobileByCity(@RequestParam String city) {
        return ResponseEntity.ok().build();
    }
    
}
