package com.dwa.foro.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.foro.modelo.Replica;

@Service
public class ServicioReplica {
	
	@Autowired
	private RepoReplicas repoReplica;
	
	private String Mensaje;
	
	public String getMensaje() {
		return Mensaje;
	}
	
	public void setMensaje(String mensaje)
	{
		Mensaje = mensaje;
	}
	
	public boolean agregar(Replica replica) {
		try {
			repoReplica.save(replica);
			this.Mensaje = "Réplica registrada con éxito.";
			return true;
		} catch (Exception e) {
			this.Mensaje = "Error al registrar la réplica.";
			return false;
		}
	}
	
	public Iterable<Replica> filtrarPorTema(int idTema){
		try {
			this.Mensaje = "";
			return repoReplica.filtrarPorTema(idTema);
		} catch (Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}
	
	public Replica buscar(int id) {
		try {
			this.Mensaje = "";
			Replica replica = repoReplica.findById(id).get();
			return replica == null ? new Replica() : replica;
		} catch (Exception e) {
			this.Mensaje = e.getMessage();
			return null;
		}
	}
}
