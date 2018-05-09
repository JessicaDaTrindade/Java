package exercicio01;

import javax.swing.JOptionPane;

public class Ex01 {
	
	//Atributos
	 String nome, cargo;
     int idadeSel, sim = 0, nao = 0, cargoSel, sexoSel, feminino = 0, 
    		 masculino = 0, gerente = 0, atendente = 0, acogueiro = 0, 
    		 secretaria = 0, almoxarife = 0, padeiro = 0, estagiario = 0;
     
     //Validar dados
     boolean validarSexo = false, validarIdade = false, validarCargo = false;
	
     //Perguntar nome
	public void nomes() {
		
		nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar.").toLowerCase();
    
	}
	
	 
				//Informar idade
				public String perguntas() {
					
					//Varial contendo as perguntas
					String perguntas = "";
	            validarIdade = false;
	
	            	while(validarIdade == false){
	            		String  idade =  "Você tem mais que 18 anos?\n";
	            				idade+= "1 - Sim\n";
	            				idade+= "2 - Não";
	
	                idadeSel = Integer.parseInt(JOptionPane.showInputDialog(idade));
	            	}
	            	return perguntas;
				}	
}
		

	
	
	

