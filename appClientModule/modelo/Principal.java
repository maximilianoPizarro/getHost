package modelo;

import javax.swing.JApplet;

public class Principal extends JApplet {

	PanelDibujo pd;

	public void init() {
		pd = new PanelDibujo(this);
		add(pd);
	}
}