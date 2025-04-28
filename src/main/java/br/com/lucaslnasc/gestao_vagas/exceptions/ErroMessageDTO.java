package br.com.lucaslnasc.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroMessageDTO {

  private String message;
  private String field;
}