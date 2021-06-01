package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "verify_code")
public class VerifyCode {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "verify_code")
	private String verify_code;
	
	@Column(name="is_confirmed")
	private boolean is_confirmed;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="confirmed_date")
	private Date confirmed_date;
	
	
	
}