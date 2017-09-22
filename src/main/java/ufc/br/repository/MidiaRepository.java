package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufc.br.model.Midia;
@Repository
public interface MidiaRepository extends JpaRepository<Midia, Integer>{
    Midia findByTitleAndPath(String title,String path);
}
