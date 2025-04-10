package br.com.lucaslnasc.gestao_vagas.modules.cadidate;

import java.util.UUID;

import lombok.Data;

@Data
public class CadidateEntity {

  private UUID id;
  private String name;
  private String username;
  private String email;
  private String password;
  private String description;
  private String curriculum;

}