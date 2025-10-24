package br.com.cod3r.cm.visao;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import br.com.cod3r.cm.modelo.Campo;

public class MouseCliqueCampo implements MouseListener{
	
	private final Campo campo;
	
	public MouseCliqueCampo (Campo campo) {
		this.campo = campo;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			campo.abrir();
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			campo.alternarMarcacao();
		}
	}

//Métodos vazios que não serão utilizados
public void mouseClicked(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
	

}
