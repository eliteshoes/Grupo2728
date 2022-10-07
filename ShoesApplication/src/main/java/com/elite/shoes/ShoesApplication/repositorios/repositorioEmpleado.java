package com.elite.shoes.ShoesApplication.repositorios;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpleado extends JpaRepository<Empleado, Long> {
}
