package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.ActorEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
public class ActorRepositoryTest {

    @Autowired ActorRepository actorRepository;

    @Test
    void encoontarActorPorNombre(){
        List<ActorEntity> actor = actorRepository.findActorbyNombre("Joaquin Phoenix");
        //assertThat(actor).
    }

    @Test
    void obtenerActoresMismaPelicula(){

    }
}
