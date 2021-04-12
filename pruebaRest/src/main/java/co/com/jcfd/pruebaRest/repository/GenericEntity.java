/*
 * Clase: GenericEntity
 * Fecha Creación: 09/04/2021 07:30:00PM
 * Creado por: Julio Cesar Ferreira
 * Descripción: Clase que representa la entidad generica de la cual extenderan las clases Estado y TipoIdentificacion
 */

package co.com.jcfd.pruebaRest.repository;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public abstract class GenericEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sequenciaGenerica") 
	@SequenceGenerator(name="sequenciaGenerica",sequenceName="SEQ_GENERICA", allocationSize=1)
	private long codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha_creacion")
	private Instant fechaCreacion;
	
	@Column(name = "usuario_creacion")
	private String usuarioCreacion;
	
	@Column(name = "fecha_modificacion")
	private Instant fechaModificacion;
	
	@Column(name = "usuario_modificacion")
	private String usuarioModificacion;
	

	public GenericEntity() {
		super();
	}
	

	public GenericEntity(long codigo, String nombre, Instant fechaCreacion, String usuarioCreacion,
			Instant fechaModificacion, String usuarioModificacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
	}



	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the usuarioCreacion
	 */
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	/**
	 * @param usuarioCreacion the usuarioCreacion to set
	 */
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Instant getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Instant fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the usuarioModificacion
	 */
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	/**
	 * @param usuarioModificacion the usuarioModificacion to set
	 */
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	

	@Override
	public String toString() {
		return "EntidadGenerica [codigo=" + codigo + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion
				+ ", usuarioCreacion=" + usuarioCreacion + ", fechaModificacion=" + fechaModificacion
				+ ", usuarioModificacion=" + usuarioModificacion + "]";
	}
	

}
