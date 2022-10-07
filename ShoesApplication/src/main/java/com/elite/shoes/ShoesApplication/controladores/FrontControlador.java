package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;
import com.elite.shoes.ShoesApplication.entidades.Usuario;
import com.elite.shoes.ShoesApplication.servicios.ServiciosMovimientoDinero;
import com.elite.shoes.ShoesApplication.servicios.ServiciosUsuario;
import com.elite.shoes.ShoesApplication.servicios.serviciosEmpleados;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class FrontControlador {
    //Crea elementos de tipo string para visualizar las etiquetas HTML creadas

    serviciosEmpleados services;
    ServiciosUsuario servicesUs;
    ServiciosMovimientoDinero servicesMov;

    public FrontControlador(serviciosEmpleados services, ServiciosMovimientoDinero servicesMov, ServiciosUsuario servicesUs){
        this.services = services;
        this.servicesMov = servicesMov;
        this.servicesUs = servicesUs;
    }


/*
    public FrontControlador(ServiciosMovimientoDinero servicesMov){
        this.servicesMov = servicesMov;
    }

 */

    @GetMapping("/") //ruta raiz
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null) {
            //System.out.println(principal.getClaims());
            Usuario usuario = this.servicesUs.getCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);
        }
        return "index";
    }
/*
    @GetMapping("/") //ruta raiz
    public String index(){
        return "index";
    }

 */

    @GetMapping("/empleado")
    public String Empleado(Model modelEmp){
    List<Empleado> empleados = this.services.getListaEmpleados();
    modelEmp.addAttribute("empleados", empleados);
        return "Empleado";
    }
    @GetMapping("/empleado/nuevo")
    public String nuevoEmpleado(Model model){
        model.addAttribute("empleado",new Empleado());
        return "nuevo-empleado";
    }

    @GetMapping("/verMovimiento")
    public String Movimiento(Model modelMov){
        List<MovimientoDinero> movimientos = this.servicesMov.getListaMovimientos();
        modelMov.addAttribute("movimientos", movimientos);
        return "Movimiento";
    }
    @GetMapping("/empleado/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado empleadoFind = this.services.getLlamarEmpleado(id);
        model.addAttribute("empleadoFind", empleadoFind);
        return "acualizar-empleado";
    }

    //Aqui hago uso de los servicios Usuario


}
