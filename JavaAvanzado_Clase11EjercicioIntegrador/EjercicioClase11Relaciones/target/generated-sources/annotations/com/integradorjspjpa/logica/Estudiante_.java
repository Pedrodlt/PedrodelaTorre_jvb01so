package com.integradorjspjpa.logica;

import com.integradorjspjpa.logica.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-11-22T18:25:02")
@StaticMetamodel(Estudiante.class)
public class Estudiante_ { 

    public static volatile ListAttribute<Estudiante, Curso> cursos;
    public static volatile SingularAttribute<Estudiante, Long> id;
    public static volatile SingularAttribute<Estudiante, String> nombre;

}