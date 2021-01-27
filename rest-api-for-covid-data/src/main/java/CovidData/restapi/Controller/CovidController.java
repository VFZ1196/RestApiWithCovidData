package CovidData.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import CovidData.restapi.Entity.Covid;
import CovidData.restapi.Repository.CovidRepository;

@RestController
public class CovidController {

	@Autowired
	private CovidRepository covidRepository;
	
	//Get All Data
	@GetMapping("/covid")
	public List<Covid> getAllRecords() {
		return covidRepository.findAll();
	}
	/*
	//Get Records by id
	@GetMapping("/covid/{id}")
	public Covid GetRecordByID(@PathVariable("id") int patient_number) {
		return covidRepository.findById(patient_number).get();
	}
	*/
	
	//Get Records by id but with the help of query 
	@GetMapping("/byQuery/{id}/{gender}")
	public Covid GetByQuery(@PathVariable("id") int patient_number,@PathVariable("gender") String gender) {
		return covidRepository.findDataByQuery(patient_number,gender);
	}
}
