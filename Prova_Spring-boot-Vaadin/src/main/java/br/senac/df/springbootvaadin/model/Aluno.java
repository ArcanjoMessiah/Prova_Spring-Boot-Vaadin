package br.senac.df.springbootvaadin.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Component
@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private Integer idade;

	public Aluno() {
	}

	

	public Aluno(Integer id, String nome, String sobrenome, String email, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.idade = idade;
	}


	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", idade="
				+ idade + "]";
	}

	
		

}
