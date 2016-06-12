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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
	private JTextField textFieldFechaReporte;
	private JTextField textFieldCodigoGrupo;
	private JTextField textFieldFelipes;
	private JTextField textFieldEtiopes;
	private JTextField textFieldAmigos;
	private JTextField textFieldNinos;
	private JTextField textFieldAusentes;
	private JTextField textFieldConversionesAdultos;
	private JTextField textFieldConversionesNinos;
	private JTextField textFieldReconciliaciones;
	private JTextField textFieldDiezmos;
	private JTextField textFieldOfrenda;
	private JTextField textFieldOfrendaBus;
	private JTextField textFieldMisionamigo;
	private JTextField textFieldConsolidacion;
	private JTextField textFieldDiscipulado1;
	private JTextField textFieldHermanosDom;
	private JTextField textFieldAmigosDom;
	private JTextField textFieldNinosDom;
	private JTextField textFieldVEA;
	private JTextField textFieldEscuela;
	private JTextField textFieldVisitas;
	private JTextField textFieldOfrendaMisionera;
	private JTextField textFieldOfrendaNinos;
	private JTextField textField;
	private JTable tableListado;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/pequen_o-Pagina-2016.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 1008, 729);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 68, 1008, 66);
		panelPrincipal.add(menuBar);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		mnRegistrar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/add-group-button.png")));
		menuBar.add(mnRegistrar);
		
		JMenu mnNewMenu = new JMenu("Modificar");
		mnNewMenu.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/group-editor.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Agregar informes semanales");
		mnNewMenu_1.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/business-report.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnListar = new JMenu("Listar...");
		mnListar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/numbered-list.png")));
		menuBar.add(mnListar);
		
		JMenuItem mntmRegresar = new JMenuItem("Regresar");
		mntmRegresar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/return.png")));
		menuBar.add(mntmRegresar);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(95, 159, 756, 533);
		panelPrincipal.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/slogan-transparente-2016.png")));
		
		JLabel lblHeader = new JLabel("header");
		lblHeader.setBounds(0, 0, 1008, 67);
		panelPrincipal.add(lblHeader);
		lblHeader.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Encabezado gestion grupos.png")));
		
		JLabel lblWallpaper = new JLabel("wallpaper");
		lblWallpaper.setBounds(0, 129, 1008, 600);
		panelPrincipal.add(lblWallpaper);
		lblWallpaper.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		
		JPanel panelListado = new JPanel();
		panelListado.setBounds(0, 0, 1008, 729);
		contentPane.add(panelListado);
		panelListado.setLayout(null);
		
		JLabel lblHeader2 = new JLabel("New label");
		lblHeader2.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/EncabezadoListado.png")));
		lblHeader2.setBounds(0, 0, 1008, 67);
		panelListado.add(lblHeader2);
		
		JLabel lblNewLabel_2 = new JLabel("Listar por:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(150, 99, 75, 22);
		panelListado.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Codigo de grupo b\u00EDblico", "Felipe Lider", "Felipe de Grupos"}));
		comboBox.setBounds(237, 95, 234, 36);
		panelListado.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(481, 95, 234, 36);
		panelListado.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar3 = new JButton("");
		btnBuscar3.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonBuscar.JPG")));
		btnBuscar3.setBounds(735, 92, 154, 41);
		panelListado.add(btnBuscar3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 198, 776, 394);
		panelListado.add(scrollPane);
		
		tableListado = new JTable();
		scrollPane.setViewportView(tableListado);
		
		JButton buttonExportar = new JButton("");
		buttonExportar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonExportar.JPG")));
		buttonExportar.setBounds(553, 630, 324, 61);
		panelListado.add(buttonExportar);
		
		JButton buttonRegresar4 = new JButton("");
		buttonRegresar4.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		buttonRegresar4.setBounds(116, 630, 324, 61);
		panelListado.add(buttonRegresar4);
		
		JLabel labelWallpaper4 = new JLabel("");
		labelWallpaper4.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		labelWallpaper4.setBounds(0, 66, 1008, 663);
		panelListado.add(labelWallpaper4);
		
		JPanel panelInformes_1 = new JPanel();
		panelInformes_1.setBounds(0, 0, 1008, 729);
		contentPane.add(panelInformes_1);
		panelInformes_1.setLayout(null);
		
		JLabel lblHead4 = new JLabel("New label");
		lblHead4.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/EncabezadoInformes.png")));
		lblHead4.setBounds(0, 0, 1008, 67);
		panelInformes_1.add(lblHead4);
		
		JLabel lblCdigoDelGrupo = new JLabel("C\u00F3digo del grupo b\u00EDblico:");
		lblCdigoDelGrupo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCdigoDelGrupo.setBounds(188, 111, 174, 22);
		panelInformes_1.add(lblCdigoDelGrupo);
		
		textFieldCodigoGrupo = new JTextField();
		textFieldCodigoGrupo.setBounds(385, 110, 234, 31);
		panelInformes_1.add(textFieldCodigoGrupo);
		textFieldCodigoGrupo.setColumns(10);
		
		JButton btnBuscar2 = new JButton("");
		btnBuscar2.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonBuscar.JPG")));
		btnBuscar2.setBounds(653, 106, 154, 41);
		panelInformes_1.add(btnBuscar2);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFecha.setBounds(64, 214, 48, 14);
		panelInformes_1.add(lblFecha);
		
		textFieldFechaReporte = new JTextField();
		textFieldFechaReporte.setEditable(false);
		textFieldFechaReporte.setBounds(122, 206, 234, 36);
		panelInformes_1.add(textFieldFechaReporte);
		textFieldFechaReporte.setColumns(10);
		
		JLabel lblFelipes = new JLabel("Felipes:");
		lblFelipes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFelipes.setBounds(61, 272, 51, 22);
		panelInformes_1.add(lblFelipes);
		
		JLabel lblEtopes = new JLabel("Et\u00EDopes:");
		lblEtopes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblEtopes.setBounds(59, 320, 53, 22);
		panelInformes_1.add(lblEtopes);
		
		JLabel lblAmigos = new JLabel("Amigos:");
		lblAmigos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAmigos.setBounds(56, 370, 56, 22);
		panelInformes_1.add(lblAmigos);
		
		JLabel lblNios = new JLabel("Ni\u00F1os:");
		lblNios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNios.setBounds(66, 431, 46, 14);
		panelInformes_1.add(lblNios);
		
		JLabel lblAusentes = new JLabel("Ausentes:");
		lblAusentes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAusentes.setBounds(46, 478, 66, 22);
		panelInformes_1.add(lblAusentes);
		
		JLabel lblDiezmos = new JLabel("Diezmos:");
		lblDiezmos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDiezmos.setBounds(638, 374, 66, 14);
		panelInformes_1.add(lblDiezmos);
		
		JLabel lblOfrenda = new JLabel("Ofrenda:");
		lblOfrenda.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblOfrenda.setBounds(640, 431, 64, 14);
		panelInformes_1.add(lblOfrenda);
		
		JLabel lblOfrendaBus = new JLabel("Ofrenda Bus:");
		lblOfrendaBus.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblOfrendaBus.setBounds(610, 485, 89, 14);
		panelInformes_1.add(lblOfrendaBus);
		
		JLabel lblConversionesDeAdultos = new JLabel("Conversiones de Adultos:");
		lblConversionesDeAdultos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblConversionesDeAdultos.setBounds(522, 213, 189, 17);
		panelInformes_1.add(lblConversionesDeAdultos);
		
		JLabel lblConversionesDeNios = new JLabel("Conversiones de ni\u00F1os:");
		lblConversionesDeNios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblConversionesDeNios.setBounds(539, 276, 160, 14);
		panelInformes_1.add(lblConversionesDeNios);
		
		JLabel lblReconciliaciones = new JLabel("Reconciliaciones:");
		lblReconciliaciones.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblReconciliaciones.setBounds(582, 324, 117, 14);
		panelInformes_1.add(lblReconciliaciones);
		
		textFieldFelipes = new JTextField();
		textFieldFelipes.setEditable(false);
		textFieldFelipes.setBounds(122, 268, 234, 36);
		panelInformes_1.add(textFieldFelipes);
		textFieldFelipes.setColumns(10);
		
		textFieldEtiopes = new JTextField();
		textFieldEtiopes.setEditable(false);
		textFieldEtiopes.setBounds(122, 316, 234, 36);
		panelInformes_1.add(textFieldEtiopes);
		textFieldEtiopes.setColumns(10);
		
		textFieldAmigos = new JTextField();
		textFieldAmigos.setEditable(false);
		textFieldAmigos.setBounds(122, 366, 234, 36);
		panelInformes_1.add(textFieldAmigos);
		textFieldAmigos.setColumns(10);
		
		textFieldNinos = new JTextField();
		textFieldNinos.setEditable(false);
		textFieldNinos.setText("");
		textFieldNinos.setBounds(122, 423, 234, 36);
		panelInformes_1.add(textFieldNinos);
		textFieldNinos.setColumns(10);
		
		textFieldAusentes = new JTextField();
		textFieldAusentes.setEditable(false);
		textFieldAusentes.setText("");
		textFieldAusentes.setBounds(122, 474, 234, 36);
		panelInformes_1.add(textFieldAusentes);
		textFieldAusentes.setColumns(10);
		
		textFieldConversionesAdultos = new JTextField();
		textFieldConversionesAdultos.setEditable(false);
		textFieldConversionesAdultos.setBounds(722, 206, 234, 36);
		panelInformes_1.add(textFieldConversionesAdultos);
		textFieldConversionesAdultos.setColumns(10);
		
		textFieldConversionesNinos = new JTextField();
		textFieldConversionesNinos.setEditable(false);
		textFieldConversionesNinos.setBounds(722, 268, 234, 36);
		panelInformes_1.add(textFieldConversionesNinos);
		textFieldConversionesNinos.setColumns(10);
		
		textFieldReconciliaciones = new JTextField();
		textFieldReconciliaciones.setEditable(false);
		textFieldReconciliaciones.setBounds(722, 316, 234, 36);
		panelInformes_1.add(textFieldReconciliaciones);
		textFieldReconciliaciones.setColumns(10);
		
		textFieldDiezmos = new JTextField();
		textFieldDiezmos.setEditable(false);
		textFieldDiezmos.setBounds(722, 366, 234, 36);
		panelInformes_1.add(textFieldDiezmos);
		textFieldDiezmos.setColumns(10);
		
		textFieldOfrenda = new JTextField();
		textFieldOfrenda.setEditable(false);
		textFieldOfrenda.setBounds(722, 423, 234, 36);
		panelInformes_1.add(textFieldOfrenda);
		textFieldOfrenda.setColumns(10);
		
		textFieldOfrendaBus = new JTextField();
		textFieldOfrendaBus.setEditable(false);
		textFieldOfrendaBus.setBounds(722, 474, 234, 36);
		panelInformes_1.add(textFieldOfrendaBus);
		textFieldOfrendaBus.setColumns(10);
		
		JButton btnRegresar3 = new JButton("");
		btnRegresar3.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		btnRegresar3.setBounds(116, 563, 324, 61);
		panelInformes_1.add(btnRegresar3);
		
		JButton btnSiguiente = new JButton("New button");
		btnSiguiente.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonSiguiente.jpg")));
		btnSiguiente.setBounds(571, 563, 324, 61);
		panelInformes_1.add(btnSiguiente);
		
		JLabel lblWallpaper2 = new JLabel("");
		lblWallpaper2.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpaper2.setBounds(0, 69, 1008, 660);
		panelInformes_1.add(lblWallpaper2);
		
		JPanel panelInformes_2 = new JPanel();
		panelInformes_2.setBounds(0, 0, 1008, 729);
		contentPane.add(panelInformes_2);
		panelInformes_2.setLayout(null);
		
		JLabel labelHead = new JLabel("");
		labelHead.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/EncabezadoInformes.png")));
		labelHead.setBounds(0, 0, 1008, 67);
		panelInformes_2.add(labelHead);
		
		JLabel lblMisinAmigo = new JLabel("Misi\u00F3n Amigo:");
		lblMisinAmigo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblMisinAmigo.setBounds(88, 141, 100, 22);
		panelInformes_2.add(lblMisinAmigo);
		
		JLabel lblNewLabel = new JLabel("Consolidaci\u00F3n:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel.setBounds(88, 194, 101, 14);
		panelInformes_2.add(lblNewLabel);
		
		JLabel lblDiscipulado = new JLabel("Discipulado 1:");
		lblDiscipulado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDiscipulado.setBounds(88, 254, 100, 22);
		panelInformes_2.add(lblDiscipulado);
		
		JLabel lblAsisDomHermanos = new JLabel("Asis. Dom. Hermanos:");
		lblAsisDomHermanos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAsisDomHermanos.setBounds(38, 315, 151, 14);
		panelInformes_2.add(lblAsisDomHermanos);
		
		JLabel lblAsisDomAmigos = new JLabel("Asis. Dom. Amigos:");
		lblAsisDomAmigos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAsisDomAmigos.setBounds(56, 372, 132, 22);
		panelInformes_2.add(lblAsisDomAmigos);
		
		JLabel lblAsisDomNios = new JLabel("Asis. Dom. Ni\u00F1os:");
		lblAsisDomNios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAsisDomNios.setBounds(70, 437, 132, 14);
		panelInformes_2.add(lblAsisDomNios);
		
		JLabel lblAsisDomVea = new JLabel("Asis. V.E.A:");
		lblAsisDomVea.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAsisDomVea.setBounds(650, 149, 72, 14);
		panelInformes_2.add(lblAsisDomVea);
		
		JLabel lblAsisEscuelaDe = new JLabel("Asis. Escuela de Liderazgo:");
		lblAsisEscuelaDe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAsisEscuelaDe.setBounds(540, 190, 182, 22);
		panelInformes_2.add(lblAsisEscuelaDe);
		
		JLabel lblNewLabel_1 = new JLabel("Visitas realizadas:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(596, 258, 126, 14);
		panelInformes_2.add(lblNewLabel_1);
		
		JLabel lblOfrendaMisionera = new JLabel("Ofrenda misionera:");
		lblOfrendaMisionera.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblOfrendaMisionera.setBounds(589, 315, 133, 14);
		panelInformes_2.add(lblOfrendaMisionera);
		
		JLabel lblOfrendaNios = new JLabel("Ofrenda Ni\u00F1os:");
		lblOfrendaNios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblOfrendaNios.setBounds(617, 376, 105, 14);
		panelInformes_2.add(lblOfrendaNios);
		
		textFieldMisionamigo = new JTextField();
		textFieldMisionamigo.setBounds(212, 137, 234, 36);
		panelInformes_2.add(textFieldMisionamigo);
		textFieldMisionamigo.setColumns(10);
		
		textFieldConsolidacion = new JTextField();
		textFieldConsolidacion.setBounds(212, 186, 234, 36);
		panelInformes_2.add(textFieldConsolidacion);
		textFieldConsolidacion.setColumns(10);
		
		textFieldDiscipulado1 = new JTextField();
		textFieldDiscipulado1.setText("");
		textFieldDiscipulado1.setBounds(212, 246, 234, 36);
		panelInformes_2.add(textFieldDiscipulado1);
		textFieldDiscipulado1.setColumns(10);
		
		textFieldHermanosDom = new JTextField();
		textFieldHermanosDom.setBounds(212, 307, 234, 36);
		panelInformes_2.add(textFieldHermanosDom);
		textFieldHermanosDom.setColumns(10);
		
		textFieldAmigosDom = new JTextField();
		textFieldAmigosDom.setText("");
		textFieldAmigosDom.setBounds(212, 368, 234, 36);
		panelInformes_2.add(textFieldAmigosDom);
		textFieldAmigosDom.setColumns(10);
		
		textFieldNinosDom = new JTextField();
		textFieldNinosDom.setText("");
		textFieldNinosDom.setBounds(212, 429, 234, 36);
		panelInformes_2.add(textFieldNinosDom);
		textFieldNinosDom.setColumns(10);
		
		textFieldVEA = new JTextField();
		textFieldVEA.setBounds(740, 137, 234, 36);
		panelInformes_2.add(textFieldVEA);
		textFieldVEA.setColumns(10);
		
		textFieldEscuela = new JTextField();
		textFieldEscuela.setText("");
		textFieldEscuela.setBounds(740, 186, 234, 36);
		panelInformes_2.add(textFieldEscuela);
		textFieldEscuela.setColumns(10);
		
		textFieldVisitas = new JTextField();
		textFieldVisitas.setBounds(740, 250, 234, 36);
		panelInformes_2.add(textFieldVisitas);
		textFieldVisitas.setColumns(10);
		
		textFieldOfrendaMisionera = new JTextField();
		textFieldOfrendaMisionera.setBounds(740, 307, 234, 36);
		panelInformes_2.add(textFieldOfrendaMisionera);
		textFieldOfrendaMisionera.setColumns(10);
		
		textFieldOfrendaNinos = new JTextField();
		textFieldOfrendaNinos.setText("");
		textFieldOfrendaNinos.setBounds(740, 368, 234, 36);
		panelInformes_2.add(textFieldOfrendaNinos);
		textFieldOfrendaNinos.setColumns(10);
		
		JButton buttonGuardar = new JButton("");
		buttonGuardar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonGuardarInforme.JPG")));
		buttonGuardar.setBounds(571, 563, 324, 61);
		panelInformes_2.add(buttonGuardar);
		
		JButton buttonRegresar = new JButton("");
		buttonRegresar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		buttonRegresar.setBounds(116, 563, 324, 61);
		panelInformes_2.add(buttonRegresar);
		
		JLabel labelAdvise = new JLabel("");
		labelAdvise.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/notification_u4i_03.png")));
		labelAdvise.setBounds(240, 664, 519, 41);
		panelInformes_2.add(labelAdvise);
		
		JLabel lblWallpaper3 = new JLabel("");
		lblWallpaper3.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpaper3.setBounds(0, 67, 1008, 662);
		panelInformes_2.add(lblWallpaper3);
		
		JPanel panelModificacion = new JPanel();
		panelModificacion.setBounds(0, 0, 1008, 729);
		contentPane.add(panelModificacion);
		panelModificacion.setLayout(null);
		
		JLabel lblcualEsEl = new JLabel("\u00BFCual es el c\u00F3digo del grupo que va a ser editado?:");
		lblcualEsEl.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblcualEsEl.setBounds(68, 97, 355, 36);
		panelModificacion.add(lblcualEsEl);
		
		JLabel lblestatusDelGrupo = new JLabel("\u00BFEstatus del grupo?:");
		lblestatusDelGrupo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblestatusDelGrupo.setBounds(284, 360, 142, 22);
		panelModificacion.add(lblestatusDelGrupo);
		
		JLabel lblNombre = new JLabel("Nombre/Sector del Grupo:");
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombre.setBounds(238, 174, 200, 31);
		panelModificacion.add(lblNombre);
		
		JLabel lblCodigo2 = new JLabel("Codigo del Grupo:");
		lblCodigo2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCodigo2.setBounds(296, 221, 142, 31);
		panelModificacion.add(lblCodigo2);
		
		JLabel lblFelipeLider2 = new JLabel("Felipe Lider a Cargo del Grupo:");
		lblFelipeLider2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFelipeLider2.setBounds(209, 264, 229, 31);
		panelModificacion.add(lblFelipeLider2);
		
		JLabel lblFelipeGrupos2 = new JLabel("Felipe de Grupos/Red a Cargo del Grupo:");
		lblFelipeGrupos2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFelipeGrupos2.setBounds(139, 308, 308, 27);
		panelModificacion.add(lblFelipeGrupos2);
		
		textFieldNombreModif = new JTextField();
		textFieldNombreModif.setEnabled(false);
		textFieldNombreModif.setColumns(10);
		textFieldNombreModif.setBounds(457, 174, 234, 36);
		panelModificacion.add(textFieldNombreModif);
		
		textFieldGrupoModif = new JTextField();
		textFieldGrupoModif.setEnabled(false);
		textFieldGrupoModif.setColumns(10);
		textFieldGrupoModif.setBounds(457, 221, 234, 36);
		panelModificacion.add(textFieldGrupoModif);
		
		textFieldfelipeLiderModif = new JTextField();
		textFieldfelipeLiderModif.setEnabled(false);
		textFieldfelipeLiderModif.setColumns(10);
		textFieldfelipeLiderModif.setBounds(457, 264, 234, 36);
		panelModificacion.add(textFieldfelipeLiderModif);
		
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
		btnRegresar2.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		btnRegresar2.setBounds(114, 512, 324, 61);
		panelModificacion.add(btnRegresar2);
		
		JButton btnGuardar = new JButton("New button");
		btnGuardar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonGuardarCambios.JPG")));
		btnGuardar.setToolTipText("Los miembros de este nuevo grupo deben ser agregados individualmente, buscando cada miembro individualmente y relacionandolo al grupo.");
		btnGuardar.setBounds(569, 512, 324, 61);
		panelModificacion.add(btnGuardar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonBuscar.JPG")));
		btnBuscar.setBounds(724, 97, 154, 41);
		panelModificacion.add(btnBuscar);
		
		JComboBox comboBoxStatus = new JComboBox();
		comboBoxStatus.setBounds(457, 355, 234, 36);
		panelModificacion.add(comboBoxStatus);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblBackground.setBounds(0, 66, 1008, 663);
		panelModificacion.add(lblBackground);
		
		JLabel lblHeaderModif = new JLabel("New label");
		lblHeaderModif.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Encabezadoodificargrupo.png")));
		lblHeaderModif.setBounds(0, 0, 1008, 67);
		panelModificacion.add(lblHeaderModif);
		
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
		lblNota.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/notificacion-registro_03.png")));
		lblNota.setBounds(238, 623, 523, 45);
		panelRegistro.add(lblNota);
		
		JButton btnRegistrar = new JButton("New button");
		btnRegistrar.setToolTipText("Los miembros de este nuevo grupo deben ser agregados individualmente, buscando cada miembro individualmente y relacionandolo al grupo.");
		
		
		btnRegistrar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegistrar.JPG")));
		btnRegistrar.setBounds(570, 512, 324, 61);
		panelRegistro.add(btnRegistrar);
		
		JButton btnRegresar = new JButton("New button");
		btnRegresar.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/BotonRegresar.JPG")));
		btnRegresar.setBounds(114, 512, 324, 61);
		panelRegistro.add(btnRegresar);
		
		JLabel lblWallpaperRegistro = new JLabel("");
		lblWallpaperRegistro.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Background.png")));
		lblWallpaperRegistro.setBounds(0, 66, 1008, 663);
		panelRegistro.add(lblWallpaperRegistro);
		
		JLabel lblHeaderRegistro = new JLabel("");
		lblHeaderRegistro.setIcon(new ImageIcon(GestionGrupoBiblico.class.getResource("/com/planfelipe/imagenes/Encabezado Registro Grupo.png")));
		lblHeaderRegistro.setBounds(0, 0, 1008, 67);
		panelRegistro.add(lblHeaderRegistro);
	}
}
