package pe.com.serviciosrest.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor sin parametros
@Data //metodos get y set
@Entity(name = "Producto")
@Table(name = "t_producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "codpro")
    private long codigo;
    
    @Column(name = "nompro")
    private String nombre;
    
    @Column(name = "precpro")
    private double preciocompra;
    
    @Column(name = "prevpro")
    private double precioventa;
    
    @Column(name = "canpro")
    private int cantidad;
    
    @Column(name = "estpro")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "codcat",nullable = false)
    private Categoria categoria;
    
}
