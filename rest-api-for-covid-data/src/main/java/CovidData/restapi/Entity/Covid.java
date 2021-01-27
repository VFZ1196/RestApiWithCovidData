package CovidData.restapi.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="covid1")
public class Covid {
	
	@Id
	private int patient_number;         
	private String state_patient_number;        
	private Date date_announced;         
	private Date estimated_onset_date;          
	private Integer age_bracket;          
	private String gender;                        
	private String detected_city;                 
	private String detected_district;             
	private String detected_state;            
	private String state_code;               
	private String current_status;                
	private String notes;               
	private String contracted_from_which_patient;  
	private String nationality;                    
	private String type_of_transmission;           
	private Date status_change_date;            
	private String source_1;                      
	private String source_2;                       
	private String source_3;                      
	private String backup_notes;                  
	private int num_cases;       
	
	public Covid() {
		
	}

	public Covid(int patient_number, String state_patient_number, Date date_announced, Date estimated_onset_date,
			Integer age_bracket, String gender, String detected_city, String detected_district, String detected_state,
			String state_code, String current_status, String notes, String contracted_from_which_patient,
			String nationality, String type_of_transmission, Date status_change_date, String source_1, String source_2,
			String source_3, String backup_notes, int num_cases) {
		super();
		this.patient_number = patient_number;
		this.state_patient_number = state_patient_number;
		this.date_announced = date_announced;
		this.estimated_onset_date = estimated_onset_date;
		this.age_bracket = age_bracket;
		this.gender = gender;
		this.detected_city = detected_city;
		this.detected_district = detected_district;
		this.detected_state = detected_state;
		this.state_code = state_code;
		this.current_status = current_status;
		this.notes = notes;
		this.contracted_from_which_patient = contracted_from_which_patient;
		this.nationality = nationality;
		this.type_of_transmission = type_of_transmission;
		this.status_change_date = status_change_date;
		this.source_1 = source_1;
		this.source_2 = source_2;
		this.source_3 = source_3;
		this.backup_notes = backup_notes;
		this.num_cases = num_cases;
	}

	public int getPatient_number() {
		return patient_number;
	}

	public void setPatient_number(int patient_number) {
		this.patient_number = patient_number;
	}

	public String getState_patient_number() {
		return state_patient_number;
	}

	public void setState_patient_number(String state_patient_number) {
		this.state_patient_number = state_patient_number;
	}

	public Date getDate_announced() {
		return date_announced;
	}

	public void setDate_announced(Date date_announced) {
		this.date_announced = date_announced;
	}

	public Date getEstimated_onset_date() {
		return estimated_onset_date;
	}

	public void setEstimated_onset_date(Date estimated_onset_date) {
		this.estimated_onset_date = estimated_onset_date;
	}

	public Integer getAge_bracket() {
		return age_bracket;
	}

	public void setAge_bracket(Integer age_bracket) {
		this.age_bracket = age_bracket;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDetected_city() {
		return detected_city;
	}

	public void setDetected_city(String detected_city) {
		this.detected_city = detected_city;
	}

	public String getDetected_district() {
		return detected_district;
	}

	public void setDetected_district(String detected_district) {
		this.detected_district = detected_district;
	}

	public String getDetected_state() {
		return detected_state;
	}

	public void setDetected_state(String detected_state) {
		this.detected_state = detected_state;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getCurrent_status() {
		return current_status;
	}

	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getContracted_from_which_patient() {
		return contracted_from_which_patient;
	}

	public void setContracted_from_which_patient(String contracted_from_which_patient) {
		this.contracted_from_which_patient = contracted_from_which_patient;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getType_of_transmission() {
		return type_of_transmission;
	}

	public void setType_of_transmission(String type_of_transmission) {
		this.type_of_transmission = type_of_transmission;
	}

	public Date getStatus_change_date() {
		return status_change_date;
	}

	public void setStatus_change_date(Date status_change_date) {
		this.status_change_date = status_change_date;
	}

	public String getSource_1() {
		return source_1;
	}

	public void setSource_1(String source_1) {
		this.source_1 = source_1;
	}

	public String getSource_2() {
		return source_2;
	}

	public void setSource_2(String source_2) {
		this.source_2 = source_2;
	}

	public String getSource_3() {
		return source_3;
	}

	public void setSource_3(String source_3) {
		this.source_3 = source_3;
	}

	public String getBackup_notes() {
		return backup_notes;
	}

	public void setBackup_notes(String backup_notes) {
		this.backup_notes = backup_notes;
	}

	public int getNum_cases() {
		return num_cases;
	}

	public void setNum_cases(int num_cases) {
		this.num_cases = num_cases;
	}
	

}
