package ConversorDeMonedas;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public  class VentanaConversor {
	
	public static void main(String[] args) {
		
		JFrame frame1 = new JFrame();
		
		frame1.setBounds(140, 60, 400, 250);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.setTitle("Conversor");
		
		JLabel label = new JLabel("Vienvenido al Conversor de Moneda.");
		label.setBounds(86, 10, 300, 35);
		frame1.add(label);
		
		JMenuBar menuP = new JMenuBar();
		menuP.setBounds(40, 60, 320, 35);
		frame1.add(menuP);
			JMenu menu = new JMenu("Hacer clic aqui y elija una opcion.");
			menu.setBounds(40, 80, 220, 35);
			menuP.add(menu);
		
				JMenuItem DaP = new JMenuItem("Dolar a Pesos Mexicanos.");
				menu.add(DaP);
				JMenuItem EaP = new JMenuItem("Euros a Pesos Mexicanos");
				menu.add(EaP);
				JMenuItem LaP = new JMenuItem("Libras a Pesos Mexicanos.");
				menu.add(LaP);
				JMenuItem YaP = new JMenuItem("Yens a Pesos Mexicanos.");
				menu.add(YaP);
				JMenuItem WaP = new JMenuItem("Wons a Pesos Mexicanos.");
				menu.add(WaP);
				
				JMenuItem PesosaDolar = new JMenuItem("Pesos Mexicanos a Dolar");
				menu.add(PesosaDolar);
				JMenuItem PesosaEuros = new JMenuItem("Pesos Mexicanos a Euros");
				menu.add(PesosaEuros);
				JMenuItem PesosaLibras = new JMenuItem("Pesos Mexicanos a Libras");
				menu.add(PesosaLibras);
				JMenuItem PesosYens = new JMenuItem("Pesos Mexicanos a Yens");
				menu.add(PesosYens);
				JMenuItem PesosaWons = new JMenuItem("Pesos Mexicanos a Wons");
				menu.add(PesosaWons);
			
		JButton salirButton = new JButton("Salir");
		salirButton.setBounds(250, 170, 120, 35);
		frame1.add(salirButton);
		frame1.setVisible(true);
		
		Converciones convercion = new Converciones();
		
		salirButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		DaP.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					JMenuItem source = (JMenuItem) e.getSource();
					String cantidadDolar = (String)JOptionPane.showInputDialog(frame1,"Desea Convertir de " + source.getText()+ ".\n"    
			               + "Ingresa la cantidad:\n"  );
					
					while (!Converciones.isNumber(cantidadDolar)) {
						cantidadDolar= (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );
					}
					
					double cantidadDollar = Integer.parseInt(cantidadDolar);
					convercion.cambiarDollar(17.0, cantidadDollar);
					double redondeo = Math.floor(convercion.getCanFinDollar()* 100)/100.0;
					
					JOptionPane.showMessageDialog(frame1, "Tienes $"+ redondeo +" Pesos.");
					JOptionPane.showInternalConfirmDialog(frame1, "salir");

				}
			});
		
		
		
		EaP.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String cantidadEurosS = (String)JOptionPane.showInputDialog(frame1,"Ingresa la cantidad de Euros que deseas convertir:\n" );
					
					while (!Converciones.isNumber(cantidadEurosS)) {
						cantidadEurosS= (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );
					}
					
					double cantidadEuros = Integer.parseInt(cantidadEurosS);
					convercion.cambiarEuros( 18.89, cantidadEuros);
					double redondeo = Math.round(convercion.getCanFinEuros()*100)/100.0;
					
					JOptionPane.showMessageDialog(frame1, "Tienes $"+ redondeo +" Pesos.");					
				}
		});
	    
		LaP.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cantidadLibras = (String)JOptionPane.showInputDialog(frame1,"Ingresa la cantidad de Libras que deseas convertir:\n" );
					
					while (!Converciones.isNumber(cantidadLibras)) {
						cantidadLibras= (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );
					}
					double cantidadLibra = Integer.parseInt(cantidadLibras);
					convercion.cambiarLibras(21.84,cantidadLibra);
					double redondeo = Math.round(convercion.getCanFinLibras()*100)/100.0;
					
					JOptionPane.showMessageDialog(frame1, "Tienes $"+ redondeo +" Pesos.");					
				
				}
		});
		
		YaP.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadYens = (String)JOptionPane.showInputDialog(frame1,"Ingresa la cantidad de Yens que deseas convertir:\n" );
				
				while (!Converciones.isNumber(cantidadYens)) {
					cantidadYens= (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );
				}
				double cantidadYen = Integer.parseInt(cantidadYens);
				convercion.cambiarYens(0.12,cantidadYen);
				double redondeo = Math.round(convercion.getCanFinYens()*100)/100.0;
				
			   JOptionPane.showMessageDialog(frame1, "Tienes $"+ redondeo +" Pesos.");	
			   
			}
		});    
	
		WaP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadWons = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Wons que deseas convertir:\n");
				
				while (!Converciones.isNumber(cantidadWons)) {
					cantidadWons = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadWon = Integer.parseInt(cantidadWons);
				convercion.cambiarWons(0.013, cantidadWon);	
				double redondeo = Math.round(convercion.getCanFinWons()*100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "Tienes $" + redondeo + "Pesos.");
			}
		});
		
	//	----------------------De Pesos a Moneda Extranjera----------------------------------------
		
		PesosaDolar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadPesosDs = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Pesos que deseas convertir Dolares:\n");
				
				while (!Converciones.isNumber(cantidadPesosDs)) {
					cantidadPesosDs = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadPesosD = Integer.parseInt(cantidadPesosDs);
				convercion.cambiarDollar(cantidadPesosD, 0.059 );
				double redondeo = Math.round(convercion.getCanFinDollar()* 100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "Tienes $ "+ redondeo + " Pesos");
			}
		});
		
		PesosaEuros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadPesosEs = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Pesos que deseas convertir a Euros:\n");
				
				while (!Converciones.isNumber(cantidadPesosEs)) {
					cantidadPesosEs = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadPesosE = Integer.parseInt(cantidadPesosEs);
				convercion.cambiarEuros(cantidadPesosE, 0.053);
				double redondeo = Math.round(convercion.getCanFinEuros()* 100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "Tienes $ "+ redondeo + " Pesos");
			}
		});
		
		PesosaLibras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadPesosLs = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Pesos que deseas convertir a Libras:\n");
				
				while (!Converciones.isNumber(cantidadPesosLs)) {
					cantidadPesosLs = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadPesosL = Integer.parseInt(cantidadPesosLs);
				convercion.cambiarLibras(cantidadPesosL, 0.46);
				double redondeo = Math.round(convercion.getCanFinLibras()* 100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "De: $ "+cantidadPesosL+ " Libras."+" ---> " + " Son: $ "+ redondeo + " Pesos.");
			}
		 });
		
		PesosYens.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadPesosYs = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Pesos que deseas convertir a Yens:\n");
				
				while (!Converciones.isNumber(cantidadPesosYs)) {
					cantidadPesosYs = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadPesosY = Integer.parseInt(cantidadPesosYs);
				convercion.cambiarYens(cantidadPesosY, 8.35);
				double redondeo = Math.round(convercion.getCanFinYens()* 100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "Tienes $ "+ redondeo + " Pesos");
			}
		});
		
		PesosaWons.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cantidadPesosWs = (String)JOptionPane.showInputDialog(frame1, "Ingresa la cantidad de Wons que deseas convertir a Wons:\n");
				
				while (!Converciones.isNumber(cantidadPesosWs)) {
					cantidadPesosWs = (String)JOptionPane.showInputDialog(frame1,"<html><p style=\"color:green\">Por favor ingrese solo numeros</p></html>"  );	
				}
				double cantidadPesosW = Integer.parseInt(cantidadPesosWs);
				convercion.cambiarWons(cantidadPesosW, 75.73);
				double redondeo = Math.round(convercion.getCanFinWons()* 100)/100.0;
				
				JOptionPane.showMessageDialog(frame1, "Tienes $ "+ redondeo + " Pesos");
				
			}
		});
		    
		}
		 
	}
	
	 

