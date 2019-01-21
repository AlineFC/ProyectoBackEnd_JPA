package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    List<Usuario> encontrarIdUser(Integer idUser);
    Usuario encontrar(Integer idUser);
    List<Usuario> nombreYpassword(String rut, String password);

}
