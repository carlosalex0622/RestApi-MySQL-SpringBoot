package com.example.RestApiMySQLSpringBoot.Service;

import com.example.RestApiMySQLSpringBoot.Entity.Persona;

import java.util.List;

/*Vamos a crear los métodos para realizar las peticiones en el CRUD*/
public interface PersonaService
{
    //Obtiene todos los datos de la tabla (GET)
    public List<Persona> ConsultarPersonas();
    //Aquí realizamos la creación de los datos (POST)
    public Persona CrearPersona(Persona persona);
    // Aquí realizamos la actualización de los datos (PUT)
    public Persona modificarPersona(Persona persona);
    // Aquí realizamos la busqueda de datos del usuarios por el ID
    public Persona BuscarPersona(int id);
    // Aquí realizamos la eliminación de la persona por su ID
    public void EliminarPersona(int id);

}
