package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BarraDeTitulo extends JPanel {

	public BarraDeTitulo() {
		setPreferredSize(new Dimension(13,70));
		setBackground(Color.lightGray);

		JLabel tituloText = new JLabel("Meu TO DO List");
		this.setPreferredSize(new Dimension(200,40));
		tituloText.setFont(new Font("serif", Font.BOLD + Font.ITALIC , 20));
		tituloText.setHorizontalAlignment(JLabel.CENTER);
		setVisible(true);
		this.add(tituloText);
	}
}
