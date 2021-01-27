package CovidData.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import CovidData.restapi.Entity.Covid;

@Repository
public interface CovidRepository extends JpaRepository<Covid, Integer>{
	
	@Query(value="Select * from covid1 where patient_number = :id and gender = :gender",nativeQuery = true)
	
    public Covid findDataByQuery(@Param("id") int id,@Param("gender") String gender);
	
}
