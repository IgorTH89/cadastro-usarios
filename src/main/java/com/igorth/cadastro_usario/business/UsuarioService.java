package com.igorth.cadastro_usario.business;

import org.springframework.stereotype.Service;

import com.igorth.cadastro_usario.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

}
