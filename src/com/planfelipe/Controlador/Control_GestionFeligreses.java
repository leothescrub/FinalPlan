package com.planfelipe.Controlador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.planfelipe.Class.Calendario;
import com.planfelipe.vistas.GestionFeligres;
import com.planfelipe.vistas.Login;
import com.planfelipe.vistas.PantallaMain;

public class Control_GestionFeligreses implements MouseListener, ActionListener{

	private GestionFeligres es;
	private String cu;

	
	public Control_GestionFeligreses(GestionFeligres es, String cu){
		this.es = es;
		this.cu = cu;
		
	}

	public void mousePressed(MouseEvent arg0) {
		PantallaMain pan = new PantallaMain();
		 
		if(cu.equals("Registrar")){
			
			es.panelPrincipal.setVisible(false);
			es.panelRegistro1.setVisible(true);
			
		}
		if(cu.equals("BuscarModificar")){
			
			es.panelPrincipal.setVisible(false);
			es.panelBusqueda.setVisible(true);
			
		}
		if(cu.equals("Regresar")){
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


	public void mouseEntered(MouseEvent arg0) {
		
		if(cu.equals("Registrar")){
			
			es.mnRegistrar.setForeground(Color.RED);
			
		}
		if(cu.equals("BuscarModificar")){
			
			es.mnBusqueda.setForeground(Color.RED);
			
		}
		if(cu.equals("Regresar")){
			
			es.mntmRegresar.setForeground(Color.RED);
			
		}
		
	}


	public void mouseExited(MouseEvent arg0) {
		
		if(cu.equals("Registrar")){
			
			es.mnRegistrar.setForeground(Color.BLACK);
			
		}
		if(cu.equals("BuscarModificar")){
			
			es.mnBusqueda.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Regresar")){
			
			es.mntmRegresar.setForeground(Color.BLACK);
			
		}
		
	}
	
	
	public void actionPerformed(ActionEvent e) {

/*
 * eventos que se generan el panelRegistro_1
 */
		
		if(cu.equals("Regresar_1")){
			
			es.panelPrincipal.setVisible(true);
			
			es.panelRegistro1.setVisible(false);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
