package com.gabriel.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
  @GetMapping("/hello/world")
  public String helloword() {
    return "Hello, World!";
  }
  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }
  @GetMapping("/world")
  public String word() {
    return "World!";
  }
}
