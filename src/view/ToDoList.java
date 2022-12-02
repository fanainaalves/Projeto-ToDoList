package view;

import javax.swing.JFrame;
import javax.swing.UIManager;

import app.App;

public class ToDoList {
	public static void main(String[] args) {
		
		try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }
		
		new App();
	}
}