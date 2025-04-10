package br.com.lucaslnasc.gestao_vagas.modules.cadidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucaslnasc.gestao_vagas.modules.cadidate.CadidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CadidateController {

  @PostMapping("/")
  public void create(@Valid @RequestBody CadidateEntity cadidateEntity) {
    System.out.println("Candidate");
    System.out.println(cadidateEntity.getEmail());
  }
}
