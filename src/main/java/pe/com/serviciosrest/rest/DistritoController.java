package pe.com.serviciosrest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.serviciosrest.entity.Distrito;
import pe.com.serviciosrest.rest.request.DistritoRequest;
import pe.com.serviciosrest.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    
    @Autowired
    private DistritoService distritoService;
    
    @GetMapping
    public List<Distrito> findAll(){
        return distritoService.findAll();
    }
    
    @PostMapping
    public Distrito add(@RequestBody Distrito d){
        return distritoService.add(d);
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Integer id){
        return distritoService.findById(id);
    }
    
    @GetMapping("by-name")
    public List<Distrito> findByName(@RequestBody DistritoRequest distritoRequest){
        return distritoService.findByName(distritoRequest.getNombre());
    }
    
    @PutMapping("/{id}")
    public Distrito update(@PathVariable Integer id,@RequestBody Distrito d){
        d.setId(id);
        return distritoService.update(d);
    }
    
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable Integer id){
        Distrito objdistrito=new Distrito();
        objdistrito.setId(id);
        return distritoService.delete(Distrito.builder().id(id).build());
    }
    
}
