package MernisSerirviceReference;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("23492"), "MAHMUD", "FERZELI" , 2003);
		System.out.println("dogrulama: " + (result ? "basarili": "basarisiz"));

	}

}
