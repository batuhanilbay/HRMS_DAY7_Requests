package kodlamaio.hrms.core.service;


public interface MernisService {

	boolean checkId(Long nationalId, String name, String surname, int year);
}
