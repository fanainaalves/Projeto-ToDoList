package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{

	private JButton addTarefas, limparTarefas;

	public ButtonPanel(JButton addTarefas, JButton limparTarefas) {
		this.addTarefas = addTarefas;
		this.limparTarefas = limparTarefas;
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
