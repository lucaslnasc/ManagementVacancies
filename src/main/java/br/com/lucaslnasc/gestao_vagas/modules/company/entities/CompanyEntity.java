package br.com.lucaslnasc.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo [username] não pode estar vazio ou conter apenas espaços")
  private String username;

  @Email(message = "O campo [email] deve ser um email válido")
  private String email;

  @Length(min = 6, max = 200, message = "O campo [password] deve ter entre 6 a 20 caracteres")
  private String password;
  private String website;
  private String name;
  private String description;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
