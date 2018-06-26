package negocio;

public class Facade {

	public HostABM getHostABM() {
		return new HostABM();
	}
}