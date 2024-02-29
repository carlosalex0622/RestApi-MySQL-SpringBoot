package com.example.RestApiMySQLSpringBoot.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Columns;

@Data
@Entity
/*Esta anotación nos permite referenciar el programa a la tabla de la BD*/
@Table(name="Humano")
public class Persona
{
    @Id
    /*EEsta línea nos dice que la llave primaria de la entidad será generada por la base de datos utilizando una columna id*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*Esta anotación nos ayuda  a seleccionar4 las columnas d ela tabla, para signar el valor que debe recibir*/
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email")
    private String email;

    @Column(name="edad")
    private int edad;

    @Column(name="sexo")
    private String sexo;

    @Column(name="clave")
    private int clave;

}
