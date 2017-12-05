package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufc.br.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Integer>{

    Serie findById(int id);

}
