package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class testcpu {
	
	private static List<String> processes = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		try {
			Runtime.getRuntime().exec("ipconfig");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static void getRunningProcesses() throws Exception {
	    Process process = Runtime.getRuntime().exec("top -b -n1 -c");
	    InputStream is = process.getInputStream();
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
	    String line;
	    while ( (line = br.readLine()) != null) {
	        if( line.contains("java") ) processes.add( line );  
	    }   
	}
	
	@SuppressWarnings("unused")
	private String getByPid( int pid ) {
	    for ( String line : processes ) {
	        if ( line.startsWith( String.valueOf( pid ) ) ) {
	            return line;
	        }
	    }
	    return "";
	}
	
	@SuppressWarnings("unused")
	private Double getCpuFromProcess( String process ) {
	    //PID USER PR NI VIRT RES SHR S %CPU %MEM TIME+ COMMAND
	    Double result = 0.0;
	    String[] items = process.replace("  "," ").replace("  "," ").split(" ");
	    result = Double.valueOf( items[8].replace(",", ".") );
	    return result;
	}

	

}


