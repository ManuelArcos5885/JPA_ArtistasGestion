package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorAlumno;
import model.Artista;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox_Artistas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("TITULO");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 9;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Artista> as = ControladorAlumno.findByLikeNombre(textField.getText());
				mostrarArtistas(as);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 7;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		comboBox_Artistas = new JComboBox();
		GridBagConstraints gbc_comboBox_Artistas = new GridBagConstraints();
		gbc_comboBox_Artistas.gridwidth = 3;
		gbc_comboBox_Artistas.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Artistas.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Artistas.gridx = 1;
		gbc_comboBox_Artistas.gridy = 2;
		contentPane.add(comboBox_Artistas, gbc_comboBox_Artistas);
		
		JButton btnNewButton_1 = new JButton("Mostrar Datos");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 7;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		
		
		ButtonGroup grupoOpciones = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 5;
		grupoOpciones.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 1;
		gbc_rdbtnNewRadioButton_1.gridy = 6;
		grupoOpciones.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 1;
		gbc_rdbtnNewRadioButton_2.gridy = 7;
		grupoOpciones.add(rdbtnNewRadioButton_2);
		contentPane.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JButton btnNewButton_2 = new JButton("Mostrar Panel Dialog");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				// El usuario no puede redimensionar el diálogo
				dialogo.setResizable(true);
				// título del díalogo
				dialogo.setTitle("Seleccion entre 3 opciones");
				// Introducimos el panel creado sobre el diálogo
				dialogo.setContentPane(new PanelImplementadoDialog());
				// Empaquetar el di�logo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
				dialogo.pack();
				// El usuario no puede hacer clic sobre la ventana padre, si el Di�logo es modal
				dialogo.setModal(true);
				// Centro el di�logo en pantalla
				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
				// Muestro el di�logo en pantalla
				dialogo.setVisible(true);
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 8;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.gridwidth = 9;
		gbc_splitPane.insets = new Insets(0, 0, 0, 5);
		gbc_splitPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 9;
		contentPane.add(splitPane, gbc_splitPane);
	}
	
	
	/**
	 * 
	 */
	private void mostrarArtistas(List<Artista> as) {
		comboBox_Artistas.removeAllItems();
		
		 
		for (Artista a : as) {
			this.comboBox_Artistas.addItem(a);
		}
	}

}
