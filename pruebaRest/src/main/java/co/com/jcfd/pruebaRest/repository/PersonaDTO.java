/*
 * Clase: UsuarioDTO
 * Fecha Creación: 09/04/2021 07:35:00PM
 * Creado por: Julio Cesar Ferreira
 * Descripción: Clase que implementa el patrón DTO para la entidad Persona
 */

package co.com.jcfd.pruebaRest.repository;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Past;

public class PersonaDTO implements Serializable {

	private static final long serialVersionUID = 5634113200988977612L;
	
	private Long codigo;
	
	@NotBlank(message = "Nombre no puede estar vacio")
	@Size(max = 100, message = "Nombre no debe superar los 100 caracteres")
	private String nombre;
	
	@NotBlank(message = "apellido no puede estar vacio")
	@Size(max = 100, message = "Apellido no debe superar los 100 caracteres")
	private String apellido;
	
	@NotNull(message = "Fecha de nacimiento no puede ser null")
	@Past(message = "La fecha de nacimiento debe ser anterior a la fecha actual")
	private Instant fechaNacimiento;
	
	@NotBlank(message = "Nombre de usuario no puede estar vácio")
	@Size(max = 20, message = "Nombre de usuario no debe superar los 20 caracteres")
	private String userName;
	
	@NotBlank(message = "Password no puede estar vácio")
	@Size(max = 50, message = "Password no debe superar los 50 carácteres")
	private String password;
	
	@NotNull(message = "Identificación de usuario no puede ser null")
	private Long identificacion;
	
	@NotNull(message = "Tipo identificación de usuario no puede ser null")
	private TipoIdentificacion tipoIdentificacion;
	
	@NotNull(message = "Estado de usuario no puede ser null")
	private Estado estado;
	
	
	public PersonaDTO() {
		super();
	}


	public PersonaDTO(Long codigo, String nombre, String apellido, Instant fechaNacimiento, String userName,
			String password, Long identificacion, TipoIdentificacion tipoIdentificacion, Estado estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.userName = userName;
		this.password = password;
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.estado = estado;
	}


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

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "UsuarioDTO [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", userName=" + userName + ", password=" + password + ", identificacion="
				+ identificacion + ", tipoIdentificacion=" + tipoIdentificacion + ", estado="
				+ estado + "]";
	}
	
	
	public static PersonaDTO convertEntityToDTO(Persona personaEntity) {
		
		if(personaEntity != null) {
			PersonaDTO personaDTO = new PersonaDTO();
			personaDTO.setCodigo(personaEntity.getCodigo());
			personaDTO.setNombre(personaEntity.getNombre());
			personaDTO.setApellido(personaEntity.getApellido());
			personaDTO.setEstado(personaEntity.getEstado());
			personaDTO.setTipoIdentificacion(personaEntity.getTipoIdentificacion());
			personaDTO.setFechaNacimiento(personaEntity.getFechaNacimiento());
			personaDTO.setIdentificacion(personaEntity.getIdentificacion());
			personaDTO.setPassword(personaEntity.getPassword());
			personaDTO.setUserName(personaEntity.getUserName());
			
			return personaDTO;
		}else {
			return null;
		}
		
		
	}
	
	public static Persona convertDtoToEntity(PersonaDTO personaDTO) {
		
		if(personaDTO != null) {
			
			Persona personaEntity = new Persona();
			personaEntity.setCodigo(personaDTO.getCodigo());
			personaEntity.setNombre(personaDTO.getNombre());
			personaEntity.setApellido(personaDTO.getApellido());
			personaEntity.setEstado(personaDTO.getEstado());
			personaEntity.setTipoIdentificacion(personaDTO.getTipoIdentificacion());
			personaEntity.setFechaNacimiento(personaDTO.getFechaNacimiento());
			personaEntity.setIdentificacion(personaDTO.getIdentificacion());
			personaEntity.setPassword(personaDTO.getPassword());
			personaEntity.setUserName(personaDTO.getUserName());
			
			return personaEntity;
			
		}else {
			return null;
		}
		
	}
	

}
