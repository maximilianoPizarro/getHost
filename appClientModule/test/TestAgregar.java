package test;

import java.util.ArrayList;

import modelo.Host;
import modelo.InfoCPU;
import modelo.InfoNet;
import modelo.InfoSO;
import negocio.Facade;
import negocio.HostABM;

public class TestAgregar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facade sist= new Facade();
		
		HostABM se=sist.getHostABM();
		
    	String javaVersion = System.getProperty("java.version");
    	String username=System.getProperty("user.name");
    	
        ArrayList<String> cpu=new InfoCPU().obtenerDatos();
                   
        String vendedor= cpu.get(1);
        String modelo= cpu.get(3);
        String Mhz= cpu.get(5);
        String cpu_fisicas= cpu.get(7);
        String nucleos= cpu.get(9);
        
        ArrayList<String> infonet=new InfoNet().obtenerDatos();
        String ip_primaria= infonet.get(1);
        String mac= infonet.get(3);
        String host= infonet.get(5);
        
        ArrayList<String> so=new InfoSO().obtenerDatos();
        String fabricante= so.get(1);
        String nombre=so.get(3);
        String version= so.get(5);
        String arquitectura= so.get(7);
        
        String java_version= javaVersion.toString();
        String usuario= username.toString();
		
		
		try {
			se.agregarHost(new Host(vendedor,modelo,Mhz,cpu_fisicas,nucleos,"asd123",host,fabricante,version,arquitectura,java_version,usuario,null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
