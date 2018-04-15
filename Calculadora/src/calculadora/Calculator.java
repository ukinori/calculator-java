package calculadora;

import java.awt.Color;
import java.lang.String;

import java.awt.ComponentOrientation;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import operacoes.Operacoes;
import operacoes.Memory;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
	
	public Calculator() {
		super("Calculadora");
		
		//MENU DO TOPO (SEPARADO NA PARTE DE CIMA PARA FACILITAR MANUTENÇÃO)
		JMenuBar menu = new JMenuBar();
		JMenu exibir = new JMenu( "Exibir" );
		JMenu editar = new JMenu( "Editar" );
		JMenu ajuda = new JMenu( "Ajuda" );
		menu.add(exibir);
		menu.add(editar);
		menu.add(ajuda);
		super.setJMenuBar(menu);
		
		JMenuItem padrao = new JMenuItem("Padrão");
		JMenuItem cientifica = new JMenuItem("Científica");
		exibir.add(padrao);
		exibir.add(cientifica);
		
		JTextField txtVisor = new JTextField();
		JButton btMC = new JButton("MC");
		JButton btMR = new JButton("MR");
		JButton btMS = new JButton("MS");
		JButton btMais = new JButton("M+");
		JButton btMenos = new JButton("M-");
		JButton btApagar = new JButton("←");
		JButton btCE = new JButton("CE");
		JButton btC = new JButton("C");
		JButton btMaisMenos = new JButton("±");
		JButton btRadic = new JButton("√");
		JButton btDivisao = new JButton("/");
		JButton btPorcento = new JButton("%");
		JButton btMultiplicacao = new JButton("*");
		JButton bt1X = new JButton("1/x");
		JButton btSubtracao = new JButton("-");
		JButton btAdicao = new JButton("+");
		JButton btResultado = new JButton("=");
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton bt4 = new JButton("4");
		JButton bt5 = new JButton("5");
		JButton bt6 = new JButton("6");
		JButton bt7 = new JButton("7");
		JButton bt8 = new JButton("8");
		JButton bt9 = new JButton("9");
		JButton bt0 = new JButton("0");
		JButton btDecimal = new JButton(",");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		Operacoes mat = new Operacoes();
		
		txtVisor.setBounds(15, 13, 196, 50);
		txtVisor.setFont( new Font( "Arial", Font.PLAIN, 20 ) );
		txtVisor.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		pane.add(txtVisor);
		
		txtVisor.setText("0");
	
		//1ª LINHA

		Memory m = new Memory();
		
		btMC.setBounds(15, 70, 35, 30);
		btMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMC.setMargin(new Insets(1,1,1,1));
		btMC.setContentAreaFilled(false);
		pane.add(btMC);
		
		btMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.MS = 0;
			}
		});
		
		btMR.setBounds(55, 70, 35, 30);
		btMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMR.setMargin(new Insets(1,1,1,1));
		btMR.setContentAreaFilled(false);
		pane.add(btMR);
		
		btMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(m.MS + "");
			}
		});
		
		btMS.setBounds(95, 70, 35, 30);
		btMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMS.setMargin(new Insets(1,1,1,1));
		btMS.setContentAreaFilled(false);
		pane.add(btMS);
		
		btMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.MS = Double.parseDouble(txtVisor.getText());
			}
		});
		
		btMais.setBounds(135, 70, 35, 30);
		btMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMais.setMargin(new Insets(1,1,1,1));
		btMais.setContentAreaFilled(false);
		pane.add(btMais);
		
		btMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.MS = m.MS + Double.parseDouble(txtVisor.getText());
			}
		});
		
		btMenos.setBounds(175, 70, 35, 30);
		btMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMenos.setMargin(new Insets(1,1,1,1));
		btMenos.setContentAreaFilled(false);
		pane.add(btMenos);
		
		btMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.MS = m.MS - Double.parseDouble(txtVisor.getText());
			}
		});
		
		//2ª LINHA
		btApagar.setBounds(15, 105, 35, 30);
		btApagar.setFont( new Font( "Arial", Font.PLAIN, 22 ) );
		btApagar.setMargin(new Insets(1,1,1,1));
		pane.add(btApagar);
		
		btCE.setBounds(55, 105, 35, 30);
		btCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btCE.setMargin(new Insets(1,1,1,1));
		pane.add(btCE);
		
		btCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btC.setBounds(95, 105, 35, 30);
		btC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btC.setMargin(new Insets(1,1,1,1));
		pane.add(btC);
		
		btC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
				mat.n1 = 0;
			}
		});
		
		btMaisMenos.setBounds(135, 105, 35, 30);
		btMaisMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMaisMenos.setMargin(new Insets(1,1,1,1));
		pane.add(btMaisMenos);
		
		btMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.operacao = "maismenos";
				mat.n1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.MaisMenos(mat.n1)+"");
			}
		});
		
		btRadic.setBounds(175, 105, 35, 30);
		btRadic.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btRadic.setMargin(new Insets(1,1,1,1));
		pane.add(btRadic);
		
		btRadic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "raiz";
				txtVisor.setText(mat.Raiz(mat.n1)+"");
			}
		});
		
		
		//3ª LINHA
		bt7.setBounds(15, 140, 35, 30);
		bt7.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt7.setMargin(new Insets(1,1,1,1));
		bt7.setBackground(Color.white);
		pane.add(bt7);
		
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "7");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("7");
				}	
			}
		});
		
		bt8.setBounds(55, 140, 35, 30);
		bt8.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt8.setMargin(new Insets(1,1,1,1));
		bt8.setBackground(Color.white);
		pane.add(bt8);
		
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "8");
					
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("8");
					
				}	
			}
		});
		
		bt9.setBounds(95, 140, 35, 30);
		bt9.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt9.setMargin(new Insets(1,1,1,1));
		bt9.setBackground(Color.white);
		pane.add(bt9);
		
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "9");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("9");
				}	
			}
		});
		
		btDivisao.setBounds(135, 140, 35, 30);
		btDivisao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btDivisao.setMargin(new Insets(1,1,1,1));
		pane.add(btDivisao);
		
		btDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "divisao";
				txtVisor.setText("0");
			}
		});
		
		btPorcento.setBounds(175, 140, 35, 30);
		btPorcento.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btPorcento.setMargin(new Insets(1,1,1,1));
		pane.add(btPorcento);
		
		btPorcento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mat.n2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.Porcento(mat.n2)+"");
				
			}
		});
		
		/*
		 btAdicao
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "soma";
				txtVisor.setText("0");

		 */
		
		/*
		   if(mat.operacao.equals("soma")) {
		   	txtVisor.setText(mat.Soma(mat.n1, mat.n2)+"");
		   }
		 */
			
		
		
		
		
		//4ª LINHA
		bt4.setBounds(15, 175, 35, 30);
		bt4.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt4.setMargin(new Insets(1,1,1,1));
		bt4.setBackground(Color.white);
		pane.add(bt4);
		
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "4");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("4");
				}	
			}
		});
		
		bt5.setBounds(55, 175, 35, 30);
		bt5.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt5.setMargin(new Insets(1,1,1,1));
		bt5.setBackground(Color.white);
		pane.add(bt5);
		
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "5");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("5");
				}	
			}
		});
		
		bt6.setBounds(95, 175, 35, 30);
		bt6.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt6.setMargin(new Insets(1,1,1,1));
		bt6.setBackground(Color.white);
		pane.add(bt6);
		
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "6");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("6");
				}	
			}
		});
		
		btMultiplicacao.setBounds(135, 175, 35, 30);
		btMultiplicacao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btMultiplicacao.setMargin(new Insets(1,1,1,1));
		pane.add(btMultiplicacao);
		
		btMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "multiplicacao";
				txtVisor.setText("0");
			}
		});
		
		bt1X.setBounds(175, 175, 35, 30);
		bt1X.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		bt1X.setMargin(new Insets(1,1,1,1));
		pane.add(bt1X);
		
		bt1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "reciprocal";
				txtVisor.setText(mat.Reciprocal(mat.n1)+"");
			}
		});
		
		//5ª LINHA
		bt1.setBounds(15, 210, 35, 30);
		bt1.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt1.setMargin(new Insets(1,1,1,1));
		bt1.setBackground(Color.white);
		pane.add(bt1);
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "1");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("1");
				}	
			}
		});
		
		bt2.setBounds(55, 210, 35, 30);
		bt2.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt2.setMargin(new Insets(1,1,1,1));
		bt2.setBackground(Color.white);
		pane.add(bt2);
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "2");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("2");
				}	
			}
		});
		
		bt3.setBounds(95, 210, 35, 30);
		bt3.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt3.setMargin(new Insets(1,1,1,1));
		bt3.setBackground(Color.white);
		pane.add(bt3);
		
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "3");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("3");
				}	
			}
		});
		
		btSubtracao.setBounds(135, 210, 35, 30);
		btSubtracao.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		btSubtracao.setMargin(new Insets(1,1,1,1));
		pane.add(btSubtracao);
		
		btSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "subtracao";
				txtVisor.setText("0");
			}
		});
		
		btResultado.setBounds(175, 210, 35, 65);
		btResultado.setFont( new Font( "Arial", Font.PLAIN, 18 ) );
		btResultado.setMargin(new Insets(1,1,1,1));
		pane.add(btResultado);
		
		btResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n2 = Double.parseDouble(txtVisor.getText());
				
				if(mat.operacao.equals("soma")) {
					txtVisor.setText(mat.Soma(mat.n1, mat.n2)+"");
				}
				
				if(mat.operacao.equals("subtracao")) {
					txtVisor.setText(mat.Subtracao(mat.n1, mat.n2)+"");
				}
				
				if(mat.operacao.equals("multiplicacao")) {
					txtVisor.setText(mat.Multiplicacao(mat.n1, mat.n2)+"");
				}
				
				if(mat.operacao.equals("divisao")) {
					txtVisor.setText(mat.Divisao(mat.n1, mat.n2)+"");
				}
				
			}
		});
		
		//6ª LINHA
		bt0.setBounds(15, 245, 75, 30);
		bt0.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		bt0.setMargin(new Insets(1,1,1,1));
		bt0.setBackground(Color.white);
		pane.add(bt0);
		
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().equals("0")) {
					
					txtVisor.setText(txtVisor.getText() + "0");
				
				}else if (txtVisor.getText().equals("0")){
					
					txtVisor.setText("0");
				}	
			}
		});
		
		btDecimal.setBounds(95, 245, 35, 30);
		btDecimal.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		btDecimal.setMargin(new Insets(1,1,1,1));
		btDecimal.setBackground(Color.white);
		pane.add(btDecimal);
		
		btDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtVisor.getText().contains(".")) {
					if(!txtVisor.getText().equals("0")) {
						
						txtVisor.setText(txtVisor.getText() + ".");
					
					}else if (txtVisor.getText().equals("0")){
						
						txtVisor.setText(".");
						
					}
				}
			}
		});
		
		btAdicao.setBounds(135, 245, 35, 30);
		btAdicao.setFont( new Font( "Arial", Font.PLAIN, 16 ) );
		btAdicao.setMargin(new Insets(1,1,1,1));
		pane.add(btAdicao);
		
		btAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mat.n1 = Double.parseDouble(txtVisor.getText());
				mat.operacao = "soma";
				txtVisor.setText("0");
			}
		});
			
		this.setVisible(true);
		this.setSize(231,338);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String[]args) {
		Calculator calculadora = new Calculator();
	}
}
