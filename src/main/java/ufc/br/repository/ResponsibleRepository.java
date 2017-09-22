package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ufc.br.model.Responsible;

@Repository
public interface ResponsibleRepository extends JpaRepository<Responsible, Integer>{
	Responsible findByEmail(String email);
}
