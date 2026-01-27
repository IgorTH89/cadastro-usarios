package com.igorth.cadastro_usario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorth.cadastro_usario.infrastructure.entitys.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
