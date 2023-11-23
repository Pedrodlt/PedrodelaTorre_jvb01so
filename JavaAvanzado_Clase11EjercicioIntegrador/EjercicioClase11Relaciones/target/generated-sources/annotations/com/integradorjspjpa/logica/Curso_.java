package com.integradorjspjpa.logica;

import com.integradorjspjpa.logica.Estudiante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-11-22T18:25:02")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Long> id;
    public static volatile ListAttribute<Curso, Estudiante> estudiantes;
    public static volatile SingularAttribute<Curso, String> nombre;

}