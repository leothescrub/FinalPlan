package com.planfelipe.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.xswingx.PromptSupport;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GestionGrupoBiblico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldCodigo;
	private JTextField textFieldFelipeLider;
	private JTextField textFieldFelipedeGrupos;
	private JTextField textFieldNombreModif;
	private JTextField textFieldGrupoModif;
	private JTextField textFieldfelipeLiderModif;
	private JTextField textFieldFelipeGrupoModif;
	private JTextField textFieldBusqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionGrupoBiblico frame = new GestionGrupoBiblico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionGrupoBiblico() {
		setTitle("Gesti\u00F3n de Grupos B\u00EDblicos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/pequen_o-Pagina-2016.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setBounds(0, 0, 1008, 729);
		contentPane.add(panelRegistro);
		panelRegistro.setLayout(null);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(457, 174, 234, 36);
		panelRegistro.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		PromptSupport.setPrompt("Ej: Los Pitufos", textFieldNombre);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(457, 221, 234, 36);
		panelRegistro.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		PromptSupport.setPrompt("Ej: 12345", textFieldCodigo);
		
		textFieldFelipeLider = new JTextField();
		textFieldFelipeLider.setBounds(457, 264, 234, 36);
		panelRegistro.add(textFieldFelipeLider);
		textFieldFelipeLider.setColumns(10);
		PromptSupport.setPrompt("Ej: V-12345678", textFieldFelipeLider);
		
		textFieldFelipedeGrupos = new JTextField();
		textFieldFelipedeGrupos.setColumns(10);
		textFieldFelipedeGrupos.setBounds(457, 308, 234, 36);
		panelRegistro.add(textFieldFelipedeGrupos);
		PromptSupport.setPrompt("Ej: V-12345678", textFieldFelipedeGrupos);
		
		JLabel lblNombresector = new JLabel("Nombre/Sector del Grupo:");
		lblNombresector.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombresector.setBounds(238, 174, 200, 31);
		panelRegistro.add(lblNombresector);
		
		JLabel lblCodigo = new JLabel("Codigo del Grupo:");
		lblCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCodigo.setBounds(296, 221, 142, 31);
		panelRegistro.add(lblCodigo);
		
		JLabel lblFelipeDeGrupos = new JLabel("Felipe de Grupos/Red a Cargo del Grupo:");
		lblFelipeDeGrupos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFelipeDeGrupos.setBounds(139, 308, 308, 27);
		panelRegistro.add(lblFelipeDeGrupos);
		
		JLabel lblFelipeLider = new JLabel("Felipe Lider a Cargo del Grupo:");
		lblFelipeLider.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFelipeLider.setBounds(209, 264, 229, 31);
		panelRegistro.add(lblFelipeLider);
		
		JLabel lblNota = new JLabel("New label");
		lblNota.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/notificacion-registro_03.png")));
		lblNota.setBounds(238, 623, 523, 45);
		panelRegistro.add(lblNota);
		
		JButton btnRegistrar = new JButton("New button");
		btnRegistrar.setToolTipText("Los miembros de este nuevo grupo deben ser agregados individualmente, buscando cada miembro individualmente y relacionandolo al grupo.");
		
		
		btnRegistrar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/BotonRegistrar.JPG")));
		btnRegistrar.setBounds(570, 512, 324, 61);
		panelRegistro.add(btnRegistrar);
		
		JButton btnRegresar = new JButton("New button");
		btnRegresar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/BotonRegresar.JPG")));
		btnRegresar.setBounds(114, 512, 324, 61);
		panelRegistro.add(btnRegresar);
		
		JLabel lblWallpaperRegistro = new JLabel("");
		lblWallpaperRegistro.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Background.png")));
		lblWallpaperRegistro.setBounds(0, 66, 1008, 663);
		panelRegistro.add(lblWallpaperRegistro);
		
		JLabel lblHeaderRegistro = new JLabel("");
		lblHeaderRegistro.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Encabezado Registro Grupo.png")));
		lblHeaderRegistro.setBounds(0, 0, 1008, 67);
		panelRegistro.add(lblHeaderRegistro);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 1008, 729);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 68, 1008, 66);
		panelPrincipal.add(menuBar);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		mnRegistrar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/add-group-button.png")));
		menuBar.add(mnRegistrar);
		
		JMenu mnNewMenu = new JMenu("Modificar");
		mnNewMenu.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/group-editor.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRegresar = new JMenuItem("Regresar");
		mntmRegresar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/return.png")));
		menuBar.add(mntmRegresar);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(95, 159, 756, 533);
		panelPrincipal.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/slogan-transparente-2016.png")));
		
		JLabel lblHeader = new JLabel("header");
		lblHeader.setBounds(0, 0, 1008, 67);
		panelPrincipal.add(lblHeader);
		lblHeader.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Encabezado gestion grupos.png")));
		
		JLabel lblWallpaper = new JLabel("wallpaper");
		lblWallpaper.setBounds(0, 129, 1008, 600);
		panelPrincipal.add(lblWallpaper);
		lblWallpaper.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Background.png")));
		
		JPanel panelModificacion = new JPanel();
		panelModificacion.setBounds(0, 0, 1008, 729);
		contentPane.add(panelModificacion);
		panelModificacion.setLayout(null);
		
		JLabel label = new JLabel("Nombre/Sector del Grupo:");
		label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label.setBounds(238, 174, 200, 31);
		panelModificacion.add(label);
		
		textFieldNombreModif = new JTextField();
		textFieldNombreModif.setEnabled(false);
		textFieldNombreModif.setColumns(10);
		textFieldNombreModif.setBounds(457, 174, 234, 36);
		panelModificacion.add(textFieldNombreModif);
		
		JLabel label_1 = new JLabel("Codigo del Grupo:");
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_1.setBounds(296, 221, 142, 31);
		panelModificacion.add(label_1);
		
		textFieldGrupoModif = new JTextField();
		textFieldGrupoModif.setEnabled(false);
		textFieldGrupoModif.setColumns(10);
		textFieldGrupoModif.setBounds(457, 221, 234, 36);
		panelModificacion.add(textFieldGrupoModif);
		
		JLabel label_2 = new JLabel("Felipe Lider a Cargo del Grupo:");
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_2.setBounds(209, 264, 229, 31);
		panelModificacion.add(label_2);
		
		textFieldfelipeLiderModif = new JTextField();
		textFieldfelipeLiderModif.setEnabled(false);
		textFieldfelipeLiderModif.setColumns(10);
		textFieldfelipeLiderModif.setBounds(457, 264, 234, 36);
		panelModificacion.add(textFieldfelipeLiderModif);
		
		JLabel lbl_3 = new JLabel("Felipe de Grupos/Red a Cargo del Grupo:");
		lbl_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lbl_3.setBounds(139, 308, 308, 27);
		panelModificacion.add(lbl_3);
		
		textFieldFelipeGrupoModif = new JTextField();
		textFieldFelipeGrupoModif.setEnabled(false);
		textFieldFelipeGrupoModif.setColumns(10);
		textFieldFelipeGrupoModif.setBounds(457, 308, 234, 36);
		panelModificacion.add(textFieldFelipeGrupoModif);
		
		textFieldBusqueda = new JTextField();
		textFieldBusqueda.setBounds(457, 103, 234, 31);
		panelModificacion.add(textFieldBusqueda);
		textFieldBusqueda.setColumns(10);
		PromptSupport.setPrompt("Ej: 12345", textFieldBusqueda);
		
		JButton btnRegresar2 = new JButton("New button");
		btnRegresar2.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/BotonRegresar.JPG")));
		btnRegresar2.setBounds(114, 512, 324, 61);
		panelModificacion.add(btnRegresar2);
		
		JButton btnGuardar = new JButton("New button");
		btnGuardar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/BotonGuardarCambios.JPG")));
		btnGuardar.setToolTipText("Los miembros de este nuevo grupo deben ser agregados individualmente, buscando cada miembro individualmente y relacionandolo al grupo.");
		btnGuardar.setBounds(569, 512, 324, 61);
		panelModificacion.add(btnGuardar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/BotonBuscar.JPG")));
		btnBuscar.setBounds(724, 97, 154, 41);
		panelModificacion.add(btnBuscar);
		
		JLabel lblcualEsEl = new JLabel("\u00BFCual es el c\u00F3digo del grupo que va a ser editado?:");
		lblcualEsEl.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblcualEsEl.setBounds(68, 97, 355, 36);
		panelModificacion.add(lblcualEsEl);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Background.png")));
		lblBackground.setBounds(0, 66, 1008, 663);
		panelModificacion.add(lblBackground);
		
		JLabel lblHeaderModif = new JLabel("New label");
		lblHeaderModif.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/vainasarrechas/libs/Encabezadoodificargrupo.png")));
		lblHeaderModif.setBounds(0, 0, 1008, 67);
		panelModificacion.add(lblHeaderModif);
	}
}
