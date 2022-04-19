package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciosrest.entity.Cliente;

public interface ClienteService {
    
    List<Cliente> findAll();
    Optional<Cliente> findById(Integer n);
    List<Cliente> findByName(String name);
    Cliente add(Cliente c);
    Cliente update(Cliente c);
    Cliente delete(Cliente c);
    
}
