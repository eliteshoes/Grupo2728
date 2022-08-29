package com.elite.shoes;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class ShoesApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ShoesApplication.class, args);

		MovimientoDinero movientoDinero1 = new MovimientoDinero("Maurio Tobar",12000000F,0.25F,1,"contado");

		movientoDinero1.calculoMonto();
		movientoDinero1.setMonto(15000000F);

		Empresa empresa1 = new Empresa("Nike","Calle 127 # 100 - 50","31012345",830006835l,null);

		Empresa empresa2 = new Empresa("EliteShoes","Carrera 7 # 93 - 10","3226789",253806835l,movientoDinero1);

		Empleado empleado1 = new Empleado(80820803L, "Carlos", "carlrojasprieto@gmail.com", "Nike", "Administrador", empresa1);

		Empleado empleado2 = new Empleado(1032468664L, "Camilo", "camilorojasprieto@gmail.com", "EliteShoes", "Operativo", empresa2);

		List<Empleado> ListaEmpleados = new ArrayList<>();
		List<Empresa> ListaEmpresas = new ArrayList<>();

		ListaEmpleados.add(empleado1);
		ListaEmpleados.add(empleado2);

		ListaEmpresas.add(empresa1);
		ListaEmpresas.add(empresa2);

		System.out.println("Empleados");

		for (int i = 0; i < ListaEmpleados.size(); i++ ){
			System.out.println(ListaEmpleados.get(i).toString());
		}

		System.out.println("Empresas de Zapatos");

		for (int i = 0; i < ListaEmpresas.size(); i++ ){
			System.out.println(ListaEmpresas.get(i).toString());

		}

	}

}

