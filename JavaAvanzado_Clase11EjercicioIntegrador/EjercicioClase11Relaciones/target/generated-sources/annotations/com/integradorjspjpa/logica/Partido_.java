package com.integradorjspjpa.logica;

import com.integradorjspjpa.logica.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-11-22T21:54:15")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, String> fecha;
    public static volatile SingularAttribute<Partido, Equipo> equipoLocal;
    public static volatile SingularAttribute<Partido, Equipo> equipoVisitante;
    public static volatile SingularAttribute<Partido, String> resultado_local;
    public static volatile SingularAttribute<Partido, String> resultado_visitante;
    public static volatile SingularAttribute<Partido, Long> id;

}