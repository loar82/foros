package com.dwa.foro.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.foro.modelo.Usuario;

public interface RepoUsuario extends CrudRepository<Usuario, Integer> {
	@Query(value = "SELECT * FROM usuario WHERE correoe = ?1 AND claveacceso = ?2 ", nativeQuery = true)
	Usuario validar(String correoe, byte[] claveacceso);

}
