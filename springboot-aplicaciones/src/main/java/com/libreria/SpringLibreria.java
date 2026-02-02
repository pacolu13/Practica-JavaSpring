package com.libreria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.libreria.entity.Articulo;
import com.libreria.repositories.RepoArticulo;

@SpringBootApplication
public class SpringLibreria implements CommandLineRunner {

	@Autowired
	private RepoArticulo repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SpringLibreria.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion iniciada correctamente");
		List<Articulo> articulos = repositorio.findAll();
		articulos.stream().forEach(articulo -> System.out.println(articulo));
	}
}
