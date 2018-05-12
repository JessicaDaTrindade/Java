package exercicio04;

import javax.swing.JOptionPane;

public class Ex04 {
	
	//Variáveis
    int idade = 0, contador = 0, sel = 0, crianca = 0, adolescente = 0, adultos = 0, 
    		excelente = 0, otimo = 0, bom = 0, regular = 0, ruim = 0;      
          
    //Criar variável para validar o menu
    boolean validarMenu = false, validarIdade = false, validarIdade1 = false;
    
    //Menu
    public void obterMenu() {
    	
    do{
        String menu = ("Informe sua satisfação\n");
        menu+= "1 - Excelente\n";
        menu+= "2 - Ótimo\n";
        menu+= "3 - Bom\n";
        menu+= "4 - Regular\n";
        menu+= "5 - Ruim\n";                           
                       
    	
        sel = Integer.parseInt(JOptionPane.showInputDialog(menu));
        if((sel >= 1) && (sel <= 5)){
        validarMenu = true;
        }else{
          JOptionPane.showMessageDialog(null, "Opção Invalida");
        }                       
    }while(validarMenu == false);
  
    contador++;
  }
  

	  //Menu
    public void votos() {
	    if(sel == 1){
	        excelente++;
	    }if(sel == 2){
	        otimo++;
	    }if(sel == 3){
	        bom++;
	    }if(sel == 4){
	        regular++;
	    }if(sel == 5){
	        ruim++;
	    }
    }
	
	//Validar idade
	public void obterIdade() {

		do{

		    //Validar apenas números
		     validarIdade1 = false;
		
		        while(validarIdade1 == false){
		            try{
		            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
		             validarIdade1 = true;
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Apenas números!");
		            }
		        } 
	        
	        if((idade >= 0) && (idade <= 100)){
	         validarIdade = true;
	        }else{
	        JOptionPane.showMessageDialog(null, "Opção Invalida"); 
	        }
	    }while(validarIdade == false);
	}

        //Condição
	public void condicao() {
        if((idade >= 0) && (idade <= 9)){
            crianca++;
        }if((idade >= 10) && (idade <= 17)){
            adolescente++;
        }if(idade > 17){
            adultos++;
        }
	}
		
	//Exibir
	public  void exibir() {
		
		double total = contador;
		
		    //Exibir estatistica
		    String texto = "****ESTATISTICAS*****\n\n";
		    String calculo ="";
		    calculo = String.format("%.2f",(100/total*excelente));
		    texto+= "\nExelente:   "+calculo+" %";  
		
		    calculo = String.format("%.2f",(100/total*otimo));
		    texto+= "\nOtimo:   "+calculo+" %";         
		                
		    calculo = String.format("%.2f",(100/total*bom));
		    texto+= "\nBom:   "+calculo+" %";
		
		    calculo = String.format("%.2f",(100/total*regular));
		    texto+= "\nRegular:   "+calculo+" %";
		
		    calculo = String.format("%.2f",(100/total*ruim));
		    texto+= "\nRuim:   "+calculo+" %";
		
		    texto+= "\nQuantidade de crianças:   "+crianca;           
		    texto+= "\nQuantidade de adolescentes:   "+adolescente;
		    texto+= "\nQuantidade de adultos:   "+adultos;
		
		    JOptionPane.showMessageDialog(null, texto);
		
	}
		
		
		//Laço principal
	  	public void laco() {
	  		
	  		//Variável
	  		int continuar = 0;
	  		
	  		do {  	
	  			
	  			obterMenu();	  			
	  			obterIdade();
	  			condicao();
	  			votos();
	  			
	  		    continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
	  		    
	  		}while(continuar == 0);	
	  		
	  		exibir();
	  	}

}
