package br.edu.infnet.appcurso.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appcurso.model.domain.Agile;
import br.edu.infnet.appcurso.model.domain.BancoDeDados;
import br.edu.infnet.appcurso.model.domain.Cliente;
import br.edu.infnet.appcurso.model.domain.Curso;
import br.edu.infnet.appcurso.model.domain.Pacote;
import br.edu.infnet.appcurso.model.exceptions.DadosPessoaisNaoPreenchidosException;
import br.edu.infnet.appcurso.model.exceptions.DuracaoInvalidaException;
import br.edu.infnet.appcurso.model.exceptions.ValorZeradoException;

public class PacoteTeste {

	public static void main(String[] args) {
		
		List<Curso> cursoP1 = new ArrayList<Curso>();
		List<Curso> cursoP2 = new ArrayList<Curso>();
		List<Curso> cursoP3 = new ArrayList<Curso>();
		List<Curso> cursoP4 = new ArrayList<Curso>();
		List<Curso> cursoP5 = new ArrayList<Curso>();
		List<Curso> cursoP6 = new ArrayList<Curso>();
		List<Curso> cursoP7 = new ArrayList<Curso>();
		
		try {
			BancoDeDados b1 = new BancoDeDados("SQL", 800, 1, "Banco de dados", true, true);
			cursoP1.add(b1);
			cursoP2.add(b1);
			cursoP3.add(b1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b2 = new BancoDeDados("NoSQL", 800, 2, "Banco de dados", false, false);
			cursoP2.add(b2);
			cursoP3.add(b2);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Agile a1  = new Agile("Kanbam", 500, 3, "metodologia Aigl", 3 , false);
			cursoP3.add(a1);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		} catch (DuracaoInvalidaException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			BancoDeDados b4 = new BancoDeDados("NoSQL", -800, 2, "Banco de dados", false, false);
			cursoP4.add(b4);
			cursoP5.add(b4);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b5 = new BancoDeDados("JSON", 0, 3, "Banco de dados", true , false);
			cursoP5.add(b5);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			BancoDeDados b6 = new BancoDeDados("NoSQL", 800, 2, "Banco de dados", false, false);
			cursoP7.add(b6);
			cursoP6.add(b6);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			BancoDeDados b7 = new BancoDeDados("JSON", 900, 3, "Banco de dados", true , false);
			cursoP6.add(b7);
			cursoP7.add(b7);
		} catch (ValorZeradoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		

				
		try {
			Pacote p1 = new Pacote();
			p1.setDescricao("Curso basico");
			p1.setCliente(new Cliente("Zezinho", "123456789-00", 18));
			p1.setMobile(false);
			p1.setCursos(cursoP1);
			p1.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
				
		try {
			Pacote p2 = new Pacote();
			p2.setDescricao("Curso intermediario");
			p2.setCliente(new Cliente("Huguinho", "123456789-00", 21));
			p2.setMobile(true);
			p2.setCursos(cursoP2);
			p2.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Pacote p3 = new Pacote();
			p3.setDescricao("Curso avancado");
			p3.setCliente(new Cliente("luizinho", "123456789-00", 21));
			p3.setMobile(true);
			p3.setCursos(cursoP3);
			p3.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		try {
			Pacote p4 = new Pacote();
			p4.setDescricao("Curso intermediario");
			p4.setCliente(new Cliente("felipinho", "123456789-00", 28));
			p4.setMobile(true);
			p4.setCursos(cursoP4);
			p4.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Pacote p5 = new Pacote();
			p5.setDescricao("Curso avancado");
			p5.setCliente(new Cliente("joaozinho", "123456789-00", 30));
			p5.setMobile(true);
			p5.setCursos(cursoP5);
			p5.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		
		try {
			Pacote p6 = new Pacote();
			p6.setDescricao("Curso intermediario");
			p6.setCliente(new Cliente("pedrino", null, 28));
			p6.setMobile(true);
			p6.setCursos(cursoP6);
			p6.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		
		try {
			Pacote p7 = new Pacote();
			p7.setDescricao("Curso avancado");
			p7.setCliente(new Cliente(null, "123456789-00", 30));
			p7.setMobile(true);
			p7.setCursos(cursoP7);
			p7.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

		try {
			Pacote p8 = new Pacote();
			p8.setDescricao("Curso avancado");
			p8.setCliente(new Cliente("mariazinha", "123456789-00", 15));
			p8.setMobile(true);
			p8.setCursos(cursoP7);
			p8.imprimir();
		} catch (DadosPessoaisNaoPreenchidosException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
	}
}

