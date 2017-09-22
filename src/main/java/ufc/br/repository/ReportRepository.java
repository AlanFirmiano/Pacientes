package ufc.br.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ufc.br.model.Exercise;
import ufc.br.model.Grasp;
import ufc.br.model.Patient;
import ufc.br.model.Report;
@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
	
	List<Report> findByPatient(Patient patient);
	
	List<Report> findByStatus(String status);
	
	List<Report> findByGrasp(Grasp grasp);
	
	Report findByPatientAndDate(Patient patient, Date date);
}
