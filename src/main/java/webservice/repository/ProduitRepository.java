package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import webservice.model.Rechargement;

public interface ProduitRepository  extends JpaRepository<Rechargement, Integer> {
}
