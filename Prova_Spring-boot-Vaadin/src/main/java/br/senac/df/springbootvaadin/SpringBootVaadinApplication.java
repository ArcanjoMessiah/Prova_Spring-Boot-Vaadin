package br.senac.df.springbootvaadin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.senac.df.springbootvaadin.dao.AlunoRepositorio;
import br.senac.df.springbootvaadin.model.Aluno;

@SpringBootApplication
public class SpringBootVaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaadinApplication.class, args);
	}
	@Bean
    public CommandLineRunner loadData(AlunoRepositorio repository) {
        return (args) -> {
            // Add some data to database
            repository.save(new Aluno(1,"Douglas", "de Freitas", "dddoug@gmail.com",38));
           
            
        };
    }

}
