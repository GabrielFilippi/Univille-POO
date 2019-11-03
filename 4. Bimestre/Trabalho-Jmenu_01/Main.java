
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setTitle("Conversor Universal");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		JPanel painel = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		
		// Cria o menu Arquivo
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		
		// Cria os itens do menu
		JMenuItem item = new JMenuItem("Sair",KeyEvent.VK_I);
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Fecha a tela
				//frame.setVisible(false);
				//frame.dispose();
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		menuArquivo.add(item);
		
		JMenu menuConfigs = new JMenu("Editar");
		JMenuItem limparCampos = new JMenuItem("Limpar Campos");
		
		

		JCheckBoxMenuItem chkMoedas = new JCheckBoxMenuItem("Exibir Moedas");
		JCheckBoxMenuItem chkTemperatura = new JCheckBoxMenuItem("Exibir Temperaturas");
		JCheckBoxMenuItem chkComprimento = new JCheckBoxMenuItem("Exibir Comprimentos");
		chkMoedas.setSelected(true);
		chkTemperatura.setSelected(true);
		chkComprimento.setSelected(true);
		
		menuConfigs.add(limparCampos);
		menuConfigs.addSeparator();
		menuConfigs.add(chkMoedas);
		menuConfigs.add(chkTemperatura);
		menuConfigs.add(chkComprimento);
		
		JMenu menu2 = new JMenu("Ajuda");
		JMenuItem ajdDesenvolvedores = new JMenuItem("Desenvolvedores");
		JMenuItem ajdRepGit = new JMenuItem("Repositório GitHub");
		JMenuItem ajdSobre = new JMenuItem("Sobre");
		
		
		menu2.add(ajdDesenvolvedores);
		menu2.add(ajdRepGit);
		menu2.add(ajdSobre);
		
		// Adicina o menu na barra
		menuBar.add(menuArquivo);
		menuBar.add(menuConfigs);
		menuBar.add(menu2);
		
		//Adiciona Menu Bar
		frame.setJMenuBar(menuBar);
		
		
		
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab("Moeda", criarPanelMoeda());
		tabPane.addTab("Temperatura", criarPanelTemperatura());
		tabPane.addTab("Comprimento", criarPanelComprimento());
		
		
		frame.add(tabPane);
		frame.pack();
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();
	}
	
	private static Component criarPanelComprimento() {
		Dimension tamanhoPreferido = new Dimension(200,30);
		String itensMoeda [] = {"Quilometros","Metros","Milimetros"};
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
    	panel.setPreferredSize(new Dimension(600, 400));
		
		JLabel label1 = new JLabel();
		label1.setText("De:");
		
		JComboBox<String> comboBox1 = new JComboBox<String>(itensMoeda);
		comboBox1.setPreferredSize(tamanhoPreferido);
		
		JTextField value1 = new JTextField();
		value1.setPreferredSize(tamanhoPreferido);
		
		JLabel label2 = new JLabel();
		label2.setText("Para:");
		
		JComboBox<String> comboBox2 = new JComboBox<String>(itensMoeda);
		comboBox2.setPreferredSize(tamanhoPreferido);
		
		JTextField value2 = new JTextField();
		value2.setPreferredSize(tamanhoPreferido);
		
		JButton btnConverte = new JButton("Converter");
		btnConverte.setPreferredSize(tamanhoPreferido);
		
		btnConverte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ":D");
			}
		});
		
		
		panel.add(label1);
		panel.add(comboBox1);
		panel.add(value1);
		panel.add(label2);
		panel.add(comboBox2);
		panel.add(value2);
		panel.add(btnConverte);
		
		return panel;
	}

	private static Component criarPanelTemperatura() {
		Dimension tamanhoPreferido = new Dimension(200,30);
		String itensMoeda [] = {"CELSIUS","FAHRENHEIT","KELVIN", "RANKINE"};
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
    	panel.setPreferredSize(new Dimension(600, 400));
		
		JLabel label1 = new JLabel();
		label1.setText("De:");
		
		JComboBox<String> comboBox1 = new JComboBox<String>(itensMoeda);
		comboBox1.setPreferredSize(tamanhoPreferido);
		
		JTextField value1 = new JTextField();
		value1.setPreferredSize(tamanhoPreferido);
		
		JLabel label2 = new JLabel();
		label2.setText("Para:");
		
		JComboBox<String> comboBox2 = new JComboBox<String>(itensMoeda);
		comboBox2.setPreferredSize(tamanhoPreferido);
		
		JTextField value2 = new JTextField();
		value2.setPreferredSize(tamanhoPreferido);
		
		JButton btnConverte = new JButton("Converter");
		btnConverte.setPreferredSize(tamanhoPreferido);
		
		btnConverte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ":D");
			}
		});
		
		
		panel.add(label1);
		panel.add(comboBox1);
		panel.add(value1);
		panel.add(label2);
		panel.add(comboBox2);
		panel.add(value2);
		panel.add(btnConverte);
		
		return panel;
	}

	private static Component criarPanelMoeda() {
		
		Dimension tamanhoPreferido = new Dimension(200,30);
		String itensMoeda [] = {"Real (BRL)","Dólar Americano (USD)","Dólar Canadense (CAD)", "Euro (EUR)"};
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
    	panel.setPreferredSize(new Dimension(600, 400));
		
		JLabel label1 = new JLabel();
		label1.setText("De:");
		
		JComboBox<String> comboBox1 = new JComboBox<String>(itensMoeda);
		comboBox1.setPreferredSize(tamanhoPreferido);
		JTextField value1 = new JTextField();
		value1.setPreferredSize(tamanhoPreferido);
		
		JLabel label2 = new JLabel();
		label2.setText("Para:");
		
		JComboBox<String> comboBox2 = new JComboBox<String>(itensMoeda);
		comboBox2.setPreferredSize(tamanhoPreferido);
		
		JTextField value2 = new JTextField();
		value2.setPreferredSize(tamanhoPreferido);
		
		JButton btnConverte = new JButton("Converter");
		btnConverte.setPreferredSize(tamanhoPreferido);
		
		btnConverte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ":D");
			}
		});
		
		
		panel.add(label1);
		panel.add(comboBox1);
		panel.add(value1);
		panel.add(label2);
		panel.add(comboBox2);
		panel.add(value2);
		panel.add(btnConverte);
		
		return panel;
	}

}
