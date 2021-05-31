package com.dwa.foro.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.foro.modelo.Tema;

@Service
public class ServicioTema {
	
	@Autowired
	private RepoTemas repoTema;
	
	private String Mensaje;
	
	public String getMensaje() {
		return Mensaje;		
	}
	
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean agregar(Tema tema) {
		try {
			repoTema.save(tema);
			this.Mensaje = "Tema registrado con éxito.";
			return true;
			
		} catch (Exception e) {
			this.Mensaje = "Error al registrar el tema.";
			return false;
		}
	}
	
	public Iterable<Tema> verTodos(){
		try {
			this.Mensaje="";
			return repoTema.findAll();
		} catch (Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}
	
	public Tema buscar(int id) {
		try {
			this.Mensaje="";
			Tema tema = repoTema.findById(id).get();
			return tema == null ? new Tema() : tema;
		} catch (Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}

}
