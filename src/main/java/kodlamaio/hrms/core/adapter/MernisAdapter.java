package kodlamaio.hrms.core.adapter;

import java.rmi.RemoteException;

import kodlamaio.hrms.core.service.MernisService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements MernisService{
	
	
	
	@Override
	public boolean checkId(Long nationalId, String name, String surname, int year) {
		
		KPSPublicSoap user = new KPSPublicSoapProxy();
		
		try {
			return user.TCKimlikNoDogrula(nationalId, name.toUpperCase(), surname.toUpperCase(), year);
		
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch (RemoteException e){
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}
	
}
