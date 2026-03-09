package com.example.Zent.modelos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "gastos")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion", nullable = false, unique = false, length = 255)
    private String descripcion;
    @Column(name = "fecha_registro", nullable = false, unique = false)
    private LocalDate fechaRegistro;
    @Column(name = "valor", nullable = false, unique = false, precision = 10, scale = 2)
    private Double valor;
    @Column(name = "imagen", nullable = true, unique = false, length = 255)
    private String imagen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_categoria", referencedColumnName = "id")
    private Categoria categoria;

    @Column(name = "establecimiento", nullable = true, unique = false, length = 255)
    private String establecimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_medio_pago", referencedColumnName = "id")
    private MedioDePago medioPago;

    @Column(name = "notas", nullable = true, unique = false, length = 255)
    private String notas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_comercio", referencedColumnName = "id")
    private Comercio comercio;

    //creando una relacion con el modelo de usuario
    //yo como gasto me relaciono con un usuario, es decir, un gasto pertenece a un usuario

    public Gasto() {
    }

    public Gasto(Integer id, String descripcion, LocalDate fechaRegistro, Double valor, String imagen, String establecimiento, String notas) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.valor = valor;
        this.imagen = imagen;
        this.establecimiento = establecimiento;
        this.notas = notas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public MedioDePago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioDePago medioPago) {
        this.medioPago = medioPago;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
