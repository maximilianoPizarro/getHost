package modelo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;

public class PanelDibujo extends JPanel {

	Principal p;
	InfoSO so;
	InfoCPU cpu;
	InfoNet net;
	ArrayList<String> datosso;
	ArrayList<String> datoscpu;
	ArrayList<String> datosnet;

	public PanelDibujo(Principal prin) {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		p = prin;
		so = new InfoSO();
		cpu = new InfoCPU();
		net = new InfoNet();
		datosso = so.obtenerDatos();
		datoscpu = cpu.obtenerDatos();
		datosnet = net.obtenerDatos();

		JPanel pinfo = new JPanel();
		JLabel linfo = new JLabel("Informacion de tu Computador");
		linfo.setFont(new Font("Verdana", Font.BOLD, 16));
		pinfo.add(linfo, BorderLayout.WEST);
		add(pinfo);
		JPanel pso = new JPanel();
		pso.setLayout(new BorderLayout());
		JLabel lso = new JLabel("Informacion de tu Sistema Operativo");
		lso.setFont(new Font("Verdana", Font.BOLD, 16));
		pso.add(lso, BorderLayout.WEST);
		add(pso);
		for (int i = 0; i < datosso.size(); i += 2) {
			JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			JLabel l = new JLabel(datosso.get(i) + "  " + datosso.get(i + 1));
			p.add(l, BorderLayout.WEST);
			add(p);
		}
		JPanel pcpu = new JPanel();
		pcpu.setLayout(new BorderLayout());
		JLabel lcpu = new JLabel("Informacion de tu CPU");
		lcpu.setFont(new Font("Verdana", Font.BOLD, 16));
		pcpu.add(lcpu, BorderLayout.WEST);
		add(pcpu);
		for (int i = 0; i < datoscpu.size(); i += 2) {
			JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			JLabel l = new JLabel(datoscpu.get(i) + "  " + datoscpu.get(i + 1));
			p.add(l, BorderLayout.WEST);
			add(p);
		}
		JPanel pnet = new JPanel();
		pnet.setLayout(new BorderLayout());
		JLabel lnet = new JLabel("Informacion de tu Red");
		lnet.setFont(new Font("Verdana", Font.BOLD, 16));
		pnet.add(lnet, BorderLayout.WEST);
		add(pnet);
		for (int i = 0; i < datosnet.size(); i += 2) {
			JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			JLabel l = new JLabel(datosnet.get(i) + "  " + datosnet.get(i + 1));
			p.add(l, BorderLayout.WEST);
			add(p);
		}
	}
}