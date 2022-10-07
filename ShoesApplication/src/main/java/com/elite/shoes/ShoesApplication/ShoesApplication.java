package com.elite.shoes.ShoesApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoesApplication.class, args);
/*
		Empresa unicaEmpresa = new Empresa("EliteShoes", "Carrera 11 calle 9","3212223344",
				223344);

		Empleado empleado1 = new Empleado(9386676, "Carlos", "carll@gmail.com",
				"Compensar","cajero",unicaEmpresa);

		Empleado empleado2 = new Empleado(222322, "Camilo", "cami@gmail.com",
				"Cafam","cajero", unicaEmpresa);



		MovimientoDinero compra1 = new MovimientoDinero("01-01-2022",  empleado2, "Camilo",
														100000.0, "egreso");


		MovimientoDinero compra2 = new MovimientoDinero("01-01-2022",  empleado2, "Camilo",
														800000.0, "egreso");
		MovimientoDinero compra3 = new MovimientoDinero("01-02-2022",  empleado2, "Carlos",
														800000.0, "ingreso");


		List<Empleado> listaEmpleados = new ArrayList<>();
		List<Empresa> listaEmpresas = new ArrayList<>();
		List<MovimientoDinero> listaMovimientos = new ArrayList<>();
		
		

		listaEmpleados.add (empleado1);
		listaEmpleados.add (empleado2);
		
		listaEmpresas.add (unicaEmpresa);
		
		listaMovimientos.add (compra1);
		listaMovimientos.add (compra2);
		listaMovimientos.add (compra3);



		for (int i = 0; i < listaMovimientos.size(); i++){
			System.out.println(listaMovimientos.get(i).toString());
		}

		Object retorno[] = Resultados(listaMovimientos);
		System.out.println("El monto acutual es "+ retorno [0]);
	}
*/
	}
}
