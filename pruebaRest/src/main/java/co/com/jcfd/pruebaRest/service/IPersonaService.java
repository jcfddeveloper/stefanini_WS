package co.com.jcfd.pruebaRest.service;

import java.util.List;

import co.com.jcfd.pruebaRest.repository.PersonaDTO;

public interface IPersonaService {
	
	public PersonaDTO ConsultarPersona(Long idUsuario);
	public List<PersonaDTO> ConsultarListPersona();
	public PersonaDTO saveOrUpdatePersona(PersonaDTO persona);
	public void EliminarPersona(PersonaDTO personaDTO);

}
