package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "employer_users")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@PrimaryKeyJoinColumn(name = "employer_id")

public class Employer extends User {
	

	
	@Column(name = "company_name",nullable = false)
	private String company_name;
	
	@Column(name = "web_address", nullable = false)
	private String web_address;
	
	@Column (name = "phone",nullable = false)
	private String phone;
	

	
	
}
