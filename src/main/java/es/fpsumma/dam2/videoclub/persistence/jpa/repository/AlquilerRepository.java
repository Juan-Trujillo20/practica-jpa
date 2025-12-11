package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.AlquilerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlquilerRepository extends JpaRepository<AlquilerEntity, Long> {
    // Obtener los alquileres de un cliente usando su email

      List<AlquilerEntity> findByAlquiler_ClienteEmail(String email);
}
