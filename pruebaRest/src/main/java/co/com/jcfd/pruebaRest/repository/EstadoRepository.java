package co.com.jcfd.pruebaRest.repository;

import org.springframework.data.repository.CrudRepository;

public interface EstadoRepository extends CrudRepository<Estado, Long> {
		
		// public List<EstadoEntity> findAll();
		
		// public List<EstadoEntity> findByNameIgnoreCaseContaining(@Param("nombre") String nombre);

	}