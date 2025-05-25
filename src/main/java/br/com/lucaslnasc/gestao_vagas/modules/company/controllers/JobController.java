package br.com.lucaslnasc.gestao_vagas.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucaslnasc.gestao_vagas.modules.company.entities.JobEntity;
import br.com.lucaslnasc.gestao_vagas.modules.company.repositories.JobRepository;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/job")
public class JobController {

  @Autowired
  private final JobRepository jobRepository;

  JobController(JobRepository jobRepository) {
    this.jobRepository = jobRepository;
  }

  // @PostMapping("/")
  @PostMapping("/")
  public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
    return this.jobRepository.save(jobEntity);
  }

}
