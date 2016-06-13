package com.planfelipe.Controlador;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import com.planfelipe.vistas.Login;

public class Control_Inicio {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					
					Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			        //para obtener las dimensiones de la pantalla
			        Dimension dimen = frame.getSize();
			        //igual pero para la ventana
			        frame.setLocation(
			            (pantalla.width - dimen.width) / 2,
			            (pantalla.height - dimen.height) / 2);
			        
			       frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
