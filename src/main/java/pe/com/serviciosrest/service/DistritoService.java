package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Distrito;

public interface DistritoService {
    
    List<Distrito> findAll();
    Optional<Distrito> findById(Integer n);
    List<Distrito> findByName(String name);
    Distrito add(Distrito d);
    Distrito update(Distrito d);
    Distrito delete(Distrito d);
}
