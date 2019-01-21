package cl.accenture.proyecto.services;

import cl.accenture.proyecto.model.Usuario;
import cl.accenture.proyecto.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public void guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public boolean existeUser(Integer idUser){
        return usuarioRepository.existsById(idUser);
    }
    public List<Usuario> validarYentrar(String nombre, String password){
        return usuarioRepository.nombreYpassword(nombre,password);
    }
    public Usuario obtenerUsuario(Integer idUser){
        return usuarioRepository.encontrar(idUser);
    }

}
