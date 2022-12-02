package app;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.BarraDeTitulo;
import controller.Lista;
import controller.Tarefas;
import model.ButtonPanel;

public class App extends JFrame{

	
	private BarraDeTitulo barraDeTitulo;
	private Lista lista;
	private ButtonPanel buttonPanel;
	private JButton adicionarTarefas, limparTarefas;

	public App(){
		
		this.setSize(500,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

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
}
