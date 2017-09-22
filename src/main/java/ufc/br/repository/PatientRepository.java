package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ufc.br.model.Patient;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	Patient findByRegistration(String registration);
	
	Patient findByName(String name);

	@Query("from Patient order by name")
	List<Patient> findAll();
}
