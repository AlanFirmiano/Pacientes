package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufc.br.model.Recommendation;
@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation,Integer> {
    Recommendation findById(Integer id);
}
