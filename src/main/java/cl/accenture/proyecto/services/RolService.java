package cl.accenture.proyecto.services;

import cl.accenture.proyecto.repositorio.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    private RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository){
        this.rolRepository=rolRepository;
    }


}
