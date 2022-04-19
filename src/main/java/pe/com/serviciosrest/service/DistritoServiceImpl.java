package pe.com.serviciosrest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.serviciosrest.entity.Distrito;
import pe.com.serviciosrest.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{

    @Autowired
    private DistritoRepository distritoRepository;
    
    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Integer n) {
        return distritoRepository.findById(n);
    }

    @Override
    public List<Distrito> findByName(String name) {
        return distritoRepository.findByName(name);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritoRepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objdistrito=distritoRepository.getById(d.getId());
        BeanUtils.copyProperties(d, objdistrito);
        return distritoRepository.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objdistrito=distritoRepository.getById(d.getId());
        objdistrito.setEstado(false);
        return distritoRepository.save(objdistrito);
    }
}
