package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    List<Persona> encontrarPornombre(String nombre);
    Persona encontrar(Integer idPersona);
    Persona ecnontrarMail(String email);
}
