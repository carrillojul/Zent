package com.example.Zent.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;


@Entity
@Table(name = "categorias")

public class Categoria {
    
    // adicionar 5 campos considerados importantes
    //id, nombre, fechaCreacion, responsable, justificacion

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String responsable;
    private String justificacion;
    private String Descripcion;
    private Boolean estado;
    private Integer prioridad;
    private LocalDate fechaDeModificacion;
    private String codigo;
    
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Gasto> gastos;
    
    
    // constructor


    public Categoria() {

    }


    public Categoria(Integer id, String nombre, LocalDate fechaCreacion, String responsable, String justificacion,
            String descripcion, Boolean estado, Integer prioridad, LocalDate fechaDeModificacion, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.responsable = responsable;
        this.justificacion = justificacion;
        Descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaDeModificacion = fechaDeModificacion;
        this.codigo = codigo;
    }
    
    // getters y setters
    
    public Integer getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }


    public String getResponsable() {
        return responsable;
    }


    public String getJustificacion() {
        return justificacion;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public Boolean getEstado() {
        return estado;
    }


    public Integer getPrioridad() {
        return prioridad;
    }


    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }


    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }


    public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    
    
    
    
    

    

}
