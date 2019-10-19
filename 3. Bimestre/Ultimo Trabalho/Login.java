import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
public class Login {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension tamanhoPreferido = new Dimension(200, 20);

		JPanel painel = new JPanel();
		// Borda sem linha, funciona como margens
		painel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

		JPanel bordaComTitulo = new JPanel();
		bordaComTitulo.setBorder(BorderFactory.createTitledBorder(" LOGIN "));
		bordaComTitulo.setPreferredSize(new Dimension(400,400));


		JLabel labelUserName = new JLabel();
		labelUserName.setText("Usu�rio:");
		labelUserName.setPreferredSize(tamanhoPreferido);

		JTextField userName = new JTextField();
		userName.setPreferredSize(tamanhoPreferido);

		JLabel labelUserPass = new JLabel();
		labelUserPass.setText("Usu�rio:");
		labelUserPass.setPreferredSize(tamanhoPreferido);

		JPasswordField userPass = new JPasswordField();
		userPass.setPreferredSize(tamanhoPreferido);

		JButton buttonLogin = new JButton();
		buttonLogin.setText("Acessar");
		buttonLogin.setPreferredSize(tamanhoPreferido);

		buttonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Acessado!");
			}
		});

		JCheckBox RadiomanterAcessado = new JCheckBox("Manter Acessado");
		RadiomanterAcessado.setBounds(100, 100, 100, 100);

		JButton buttonSenha = new JButton();
		buttonSenha.setText("Esqueci minha senha");
		buttonSenha.setPreferredSize(tamanhoPreferido);
		buttonSenha.setBorder(null);
		buttonSenha.setBackground(new Color(0,0,0,0));
		buttonSenha.setFont(new Font("Calibri", 1, 18));
		buttonSenha.setForeground(new Color(140, 121, 217));

		painel.add(bordaComTitulo);
		bordaComTitulo.add(labelUserName);
		bordaComTitulo.add(userName);
		bordaComTitulo.add(labelUserPass);
		bordaComTitulo.add(userPass);
		bordaComTitulo.add(buttonLogin);
		bordaComTitulo.add(RadiomanterAcessado);
		bordaComTitulo.add(buttonSenha);


		frame.add(painel);


		frame.show();

	}


}
