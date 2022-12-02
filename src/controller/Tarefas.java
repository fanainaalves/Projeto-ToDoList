package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Tarefas extends JPanel{
	private JLabel indice;
	private JTextField nomeDaTarefa;
	private JButton concluido;
	private boolean marcado;

	public Tarefas() {
		
		try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }

		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.red);
		this.setLayout(new BorderLayout());

		marcado = false;

		indice = new JLabel("");
		indice.setPreferredSize(new Dimension(20,20));
		indice.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(indice, BorderLayout.WEST);

		nomeDaTarefa = new JTextField("Digite suas tarefas aqui..");
		nomeDaTarefa.setBorder(BorderFactory.createEmptyBorder());
		nomeDaTarefa.setBackground(Color.red);

		this.add(nomeDaTarefa, BorderLayout.CENTER);

		concluido = new JButton("Concluido");
		concluido.setPreferredSize(new Dimension(67,20));
		concluido.setBorder(BorderFactory.createEmptyBorder());

		this.add(concluido, BorderLayout.EAST);
	}

	public JButton getConcluido() {
		return concluido;
	}

	public boolean isMarcado() {
		return marcado;
	}

	public void changeIndex(int num) {
		this.indice.setText(num+" - ");
		this.revalidate();
	}

	public void changeSatus() {
		this.setBackground(Color.green);
		nomeDaTarefa.setBackground(Color.green);
		marcado = true;
	}
}