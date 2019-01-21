package cl.accenture.proyecto.repositorio;

import cl.accenture.proyecto.model.Historico;
import org.springframework.data.repository.CrudRepository;

public interface HistoricoRepository extends CrudRepository<Historico, Integer> {

    @Override
    long count();
}
