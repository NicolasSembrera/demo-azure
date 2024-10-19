package pe.edu.cibertec.demo_azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {

    @GetMapping("/")
    public String obtenerVehiculos(Model model){

        List<String> listaVehiculo = new ArrayList<String>();

        listaVehiculo.add("Toyota");
        listaVehiculo.add("Nissan");
        listaVehiculo.add("Ferrari");
        listaVehiculo.add("Tesla");
        listaVehiculo.add("Honda");

        model.addAttribute("lista", listaVehiculo);

        return "index";
    }

}
