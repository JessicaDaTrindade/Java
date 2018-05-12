package exercicio02;

import javax.swing.JOptionPane;

public class Ex02 {
	
	//Atributos
    String nome, nomeMaiorAltura = "", nomeMaiorIdade = "" , nomeMaiorPeso = "";
    int idade = 0, contador = 0, maiorIdade = 0;
    double  maiorAltura = 0,  altura = 0, maiorPeso = 0, peso =0, soma = 0;

    //Obter nome
    public void obterNome() {
  	 
	     boolean valida = false;
	     
	     do{
	    	 nome = JOptionPane.showInputDialog("Informe seu nome.");	
		         		          
		    if(nome.equals("")) {
		    	JOptionPane.showMessageDialog(null, "O campo não pode estar vazio!");
		    	
		    }else {		     
		    	 valida = true;
		    }		    	 
		 }while(valida == false);
	     
	     contador++;
    }
    
	
	   //Obter idade
	    public void obterIdade() {
	    	
	    	boolean validaIdade = false;
	    	String expressao;
	    	
	    	do{
				expressao = JOptionPane.showInputDialog("Informe sua idade");  
					
				try {		          
					if(!expressao.equals("")){	
							
					  idade = Integer.parseInt(expressao);
					    validaIdade = true;
			
					}else {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");			     
					}
				}catch(Exception e) {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");	
				}
			    	 
			}while(validaIdade == false);
			   
	    	if(idade > maiorIdade){
                maiorIdade = idade;
                nomeMaiorIdade = nome;                        
                }               
			}   
	    
	    //Obter peso
	    public void obterPeso() {
	    	
	    	String expressao;
	    	boolean validaPeso = false;
	    	
	    	do{
				expressao = JOptionPane.showInputDialog("Informe seu peso.");  
					
				try {		          
					if(!expressao.equals("")){	
							
					  peso =  Double.parseDouble(expressao);
					    validaPeso = true;
			
					}else {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");			     
					}
				}catch(Exception e) {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");	
				}
			    	 
			}while(validaPeso == false);
	   
	    	if(peso > maiorPeso){
                maiorPeso = peso;
                nomeMaiorPeso = nome;
	    	}
	    	
	    }
	    
	    //Obter altura
	    public void obterAltura() {
	    	
	    	String expressao;
	    	boolean validaAltura = false;
	    	
	    	do{
				expressao = JOptionPane.showInputDialog("Informe sua altura");  
					
				try {		          
					if(!expressao.equals("")){	
							
					  altura =  Double.parseDouble(expressao);
					    validaAltura = true;
			
					}else {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");			     
					}
				}catch(Exception e) {
					    JOptionPane.showMessageDialog(null, "Opção inválida!");	
				}    	 
			}while(validaAltura == false);
	    	
	    	soma += altura;
	    	if(altura > maiorAltura){
                maiorAltura = altura;
                nomeMaiorAltura = nome;      
	    	}
	    	
	    }
	    
	     //Exibir
	    public void exibir() {
	    	
	        //Exibir votos
            String  msg = "****ESTATISTICAS*****\n\n";
		            msg+= "Quantidade de jogadores cadastrados: "+contador;
		            msg+= "\nNome e altura do jogador mais alto: "+nomeMaiorAltura+" - "+maiorAltura;
		            msg+= "\nNome e idade do jogador mais velho: "+nomeMaiorIdade+" - "+maiorIdade+" anos";
		            msg+= "\nNome e peso do jogador mais pesado: "+nomeMaiorPeso+" - "+maiorPeso+" kg";
		            msg+= "\nMedia das alturas: "+(soma/contador);
            
            JOptionPane.showMessageDialog(null, msg);       

	    }
	    	   
	    //Laço principal
     	public void laco() {
     		
     		//Variável
     		int continuar = 0;
     		
     		do {
     			
     			obterNome();
     			obterIdade();
     			obterPeso();
     			obterAltura();
     			
     		    continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
     		    
     		}while(continuar == 0);	
     		
     		exibir();
     		
     	}
    
    
}