package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false,length = 100)
    private String nombre;

    @Column(name="email", nullable = false, length = 150)
    private String email;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
