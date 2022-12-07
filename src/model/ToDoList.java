package model;

import javax.swing.UIManager;
import controller.Controlador;

public class ToDoList {
	public static void main(String[] args) {
		
		try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }
		
		new Controlador();
	}
}