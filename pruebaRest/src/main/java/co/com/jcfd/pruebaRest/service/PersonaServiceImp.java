package co.com.jcfd.pruebaRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.jcfd.pruebaRest.repository.PersonaRepository;
import co.com.jcfd.pruebaRest.repository.Persona;
import co.com.jcfd.pruebaRest.repository.PersonaDTO;

@Service
public class PersonaServiceImp implements IPersonaService{
	
	
	@Autowired   
	private PersonaRepository personaRepository;
	

	@Override
	public PersonaDTO ConsultarPersona(Long idUsuario) {
		
		Persona persona = personaRepository.findById(idUsuario).orElse(null);
		
		return PersonaDTO.convertEntityToDTO(persona);
		
	}

	@Override
	public List<PersonaDTO> ConsultarListPersona() {

		List<Persona> listPersonaEntity = personaRepository.findAll();
		List<PersonaDTO> listPersonaDTO = new ArrayList<>();
		
		for (Persona persona : listPersonaEntity) {
			listPersonaDTO.add(PersonaDTO.convertEntityToDTO(persona));
		}
		
		return listPersonaDTO;
	}
	
	public PersonaDTO saveOrUpdatePersona(PersonaDTO personaDTO) {

		Persona personaEntity = PersonaDTO.convertDtoToEntity(personaDTO);

		personaEntity = personaRepository.save(personaEntity);
		
		return PersonaDTO.convertEntityToDTO(personaEntity);
		
	}

	@Override
	public void EliminarPersona(PersonaDTO personaDTO) {
		
		Persona personaEntity = PersonaDTO.convertDtoToEntity(personaDTO);
		personaRepository.delete(personaEntity);
	}

}
