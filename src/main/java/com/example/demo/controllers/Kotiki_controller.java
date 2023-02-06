package com.example.demo.controllers;

import com.example.demo.repository.Kotiki_repository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Kotiki_controller {
    @Autowired
    Kotiki_repository kotiki_Repository;
    @GetMapping("/")
    ResponseEntity<?> index(){
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }
}
