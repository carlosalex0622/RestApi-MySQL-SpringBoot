package com.example.RestApiMySQLSpringBoot.Controller;

import com.example.RestApiMySQLSpringBoot.Entity.Persona;
import com.example.RestApiMySQLSpringBoot.Service.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class PersonaController
{
    @Autowired
    private PSIMPL psimpl;

    @GetMapping
    @RequestMapping(value="ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas() {
        List<Persona> personaList = this.psimpl.ConsultarPersonas();
        return ResponseEntity.ok(personaList);
    }
    @PostMapping("CrearPersona")
    public ResponseEntity<?> CrearPersona(@RequestBody Persona persona){
        Persona personaCrear = this.psimpl.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCrear);
    }
    @PutMapping
    @RequestMapping(value = "ModificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersona(@RequestBody Persona persona){
        Persona personaModificada = this.psimpl.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.psimpl.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        try{
            Persona persona = this.psimpl.BuscarPersona(id);
            if(persona != null) {
                return ResponseEntity.ok(persona);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
