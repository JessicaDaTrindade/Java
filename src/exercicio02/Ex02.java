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
	    	 nome = JOptionPane.showInputDialog("Informe seu nome.").toLowerCase();	
		         		          
		    if(nome.equals("")) {
		    	JOptionPane.showMessageDialog(null, "O campo não pode estar vazio!");
		    }else if(!nome.equals("sair")) {
		    	
		    }else {		     
		    	 valida = true;
		    }		    	 
		 }while(valida == false);
    }
	 
	
	   //Obter idade
	    public void obterIdade() {
	    	
	    	
	    }
	     
	    	   
	     
    
    
}