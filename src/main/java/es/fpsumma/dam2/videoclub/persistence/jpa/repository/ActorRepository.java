package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
    //Buscar un actor por nombre
    List<ActorEntity> findActorbyNombre(String nombre);

    //Obtener todos los actores que han participado en una película cuyo título se pasa como parámetro (podéis hacerlo con método derivado o con @Query)
    List<ActorEntity> obternerActoresMismaPelicula(String titulo);

    //Ordenación: obtener actores ordenados alfabéticamente por nombre.
}
