package controller;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.ButtonPanel;

public class Controlador extends JFrame{

	private BarraDeTitulo barraDeTitulo;
	private Lista lista;
	private ButtonPanel buttonPanel;
	private JButton adicionarTarefas, limparTarefas;
	private final JFrame janela;

	public Controlador(){
		setTitle("TO DO - List");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		janela = new JFrame();
		barraDeTitulo = new BarraDeTitulo();
		lista = new Lista();
		buttonPanel = new ButtonPanel();

		this.add(barraDeTitulo, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);
		this.add(lista, BorderLayout.CENTER);

		adicionarTarefas =  buttonPanel.getAddTarefas();
		limparTarefas = buttonPanel.getLimparTarefas();

		addListeners();
	}

	public void addListeners() {
		adicionarTarefas.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Tarefas tarefas = new Tarefas();
				lista.add(tarefas);
				lista.enumerarTarefas();
				revalidate();

				tarefas.getConcluido().addMouseListener(new MouseAdapter(){				
					@Override
					public void mousePressed(MouseEvent e) {
						tarefas.changeSatus();
						revalidate();
					}
				});
				revalidate();
			}
		});
		
		limparTarefas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e ) {
				lista.removerTarefasCompletadas();
				repaint();
			}
		});
	}

	public JFrame getJanela() {
		return janela;
	}
}
