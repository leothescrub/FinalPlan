package com.planfelipe.Controlador;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.planfelipe.vistas.GestionGrupoBiblico;
import com.planfelipe.vistas.PantallaMain;

public class Control_GruposBiblico implements MouseListener, ActionListener{
	
	private GestionGrupoBiblico es;
	private String cu;

	
	public Control_GruposBiblico(GestionGrupoBiblico es, String cu){
		
		this.es = es;
		this.cu = cu;
		
	}

	public void mouseEntered(MouseEvent arg0) {

		if(cu.equals("Registrar")){
			
			es.mnRegistrar.setForeground(Color.RED);
			
		}
		if(cu.equals("Modificar")){
			
			es.mnModificar.setForeground(Color.RED);
			
		}
		if(cu.equals("Listar")){
			
			es.mnListar.setForeground(Color.RED);
			
		}
		if(cu.equals("AgregarInfo")){
			
			es.mnAgregarInfor.setForeground(Color.RED);
			
		}
		if(cu.equals("Regresar")){
			
			es.mntmRegresar.setForeground(Color.RED);
			
		}
	}


	public void mouseExited(MouseEvent arg0) {

	if(cu.equals("Registrar")){
			
			es.mnRegistrar.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Modificar")){
			
			es.mnModificar.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Listar")){
			
			es.mnListar.setForeground(Color.BLACK);
			
		}
		if(cu.equals("AgregarInfo")){
			
			es.mnAgregarInfor.setForeground(Color.BLACK);
			
		}
		if(cu.equals("Regresar")){
			
			es.mntmRegresar.setForeground(Color.BLACK);
			
		}
	}

	
	public void mousePressed(MouseEvent arg0) {


		if(cu.equals("Registrar")){
				
				es.panelRegistro.setVisible(true);
				es.panelPrincipal.setVisible(false);
				
				
			}
			if(cu.equals("Modificar")){
				
			es.panelModificacion.setVisible(true);
			es.panelPrincipal.setVisible(false);
				
			}
			if(cu.equals("Listar")){
				
				es.panelListado.setVisible(true);
				es.panelPrincipal.setVisible(false);
				
				
			}
			if(cu.equals("AgregarInfo")){
				
				es.panelPrincipal.setVisible(false);
				es.panelInformes.setVisible(true);
			}
			if(cu.equals("Regresar")){
				PantallaMain pa = new PantallaMain();
				
				es.setVisible(false);
				pa.setVisible(true);
				
				Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		        //para obtener las dimensiones de la pantalla
		        Dimension dimen = pa.getSize();
		        //igual pero para la ventana
		        pa.setLocation(
		            (pantalla.width - dimen.width) / 2,
		            (pantalla.height - dimen.height) / 2);
			}
		
	}

	
	public void actionPerformed(ActionEvent arg0) {

		if(cu.equals("btnRegresar")){
			
			es.panelPrincipal.setVisible(true);
			es.panelRegistro.setVisible(false);
			
		}
		if(cu.equals("RegresarModif")){
			
			es.panelPrincipal.setVisible(true);
			es.panelModificacion.setVisible(false);
			
		}
		
		if(cu.equals("RegresarList")){
			
			es.panelPrincipal.setVisible(true);
			es.panelListado.setVisible(false);
			
			
		}
		if(cu.equals("btnRegresarInfo")){
			
			es.panelPrincipal.setVisible(true);
			es.panelInformes.setVisible(false);
			
			
		}
	
		if(cu.equals("SiguenteInfo")){
			
			es.panelInformes_1.setVisible(true);
			es.panelInformes.setVisible(false);
			
			
		}
		if(cu.equals("btnRegresarInfo_1")){
			
			es.panelInformes_1.setVisible(false);
			es.panelInformes.setVisible(true);		
			
		}
	}
	
	
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

	
}
