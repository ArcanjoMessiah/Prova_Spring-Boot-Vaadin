package br.senac.df.springbootvaadin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.df.springbootvaadin.model.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

}
