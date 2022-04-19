package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.serviciosrest.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import pe.com.serviciosrest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Integer n) {
        return clienteRepository.findById(n);
    }

    @Override
    public List<Cliente> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente add(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objcliente=clienteRepository.getById(c.getId());
        BeanUtils.copyProperties(c, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente c) {
        Cliente objcliente=clienteRepository.getById(c.getId());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }
    
}
