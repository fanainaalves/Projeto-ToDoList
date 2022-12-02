package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BarraDeTitulo extends JPanel {

	public BarraDeTitulo() {
		setPreferredSize(new Dimension(15,70));
		setBackground(Color.LIGHT_GRAY);

		JLabel tituloText = new JLabel("To Do - List");
		setPreferredSize(new Dimension(200,35));
		tituloText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		tituloText.setHorizontalAlignment(JLabel.CENTER);
		setVisible(true);
		add(tituloText);
	}
}
