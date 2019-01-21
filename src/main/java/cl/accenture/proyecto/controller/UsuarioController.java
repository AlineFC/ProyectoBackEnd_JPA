package cl.accenture.proyecto.controller;
import cl.accenture.proyecto.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}

