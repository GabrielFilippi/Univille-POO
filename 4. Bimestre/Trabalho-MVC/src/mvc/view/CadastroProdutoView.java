package mvc.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.control.CadastroProdutoControl;
import mvc.model.ProdutoModel;
import mvc.util.Observer;
import mvc.util.Subject;

public class CadastroProdutoView extends JFrame implements Observer{

	private ProdutoModel model;
	private CadastroProdutoControl control;
	
	private JTextField idTextField;
	private JTextField nomeTextField;
	private JTextField precoTextField;
	private JTextField quantidadeTextField;
	private JButton    salvarButton;
	private JButton    deletarButton;
	private JLabel statusLabel;
	
	public CadastroProdutoView() {
		// Titulo Janela
		setTitle("CADASTRAR PROTUDO");
		// Tamanho Janela
		setSize(400,280);
		// Configura local inicial
		setLocation(1366/2 -400/2, 768/2 - 280/2);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildLayout();
	}
	
	public void setModel(ProdutoModel model) {
		this.model = model;
	}
	
	public void setControl(CadastroProdutoControl control) {
		this.control = control;
	}

	private void buildLayout() {
		JPanel root = new JPanel();
		root.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20), BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("FORMULÁRIO"),BorderFactory.createEmptyBorder(10, 10, 10, 10))));

		idTextField = new JTextField(20);
		idTextField.setEnabled(false);
		nomeTextField = new JTextField(20);
		precoTextField = new JTextField(20);
		quantidadeTextField = new JTextField(20);
		//botão de salvar
		salvarButton = new JButton("Salvar");
		salvarButton.addActionListener(e -> salvar());
		
		//botão de deletar
		deletarButton = new JButton("Deletar");
		deletarButton.setEnabled(true);
		deletarButton.addActionListener(e -> deletar());
		
		//Campo ID
		JLabel l = new JLabel("ID",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(70,16));
		panel.add(l);
		panel.add(idTextField);
		
		l = new JLabel("Nome",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(70,16));
		panel.add(l);
		panel.add(nomeTextField);
		
		l = new JLabel("Preço",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(70,16));
		panel.add(l);
		panel.add(precoTextField);
		
		l = new JLabel("QTD",JLabel.RIGHT);
		l.setPreferredSize(new Dimension(70,16));
		panel.add(l);
		panel.add(quantidadeTextField);
		
		panel.add(salvarButton);
		panel.add(deletarButton);
		
		JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		statusPanel.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 10));
		statusLabel = new JLabel("");
		statusPanel.add(statusLabel);
		
		root.add(statusPanel,BorderLayout.SOUTH);
		root.add(panel,BorderLayout.CENTER);
		
		add(root);
	}
	
	private void exibirDados() {
		idTextField.setText(Integer.toString(model.getId()));
		nomeTextField.setText(model.getNome());	
		precoTextField.setText(Float.toString(model.getPreco()));
		quantidadeTextField.setText(Integer.toString(model.getQuantidade()));
	}
	
	private void salvar() {
		control.salvar();
	}
	
	private void deletar() {
		control.deletar();
	}
	
	public JButton getBotaoDeletar() {
		return deletarButton;
	}

	public void setMensagemStatusBar(String text) {
		statusLabel.setText(text);
	}

	@Override
	public void update(Subject s, Object o) {
		model = (ProdutoModel) o;
		exibirDados();
	}
	
	public String getNome() {
		return nomeTextField.getText();
	}
	
	public int getQuantidade() {
		return Integer.parseInt(quantidadeTextField.getText());
	}
	
	public float getPreco() {
		return Float.parseFloat(precoTextField.getText());
	}
	
}
