package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.service.MailCheckService;
import kodlamaio.hrms.core.service.MernisService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService {
		
	private CandidateDao candidateDao;
	private MailCheckService mailCheckService;
	private MernisService mernisService;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
		
	}
	
	@Override
	public DataResult<List<Candidate>> getAll(){
		
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(),"İş arayanlar Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		
		if(candidate.getMail() == null 
				|| candidate.getPassword() == null
				|| candidate.getName() == null
				|| candidate.getSurname() ==null
				|| candidate.getIdentity_number() == null
				|| candidate.getBirth_year() == null) {
			return new ErrorResult("Tüm alanların doldurulması zorunludur.");
		}
			else if(!mailCheckService.mailCheck(candidate.getMail())) {
			return new ErrorResult("Mail formatı hatalı.");
		}
			else if(!mernisService.checkId(Long.parseLong(candidate.getIdentity_number()), candidate.getName(), candidate.getSurname(), Integer.parseInt(candidate.getBirth_year()))) {
			return new ErrorResult("Kimlik doğrulanamadı");
			
		}
		
		
		return new SuccessResult("Giriş Onaylandı");

	}

	

	
}




