package com.planfelipe.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.planfelipe.vistas.Login;
import com.planfelipe.vistas.PantallaMain;

public class Control_Login implements ActionListener{
	
	private Login es;
	private String cu;
	private PantallaMain pan = new PantallaMain();
	
	public Control_Login(Login es, String cu){
		this.es = es;
		this.cu = cu;
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(cu.equals("Inicio")){
			
			if((es.txtUsuario.getText().equals("admin"))
				&&(es.txtPass.getText().equals("admin"))){
						
				es.setVisible(false);
				pan.setVisible(true);
				
			}
		
		}
		
	}

}
