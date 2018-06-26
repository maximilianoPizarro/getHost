package test;

import javax.xml.bind.JAXB;

public class TestJavaVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String javaVersion = System.getProperty("java.version");
		
		System.out.println(javaVersion.toString());
		
		String username=System.getProperty("user.name");
		System.out.println(username.toString());


		

	}

}
