package com.dwa.foro.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.foro.modelo.Replica;

public interface RepoReplicas extends CrudRepository<Replica, Integer> {
	@Query(value = "SELECT * FROM replica WHERE idtema = ?1", nativeQuery = true)
	ArrayList<Replica> filtrarPorTema(int idtema);

}
