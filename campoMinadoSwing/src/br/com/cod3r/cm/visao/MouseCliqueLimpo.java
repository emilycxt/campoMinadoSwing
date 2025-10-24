package br.com.cod3r.cm.visao;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import br.com.cod3r.cm.modelo.Campo;

public class MouseCliqueLimpo implements MouseListener{
	
	private final Campo campo;
	
	public MouseCliqueLimpo (Campo campo) {
		this.campo = campo;
	}
	
	public void mousePressionado(MouseEvent e ) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			campo.abrir();
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			campo.alternarMarcacao();
		}
	}

//Métodos vazios que não serão utilizados
public void mouseClicked(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
	

}
