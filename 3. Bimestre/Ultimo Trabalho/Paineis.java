
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import gerenciadoresLayouts.GridLayoutExemplo;

public class Paineis extends JFrame{


    /**
     * FlowLayout adiciona componentes a esquerda
     */
    public Paineis()
    {
        super("GridLayout");

        // Adiciona o gerenciador GridLayout ( linhas, colunas )
        setLayout( new GridLayout(1,2, 100, 100));

        //Cria o painel do checkbox
        JPanel primeiro = criarPanel(new Color(140, 121, 217), null, 200, 200);
        primeiro.setLayout(new BoxLayout(primeiro, BoxLayout.PAGE_AXIS));
        primeiro.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


		JCheckBox r1 = new JCheckBox("Norte");
		r1.setSelected(true);
        primeiro.add(r1);
        JCheckBox r2 = new JCheckBox("Sul");
        r2.setSelected(true);
		primeiro.add(r2);
		JCheckBox r3 = new JCheckBox("Centro");
		r3.setSelected(true);
		primeiro.add(r3);
		JCheckBox r4 = new JCheckBox("Leste");
		r4.setSelected(true);
		primeiro.add(r4);
		JCheckBox r5 = new JCheckBox("Oeste");
		r5.setSelected(true);
		primeiro.add(r5);


		//Cria o painel das div
        JPanel segundo = criarPanel(null, null, 600, 600);
        segundo.setLayout( new BorderLayout(10,10));
        //Cria os paineis da segunda div
        JPanel norte = criarPanel2(Color.RED,"Norte");

        JPanel leste = criarPanel2(Color.YELLOW,"Leste");
        JPanel oeste = criarPanel2(Color.BLUE,"Oeste");
        JPanel sul = criarPanel2(Color.WHITE,"Sul");
        JPanel centro = criarPanel2(Color.GREEN,"Centro");

      //actions dos checkbox
	    r1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				norte.setVisible(r1.isSelected());
			}
		});
	    r2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sul.setVisible(r2.isSelected());
			}
		});
	    r3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				centro.setVisible(r3.isSelected());
			}
		});
	    r4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				leste.setVisible(r4.isSelected());
			}
		});
	    r5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				oeste.setVisible(r5.isSelected());
			}
		});

        // Adiciona o painel no norte
        segundo.add(norte, BorderLayout.NORTH);
        // Adiciona o painel no sul
        segundo.add(sul, BorderLayout.SOUTH);
        // Adiciona o painel no leste
        segundo.add(leste, BorderLayout.EAST);
        // Adiciona o painel no oeste
        segundo. add(oeste, BorderLayout.WEST);
        // Adiciona o painel no centro
        segundo.add(centro, BorderLayout.CENTER);

        add(primeiro);
        add(segundo);
    }

    private JPanel criarPanel(Color color, String texto, int dimensionX, int dimensionY) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	panel.setPreferredSize(new Dimension(dimensionX, dimensionY));
    	return panel;
    }

 // Cria um painel com a cor de fundo e um label
    private JPanel criarPanel2(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	return panel;
    }


    public static void main(String[] args) {
    	Paineis border = new Paineis();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(1000,1000);
        border.setVisible(true);
	}

}
