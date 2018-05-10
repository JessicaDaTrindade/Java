package exercicio01;

import javax.swing.JOptionPane;

public class Ex01 {
	
	//Atributos
	 String nome;
	 int  idade = 0, sim = 0, nao = 0, cargo, sexo, feminino = 0, 
    		 masculino = 0, gerente = 0, atendente = 0, acogueiro = 0, 
    		 secretaria = 0, almoxarife = 0, padeiro = 0, estagiario = 0; 
	  
	  //Obter nome
      public void obterNome() {
    	 
	     boolean valida = false;
	     
	     do{
	    	 nome = JOptionPane.showInputDialog("Informe seu nome.").toLowerCase();	
		         		          
		    if(nome.equals("")) {
		    	JOptionPane.showMessageDialog(null, "O campo n�o pode estar vazio!");
		    }else {		     
		    	 valida = true;
		    }		    	 
		 }while(valida == false);
	   
     }       
     
	//Obter idade
	public void obteridade() {
			
		boolean validaIdade = false;
		String expressao;
			
		do{
			expressao = JOptionPane.showInputDialog("Voc� tem mais que 18 anos?\n\n1) Sim\n2) N�o");  
				
			try {		          
				if(expressao.equals("1")){	
						sim++;
				  idade = Integer.parseInt(expressao);
				    validaIdade = true;
				}else if(expressao.equals("2")) {
						nao++;
					idade = Integer.parseInt(expressao);
					   validaIdade = true;
				}else {
				    JOptionPane.showMessageDialog(null, "Op��o inv�lida!");			     
				}
			}catch(Exception e) {
				    JOptionPane.showMessageDialog(null, "Op��o inv�lida!");	
			}
		    	 
		}while(validaIdade == false);
		    	
		}   
		
		//Obter Sexo
		public void obterSexo() {
			

			boolean validaSexo = false;
			String expressao;
			do{
				expressao = JOptionPane.showInputDialog("Sexo\n\n1) Feminino\n2) Masculino");     

		    	try {		          
				   if(expressao.equals("1")) {	
				    	feminino++;
				     idade = Integer.parseInt(expressao);
				    	validaSexo = true;
				   }else if(expressao.equals("2")) {
					   masculino++;
				     idade = Integer.parseInt(expressao);
					    validaSexo = true;
				   }else {
				    	JOptionPane.showMessageDialog(null, "Op��o inv�lida!");			     
				   }
		    	}catch(Exception e) {
		    		JOptionPane.showMessageDialog(null, "Op��o inv�lida!");	
		    	}
		    	 
		    }while(validaSexo == false);
		    	
		}   
		
		//Obter cargo	
		public void obterCargo() {
			
			boolean validaCargo = false;
			String expressao;
			
			do{
				expressao = JOptionPane.showInputDialog("Cargo\n\n1) Gerente\n2) Atendente\n3) A�ogueiro\n"
						+ "4) Secret�ria\n5) Almoxarife\n6) Padeiro\n7) Estagi�rio");
				try {
				  if(expressao.equals("1")) {	
					    	gerente++;
					     cargo = Integer.parseInt(expressao);
					    	validaCargo = true;
				  }else if(expressao.equals("2")) {
					  atendente++;
					  cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else if(expressao.equals("3")) {	
				    	acogueiro++;
				     cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else if(expressao.equals("4")) {	
				    	secretaria++;
				     cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else if(expressao.equals("5")) {	
				    	almoxarife++;
				     cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else if(expressao.equals("6")) {	
				    	padeiro++;
				     cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else if(expressao.equals("7")) {	
				    	estagiario++;
				     cargo = Integer.parseInt(expressao);
				    	validaCargo = true;
				  }else {
				    	JOptionPane.showMessageDialog(null, "Op��o inv�lida!");			     
				   }
		    	}catch(Exception e) {
		    		JOptionPane.showMessageDialog(null, "Op��o inv�lida!");	
		    	}		
				
				
		}while(validaCargo == false);
		
	}
		
		//Exibir
     	public void exibir() {
     		
     		String  msg = "****ESTATISTICAS*****\n\n";
				    msg+= "Sexo Feminino: "+feminino;
				    msg+= "\nSexo Masculino: "+masculino;
				    msg+= "\nGerente: "+gerente;
				    msg+= "\nAtendente: "+atendente;
				    msg+= "\nA�ogueiro: "+acogueiro;
				    msg+= "\nSecret�ria: "+secretaria;
		            msg+= "\nAlmoxarife: "+almoxarife;
		            msg+= "\nPadeiro: "+padeiro;
		            msg+= "\nEstagi�rio: "+estagiario;
		            msg+= "\nMaior de idade: "+sim;
		            msg+= "\nMenor de idade: "+nao;    	

            JOptionPane.showMessageDialog(null, msg);
     	}
       //La�o principal
     	public void laco() {
     		
     		//Vari�vel
     		int continuar = 0;
     		
     		do {
     		
     			obterNome();
     			obteridade();
     			obterSexo();
     			obterCargo();
     		    continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
     		    
     		}while(continuar == 0);	
     		
     		exibir();
     	}
		
     	
}
		

	
	
	

