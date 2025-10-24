package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		String[] opcoes = { "Fácil", "Médio", "Difícil" };

		int escolha = javax.swing.JOptionPane.showOptionDialog(null, "Escolha a dificuldade", "Campo Minado",
				javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, opcoes,
				opcoes[0]);
		int linhas = 0;
		int colunas = 0;
		int minas = 0;

		switch (escolha) {
		case 0: {
			linhas = 9;
			colunas = 9;
			minas = 10;
			break;
		}
		case 1: {
			linhas = 16;
			colunas = 16;
			minas = 40;
			break;
		}
		case 2: {
			linhas = 16;
			colunas = 30;
			minas = 80;
			break;
		}
		default: {
			System.exit(0);
		}
		}
		
		Tabuleiro tabuleiro = new Tabuleiro (linhas, colunas, minas);
		add (new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize (690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible (true);

	}

	/*
	 * Construtor 1.0 public TelaPrincipal() { Tabuleiro tabuleiro = new Tabuleiro
	 * (16, 30, 60); add (new PainelTabuleiro(tabuleiro));
	 * 
	 * 
	 * setTitle("Campo Minado"); setSize(690, 438); setLocationRelativeTo(null);
	 * setDefaultCloseOperation(DISPOSE_ON_CLOSE); setVisible(true); }
	 */

	public static void main(String[] args) {

		new TelaPrincipal();

	}

}
