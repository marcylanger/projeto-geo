package br.edu.utfpr.solution_geo.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.solution_geo.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	/*
	 * 
	 */
	Usuario findByEmailIgnoreCase(String email);
	
	/**
	 *
	 */
	Optional<Usuario> findByPasswordResetToken( String token );
	
	/**
	 *
	 */
	Optional<Usuario> findByAccountActivateToken( String token );
	
}
