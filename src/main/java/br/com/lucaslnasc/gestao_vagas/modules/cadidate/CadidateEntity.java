package br.com.lucaslnasc.gestao_vagas.modules.cadidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CadidateEntity {

  private UUID id;
  private String name;

  @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não pode estar vazio ou conter apenas espaços")
  private String username;

  @Email(message = "O campo [email] deve ser um email válido")
  private String email;

  @Length(min = 6, max = 20, message = "O campo [password] deve ter entre 6 a 20 caracteres")
  private String password;
  private String description;
  private String curriculum;

}