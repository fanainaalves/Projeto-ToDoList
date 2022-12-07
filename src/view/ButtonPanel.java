package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	private JButton addTarefas, limparTarefas, concluidoButton;
	private boolean marcado;

	public ButtonPanel(JButton addTarefas, JButton limparTarefas, JButton concluidoButton) {
		this.addTarefas = addTarefas;
		this.limparTarefas = limparTarefas;
		this.concluidoButton = concluidoButton;
	}

	public ButtonPanel() {
		setPreferredSize(new Dimension(500,43));
		setBackground(Color.GRAY);

		addTarefas = new JButton("Adicionar Tarefas");
		addTarefas.setFont(new Font("Sans-serif", Font.PLAIN, 15));
		
		add(addTarefas);

		add(Box.createHorizontalStrut(10));
		limparTarefas = new JButton("Limpar Tarefas");
		limparTarefas.setFont(new Font("Sans-serif", Font.PLAIN, 15));

		add(limparTarefas);

	}
	
	public JButton getAddTarefas() {
		return addTarefas;
	}

	public JButton getLimparTarefas() {
		return limparTarefas;
	}
}
