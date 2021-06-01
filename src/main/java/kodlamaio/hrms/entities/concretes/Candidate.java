package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidate_users")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Candidate extends User{
	

	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name="surname",nullable = false)
	private String surname;
	
	@Column(name="identity_number",nullable = false)
	private String identity_number;
	
	@Column(name = "birth_year",nullable = false)
	private String birth_year;


	}
	
	


