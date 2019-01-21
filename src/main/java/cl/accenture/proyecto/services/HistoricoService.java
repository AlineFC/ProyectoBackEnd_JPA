package cl.accenture.proyecto.services;


import cl.accenture.proyecto.model.Historico;
import cl.accenture.proyecto.repositorio.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService {

    private HistoricoRepository historicoRepository;

    @Autowired

    public HistoricoService(HistoricoRepository historicoRepository) {
        this.historicoRepository = historicoRepository;
    }
    public Iterable<Historico> contarTodosProyectos(){
        return historicoRepository.findAll();
    }

    public long contarProyectos(){
        return historicoRepository.count();
    }
}
