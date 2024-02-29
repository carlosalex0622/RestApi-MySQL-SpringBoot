package com.example.RestApiMySQLSpringBoot.Service;


import com.example.RestApiMySQLSpringBoot.Entity.Persona;
import com.example.RestApiMySQLSpringBoot.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PSIMPL implements PersonaService
{
    @Autowired
    private PersonaRepo repo;

    /*Este código nos ayuda a traer todos los datos que estén insertados en la base de datos*/
    @Override
    public List<Persona> ConsultarPersonas(){
        return (List<Persona>) this.repo.findAll();
    }
    /*Este código nos permite crear los datos que vamos a insertar a la BDD*/
    @Override
    public Persona CrearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }
    /*Este código nos permite actualizar los datos de la BDD*/
    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }
    /*Este código nos permite buscar un ID en especifico*/
    @Override
    public Persona BuscarPersona(int id){
        return this.repo.findById(id).get();
    }
    /*Este código nos ayuda a eliminar un dato mediante el ID*/
    @Override
    public void EliminarPersona(int id)
    {
     this.repo.deleteById(id);
    }
}
