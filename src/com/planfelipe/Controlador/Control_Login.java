package com.planfelipe.Controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.planfelipe.vistas.Login;
import com.planfelipe.vistas.PantallaMain;

public class Control_Login implements ActionListener{
	
	private Login es;
	private String cu;
	private PantallaMain pan = new PantallaMain();
	
	public Control_Login(Login es, String cu){
		pan.setResizable(false);
		this.es = es;
		this.cu = cu;
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(cu.equals("Inicio")){
			
			if((es.txtUsuario.getText().equals(""))
				&&(es.txtPass.getText().equals(""))){
						
				es.setVisible(false);
				
		        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		        //para obtener las dimensiones de la pantalla
		        Dimension dimen = pan.getSize();
		        //igual pero para la ventana
		        pan.setLocation(
		            (pantalla.width - dimen.width) / 2,
		            (pantalla.height - dimen.height) / 2);
				pan.setVisible(true);
				
			}
		
		}
		
	}

}
