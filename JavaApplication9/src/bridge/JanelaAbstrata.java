/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

public abstract class JanelaAbstrata {

	protected JanelaImplementada janela;

	public JanelaAbstrata(JanelaImplementada j) {
		janela = j;
	}

	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}

	public void desenharBotao(String titulo) {
		janela.desenharBotao(titulo);
	}

		public abstract void desenhar();
}