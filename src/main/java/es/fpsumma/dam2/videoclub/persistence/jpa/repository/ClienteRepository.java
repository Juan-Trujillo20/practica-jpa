package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    //Buscar un cliente por email.
    List<ClienteEntity> findClienteByEmail(String email);


    //Comprobar si existe ya un cliente registrado con un determinado email (útil para evitar duplicados).
    boolean existsByEmail(String email);


   // Paginación: obtener la lista de clientes de forma paginada (por ejemplo, para mostrar “página de clientes” en una futura API).
}
