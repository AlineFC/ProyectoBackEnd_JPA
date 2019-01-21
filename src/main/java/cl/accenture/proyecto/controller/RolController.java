package cl.accenture.proyecto.controller;


import cl.accenture.proyecto.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administradores")
public class RolController {

    private RolService rolService;

    @Autowired
    public RolController(RolService rolService){
        this.rolService=rolService;
    }

}
