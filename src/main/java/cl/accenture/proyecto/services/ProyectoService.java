package cl.accenture.proyecto.services;


import cl.accenture.proyecto.model.Proyecto;
import cl.accenture.proyecto.repositorio.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private ProyectoRepository proyectoRepository;

    @Autowired

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> findAll(){
        return ProyectoRepository.findAll();
    }

    public Proyecto contarProyectosId(Integer idProyecto){
        return ProyectoRepository.findById(idProyecto).get();
    }


    public long contarProyectos(){
        return proyectoRepository.count();
    }

}
