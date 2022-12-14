package view;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.UIManager;

public class ListaPanel extends JPanel{
	
	public ListaPanel() {
		
		try {
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	    } catch (Exception e){
	        e.printStackTrace();
	    }
		
		GridLayout layout = new GridLayout(10,1);

		layout.setVgap(5);
		this.setLayout(layout);
		//setBackground(Color.yellow);
	}

	public void enumerarTarefas() {
		Component[] listarItens = this.getComponents();
		for(int i = 0; i < listarItens.length; i++) {
			if(listarItens[i] instanceof TarefasPanel) {
				((TarefasPanel) listarItens[i]).changeIndex(i+1);
			}
		}
	}
	
	public void removerTarefasCompletadas() {
		for(Component c : getComponents()) {
			if(c instanceof TarefasPanel) {
				if(((TarefasPanel)c).isMarcado()) {
					remove(c);
					enumerarTarefas();
				}
			}
			
		}
	}
}