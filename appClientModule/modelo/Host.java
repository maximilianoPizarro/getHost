package modelo;


public class Host {
	
	  private int idhost;
	  private String cpu_vendedor;
	  private String cpu_modelo;
	  private String cpu_mhz;
	  private String cpu_fisicas;
	  private String cpu_nucleos;
	  private String mac;
	  private String red_host;
	  private String so_fabricante;
	  private String so_arquitectura;
	  private String so_version;
	  private String java_version;
	  private String usuario;
	  private HostArea hostArea;
	
	  public Host(){};  
	  
	public Host(String cpu_vendedor, String cpu_modelo, String cpu_mhz, String cpu_fisicas, String cpu_nucleos,
			String mac, String red_host, String so_fabricante, String so_arquitectura, String so_version,
			String java_version, String usuario,HostArea hostArea) {
		super();
		this.cpu_vendedor = cpu_vendedor;
		this.cpu_modelo = cpu_modelo;
		this.cpu_mhz = cpu_mhz;
		this.cpu_fisicas = cpu_fisicas;
		this.cpu_nucleos = cpu_nucleos;
		this.mac = mac;
		this.red_host = red_host;
		this.so_fabricante = so_fabricante;
		this.so_arquitectura = so_arquitectura;
		this.so_version = so_version;
		this.java_version = java_version;
		this.usuario = usuario;
		this.hostArea=hostArea;
	}

	public int getIdhost() {
		return idhost;
	}

	protected void setIdhost(int idhost) {
		this.idhost = idhost;
	}

	public String getCpu_vendedor() {
		return cpu_vendedor;
	}

	public void setCpu_vendedor(String cpu_vendedor) {
		this.cpu_vendedor = cpu_vendedor;
	}

	public String getCpu_modelo() {
		return cpu_modelo;
	}

	public void setCpu_modelo(String cpu_modelo) {
		this.cpu_modelo = cpu_modelo;
	}

	public String getCpu_mhz() {
		return cpu_mhz;
	}

	public void setCpu_mhz(String cpu_mhz) {
		this.cpu_mhz = cpu_mhz;
	}

	public String getCpu_fisicas() {
		return cpu_fisicas;
	}

	public void setCpu_fisicas(String cpu_fisicas) {
		this.cpu_fisicas = cpu_fisicas;
	}

	public String getCpu_nucleos() {
		return cpu_nucleos;
	}

	public void setCpu_nucleos(String cpu_nucleos) {
		this.cpu_nucleos = cpu_nucleos;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getRed_host() {
		return red_host;
	}

	public void setRed_host(String red_host) {
		this.red_host = red_host;
	}

	public String getSo_fabricante() {
		return so_fabricante;
	}

	public void setSo_fabricante(String so_fabricante) {
		this.so_fabricante = so_fabricante;
	}

	public String getSo_arquitectura() {
		return so_arquitectura;
	}

	public void setSo_arquitectura(String so_arquitectura) {
		this.so_arquitectura = so_arquitectura;
	}

	public String getSo_version() {
		return so_version;
	}

	public void setSo_version(String so_version) {
		this.so_version = so_version;
	}

	public String getJava_version() {
		return java_version;
	}

	public void setJava_version(String java_version) {
		this.java_version = java_version;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public HostArea getHostArea() {
		return hostArea;
	}

	public void setHostArea(HostArea hostArea) {
		this.hostArea = hostArea;
	}
	
	
	
	  
	  

}
