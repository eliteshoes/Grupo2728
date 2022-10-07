package com.elite.shoes.ShoesApplication.repositorios;

import com.elite.shoes.ShoesApplication.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpresa extends JpaRepository <Empresa, Long> {
}
