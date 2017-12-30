package ufc.br.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ufc.br.model.*;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{

	List<Report> findByStatus(String status);
	
	List<Report> findByPermition_Patient(Patient patient);

	List<Report> findByPermition_Grasp_Exercise(Exercise exercise);
}
