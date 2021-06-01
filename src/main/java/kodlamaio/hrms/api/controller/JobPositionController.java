package kodlamaio.hrms.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")

public class JobPositionController {
	
	private final JobPositionService jobPositionservice;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionservice) {
		super();
		this.jobPositionservice = jobPositionservice;
		
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionservice.getAll();
	}
	
}
