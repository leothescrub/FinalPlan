package com.planfelipe.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.planfelipe.Controlador.Control_PantallaMain;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaMain extends JFrame {

	private JPanel contentPane;
	public JMenu mnGestionarGruposBiblicos;
	public JMenu mnGestionarFeligrs;
	public JMenu mnGestionarReportes;
	public JMenu mnOpcionesDelSistema;
	public JMenu mnNewAcerca;
	

	/**
	 * Create the frame.
	 */

	public PantallaMain() {
		setTitle("Men\u00FA Principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaMain.class.getResource("/com/planfelipe/imagenes/pequen_o-Pagina-2016.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("header");
		lblHeader.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Menu Principal.png")));
		lblHeader.setBounds(0, 0, 1018, 67);
		contentPane.add(lblHeader);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 68, 1008, 66);
		contentPane.add(menuBar);
		
		mnGestionarGruposBiblicos = new JMenu("Gestionar Grupos B\u00EDblicos");
		mnGestionarGruposBiblicos.setForeground(Color.BLACK);
		
		mnGestionarGruposBiblicos.addMouseListener(new Control_PantallaMain(this, "GruposBiblicos"));
		mnGestionarGruposBiblicos.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Grupo biblico.png")));
		menuBar.add(mnGestionarGruposBiblicos);
		
		mnGestionarFeligrs = new JMenu("Gestionar Feligr\u00E9s");
		mnGestionarFeligrs.addMouseListener(new Control_PantallaMain(this, "feligreses"));
		mnGestionarFeligrs.setForeground(Color.BLACK);
		mnGestionarFeligrs.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/command.png")));
		menuBar.add(mnGestionarFeligrs);
		
		mnGestionarReportes = new JMenu("Gestionar Reportes");
		mnGestionarReportes.addMouseListener(new Control_PantallaMain(this, "Reportes"));
		mnGestionarReportes.setForeground(Color.BLACK);
		mnGestionarReportes.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/business-report.png")));
		menuBar.add(mnGestionarReportes);
		
		mnOpcionesDelSistema = new JMenu("Opciones del Sistema");
		mnOpcionesDelSistema.addMouseListener(new Control_PantallaMain(this, "OpcionesSistema"));
		mnOpcionesDelSistema.setForeground(Color.BLACK);
		mnOpcionesDelSistema.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/management.png")));
		menuBar.add(mnOpcionesDelSistema);
		
		mnNewAcerca = new JMenu("Acerca...");
		mnNewAcerca.addMouseListener(new Control_PantallaMain(this, "Acerca"));
		mnNewAcerca.setForeground(Color.BLACK);
		mnNewAcerca.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/more.png")));
		menuBar.add(mnNewAcerca);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/slogan-transparente-2016.png")));
		lblLogo.setBounds(95, 159, 756, 533);
		contentPane.add(lblLogo);
		
		JLabel lblWallpaper = new JLabel("wallpaper");
		lblWallpaper.setIcon(new ImageIcon(PantallaMain.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpaper.setBounds(0, 134, 1028, 606);
		contentPane.add(lblWallpaper);
	}
}
