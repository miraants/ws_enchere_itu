package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webservice.model.Liste_Enchere;

@Repository
public interface Liste_EnchereRepository extends JpaRepository<Liste_Enchere, Integer> {
}
