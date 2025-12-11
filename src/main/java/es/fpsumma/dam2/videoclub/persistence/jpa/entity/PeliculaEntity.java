package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pelicula")
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="titulo", nullable = false, length = 200)
    private String titulo;

    @Column(name="genero", nullable = false, length = 50)
    private String genero;

    @Column(name="anio_estreno")
    private int anio_estreno;

    @Column(name="puntuacion", precision = 3, scale = 1)
    private Double puntuacion;

    @ManyToOne
    @JoinColumn(name="director_id")
    private DirectorEntity director;

    @ManyToMany
    @JoinTable(
            name="pelicula_actor",
            joinColumns = @JoinColumn(name="pelicula_id"),
            inverseJoinColumns = @JoinColumn(name="actor_id")
    )
    private List<ActorEntity> actores = new ArrayList<>();

    public PeliculaEntity() {
    }

    public PeliculaEntity(Long id, String titulo, String genero, int anio_estreno, Double puntuacion, DirectorEntity director, List<ActorEntity> actores) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio_estreno = anio_estreno;
        this.puntuacion = puntuacion;
        this.director = director;
        this.actores = actores;
    }

    public List<ActorEntity> getActores() {
        return actores;
    }

    public void setActores(List<ActorEntity> actores) {
        this.actores = actores;
    }

    public DirectorEntity getDirector() {
        return director;
    }

    public void setDirector(DirectorEntity director) {
        this.director = director;
    }

    public Double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
