package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="alquiler")
public class AlquilerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name="pelicula:id")
    private PeliculaEntity pelicula;

    @Column(name="fecha_alquiler")
    private LocalDate fechaAlquiler;

    @Column(name="fecha_devolucion")
    private LocalDate fechaDevolucion;

    public AlquilerEntity() {
    }

    public AlquilerEntity(Long id, ClienteEntity cliente, PeliculaEntity pelicula, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.id = id;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public PeliculaEntity getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaEntity pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
