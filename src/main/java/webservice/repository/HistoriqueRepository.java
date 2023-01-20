package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Historique;

@Repository
public interface HistoriqueRepository extends JpaRepository<Historique, Integer> {
}
