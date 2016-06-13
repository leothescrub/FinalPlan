package com.planfelipe.Controlador;

import java.awt.EventQueue;

import com.planfelipe.vistas.Login;

public class Control_Inicio {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
