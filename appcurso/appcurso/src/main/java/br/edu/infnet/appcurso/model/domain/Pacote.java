package br.edu.infnet.appcurso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Pacote {
	private String descricao;
	private boolean mobile;
	private LocalDateTime data;
	private Cliente cliente;
	private List<Curso> cursos;
	
	
	public Pacote() {
		data= LocalDateTime.now();
	}

	
	@Override
	public String toString() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s" , 
				descricao, 
				mobile ? " Pode ser acessado por dispositivo moblie" : " Nao pode ser acessado por dispositivo moblie ", 
				data.format(formato) 
				);	
	}
	
	

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean isMobile() {
		return mobile;
	}


	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public LocalDateTime getData() {
		return data;
	}
	
}
