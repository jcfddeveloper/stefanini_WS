package co.com.jcfd.pruebaRest.repository;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity(name = "ESTADO")
@RestResource(rel = "estado", path = "estado")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Estado extends GenericEntity {
	
}
