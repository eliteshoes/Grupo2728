package com.elite.shoes.ShoesApplication.repositorios;

import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioMovimientoDinero extends JpaRepository <MovimientoDinero, Long> {
}

