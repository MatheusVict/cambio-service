package com.example.cambioservice.controller;

import com.example.cambioservice.model.Cambio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {

  @GetMapping("/cambio/{amount}/{from}/{to}")
  public Cambio getCambio(
          @PathVariable("amount") BigDecimal amount,
          @PathVariable("from") String from,
          @PathVariable("to") String to
  ) {
    return new Cambio();
  }
}
