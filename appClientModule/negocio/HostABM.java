package negocio;

import dao.HostDao;
import modelo.Host;

public class HostABM {
	
	private HostDao daoA= new HostDao();
	
	public Host traerHost(int idHost) throws Exception {

		Host a = daoA.traerHost(idHost);

		if (a == null) {
			throw new Exception("No existe Host con ese id");
		}
		return a;
	}
	
	public int agregarHost(Host host) throws Exception {	
		
		int a=daoA.agregar(host);
		if (a == 1) {
			throw new Exception("No se pudo agregar Host");
		}
		return a;
	}

}
