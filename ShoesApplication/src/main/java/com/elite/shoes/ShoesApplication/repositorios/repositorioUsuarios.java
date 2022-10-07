package com.elite.shoes.ShoesApplication.repositorios;

import com.elite.shoes.ShoesApplication.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioUsuarios extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
