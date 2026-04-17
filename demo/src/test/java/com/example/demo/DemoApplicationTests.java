package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest

public class DemoApplicationTests {

	public static void main(String[] args) {

	EntidadBase e1 = new Client("Empresa Acme", "symoncs13@gmail.com", "tecnologia");
	EntidadBase e2 = new Contacto("Ana Gomez", "anaAcme@gmail.com", "CTO", (Client) e1);

	List<EntidadBase> entidades = new ArrayList<>();
	entidades.add(e1);
	entidades.add(e2);


	List<Exportable> exportables = new ArrayList<>();
	exportables.add(new Client("Acme", "acme@mail.com", "tech"));

	for (Exportable e : exportables) {
		System.out.println(e.exportarCsv());
	}



	}
}

