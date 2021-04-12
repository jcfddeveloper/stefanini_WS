/*
 * Clase: PersonaEntity
 * Fecha Creación: 09/04/2021 07:30:00PM
 * Creado por: Julio Cesar Ferreira
 * Descripción: Clase que representa la entidad Persona
 */

package co.com.jcfd.pruebaRest.repository;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity(name = "PERSONA")
@RestResource(exported=false)
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sequenciaPersona") 
	@SequenceGenerator(name="sequenciaPersona",sequenceName="SEQ_PERSONA_ID", allocationSize=1)
	private Long codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "fecha_nacimiento")
	private Instant fechaNacimiento;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "identificacion")
	private long identificacion;
	
	@ManyToOne()
    @JoinColumn(name = "codigo_estado")
    private Estado estado;
	
	@ManyToOne()
    @JoinColumn(name = "codigo_tipo_identificacion")
    private TipoIdentificacion tipoIdentificacion;
	
	public Persona() {}
	
	public Persona(Long codigo, String nombre, String apellido, Instant fechaNacimiento, String userName,
			String password, long identificacion, Estado estado, TipoIdentificacion tipoIdentificacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.userName = userName;
		this.password = password;
		this.identificacion = identificacion;
		this.estado = estado;
		this.tipoIdentificacion = tipoIdentificacion;
	}

	// Zona de implementacion de Getter y Setter de la entidad
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Instant getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Instant fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	
	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * @return the tipoIdentificacion
	 */
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
	
	@Override
	public String toString() {
		return "PersonaEntity [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", userName=" + userName + ", password=" + password
				+ ", identificacion=" + identificacion + ", estado=" + estado + ", tipoIdentificacion="
				+ tipoIdentificacion + "]";
	}
	
}
