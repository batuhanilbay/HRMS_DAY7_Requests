package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service //business görevini görecek sınıftır.


public class UserManager implements UserService{
	
	
	private UserDao userDao; 
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		
	}

	@Override
	public DataResult<List<User>> getAll(){
		
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Kullanıcılar Listelendi");
	}
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
		
	}
	
	@Override
	public Result delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult("Kullanıcı silindi");
		
	}
	
	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı bilgileri güncellendi");
		
	}
	
	
	
	
}
