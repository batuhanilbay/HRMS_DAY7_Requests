package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service

public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
		
	}
	
	@Override
	public DataResult<List<Employer>> getAll(){
		
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"İşverenler Listelendi");
	}
	
	
	

	@Override
	public Result add(Employer employer) {
		if(this.empytField(employer)) {
			return new ErrorResult("Boş alanlar doldurulmalıdır.");
		}
		
		return new SuccessResult("İşveren  eklendi");
		
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren  silindi");
		
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren  bilgileri güncellendi");
		
	}

	@Override
	public boolean empytField(Employer employer) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
