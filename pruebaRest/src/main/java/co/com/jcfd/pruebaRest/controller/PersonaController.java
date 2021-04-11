package co.com.jcfd.pruebaRest.controller;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.jcfd.pruebaRest.repository.PersonaDTO;
import co.com.jcfd.pruebaRest.service.IPersonaService;

@RestController
@RequestMapping("persona")
@CrossOrigin
public class PersonaController {

	@Autowired
	IPersonaService personaService;

	@GetMapping("/{id}")
	public PersonaDTO consultarPersona(@PathVariable long id) {
		return personaService.ConsultarPersona(id);
	}

	@GetMapping()
	public List<PersonaDTO> consultarListaPersona() {
		return personaService.ConsultarListPersona();
	}

	@PostMapping()
	public ResponseEntity<PersonaDTO> registrarPersona(@Valid @RequestBody PersonaDTO persona) throws URISyntaxException{
		
		return ResponseEntity.ok(
				personaService.saveOrUpdatePersona(persona));
	}

	@DeleteMapping()
	public void eliminarPersona(@Valid @RequestBody PersonaDTO persona) {
		personaService.EliminarPersona(persona);
	}

	@PutMapping()
	public PersonaDTO modificarPersona(@Valid @RequestBody PersonaDTO persona) throws Exception {

		if (persona.getCodigo() == null) {
			throw new Exception("La entidad Persona no contiene codigo");
		}

		return personaService.saveOrUpdatePersona(persona);
	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
	

}
