package com.gabriel.helloworld.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

  @GetMapping("/bsm")
  public Map<String, List<String>> bsm() {
    return Map.of(
      "Habilidades", List.of("Trabalho em equipe", "Orientação aos detalhes", "Proatividade", "Comunicação"),
      "Mentalidades", List.of("Persistência", "Responsabilidade pessoal", "Orientação ao futuro", "Mentalidade de crescimento")
    );
  }

  @GetMapping("/objetivos/semana")
  public Map<String, List<String>> objetivo() {
    return Map.of(
      "Hardskill", List.of("Treinar MySQL", "Treinar SpringBoot"),
      "Softskill", List.of("Comunicacao", "Terminar o pitch" )
    );
  }
}
