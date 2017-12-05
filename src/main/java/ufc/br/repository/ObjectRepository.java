package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufc.br.model.Object;

@Repository
public interface ObjectRepository extends JpaRepository<Object,Integer>{
    Object findByName(String name);
}
