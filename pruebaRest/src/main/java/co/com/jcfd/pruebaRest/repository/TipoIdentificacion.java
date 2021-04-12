package co.com.jcfd.pruebaRest.repository;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity(name = "TIPO_IDENTIFICACION")
@RestResource(rel = "tipo_identificacion", path = "tipo_identificacion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TipoIdentificacion extends GenericEntity {

}
