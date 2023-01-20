package webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import webservice.model.Admin;

public interface AdminRepository  extends JpaRepository<Admin, Integer> {
    public Admin findAdminByEmailAndMdp(String email,String mdp);

}
