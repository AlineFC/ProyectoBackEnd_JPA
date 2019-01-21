package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Proyecto;
import org.springframework.data.repository.CrudRepository;

public interface ProyectoRepository extends CrudRepository<Proyecto, Integer> {
    @Override
    long count();
}
