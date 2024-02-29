package com.example.RestApiMySQLSpringBoot.Repository;

import com.example.RestApiMySQLSpringBoot.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*El CrudRepository nos permite inicializar las peticiones CRUD*/
@Repository
public interface PersonaRepo extends CrudRepository<Persona, Integer> {
}
