package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager  implements JobPositionService{
	
	private JobPositionDao jobPositiondao;
	
	@Autowired
	
	
	//constructor injection
	public JobPositionManager(JobPositionDao jobPositiondao) {
		super();
		this.jobPositiondao = jobPositiondao;
		
		
	}
	
	@Override
	public List <JobPosition> getAll(){
		return this.jobPositiondao.findAll();
		
	}
	
	
	
}
