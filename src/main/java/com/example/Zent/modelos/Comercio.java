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
@Table(name = "comercios")

public class Comercio {
    // adicionar 5 campos considerados importantes
    //id,nit,nombre,actividad,contacto(correo)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nit;
    private String nombre;
    private String actividad;
    private String contacto;
    private String direccion;
    private String ciudad;
    private LocalDate fechaRegistro;
    private Boolean estado;
    private String regimenTributario;

    @OneToMany(mappedBy = "comercio", fetch = FetchType.LAZY)
    private List<Gasto> gastos;


    public Comercio() {
    
    }


    public Comercio(int id, String nit, String nombre, String actividad, String contacto, String direccion,
            String ciudad, LocalDate fechaRegistro, Boolean estado, String regimenTributario) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.actividad = actividad;
        this.contacto = contacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.regimenTributario = regimenTributario;
    }


    public int getId() {
        return id;
    }


    public String getNit() {
        return nit;
    }


    public String getNombre() {
        return nombre;
    }


    public String getActividad() {
        return actividad;
    }


    public String getContacto() {
        return contacto;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getCiudad() {
        return ciudad;
    }


    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }


    public Boolean getEstado() {
        return estado;
    }


    public String getRegimenTributario() {
        return regimenTributario;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setNit(String nit) {
        this.nit = nit;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setActividad(String actividad) {
        this.actividad = actividad;
    }


    public void setContacto(String contacto) {
        this.contacto = contacto;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public void setRegimenTributario(String regimenTributario) {
        this.regimenTributario = regimenTributario;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    

}
