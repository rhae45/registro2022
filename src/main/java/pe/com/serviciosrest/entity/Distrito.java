package pe.com.serviciosrest.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Distrito")
@Table(name = "t_distrito")
public class Distrito implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "coddis")
    private Integer id;
    
    @Column(name = "nomdis")
    private String nombre;
    
    @Column(name = "estdis")
    private Boolean estado;

    public Distrito() {
    }

    public Distrito(Integer id, String nombre, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
