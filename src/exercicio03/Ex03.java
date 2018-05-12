package exercicio03;

import javax.swing.JOptionPane;

public class Ex03 {

	//Atributos
	 int quantidade, quant = 0;
     int  sel = 0, cont = 0, cont2 = 0;
     double soma = 0, pedido = 0, pagamento = 0;
     
     //Menu
     public void menu() {    	
    	 
        boolean valida = false;
    	 
    	 do{
    		 String menu = ("Informe seu pedido\n");
    	 		menu+= "1 - Hambúrguer + Suco de Laranja\n";
    	 		menu+= "2 - Sanduíche natural + Suco de Uva\n";
    	        menu+= "3 - Prato do dia\n";
    	        menu+= "4 - Pizza\n";
    	        menu+= "5 - Lasanha\n";
    	        menu+= "6 - Pão de queijo\n";
    	        menu+= "7 - Bolo\n";  
    	        
    	        sel = Integer.parseInt(JOptionPane.showInputDialog(menu));
    	        if((sel >= 1) && (sel <= 7)) {
    	        	valida = true;
    	        }else{
    	        	JOptionPane.showMessageDialog(null,"Opção inválida");
    	        	
    	        }
    	        
    	 }while(valida == false);
    	 
     }
     
	 //Pedir quantidade
     public void quantidade() {
    	 
    	boolean validarQuant = false;
    	 
		 while(validarQuant == false) {                     
		     try{
		      quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		          validarQuant = true;
		     }catch(Exception e){
		         JOptionPane.showMessageDialog(null, "Apenas números!");
		     } 
		 }
     }
     
     //Contabilizar
     public void contabilizar() {    	 
    	 
	    	 if(sel == 1){
	             pedido += (quant*5); 
	        }else if(sel == 2){
	            pedido += (quant*4.5);
	        }else if(sel == 3){
	            pedido += (quant*8);
	        }else if(sel == 4){
	            pedido += (quant*12);
	        }else if(sel == 5){
	            pedido += (quant*16.5);
	        }else if(sel == 6){
	            pedido += (quant*1);
	        }else{
	            pedido += (quant*2.50);             
	        }	    	   	 
     }
     
     
	//Exibir		   
	public void pagamento() {
		
		boolean validarPedido = false;
		
		   while(validarPedido == false){ 
		      pagamento = Double.parseDouble(JOptionPane.showInputDialog("O valor do seu pedido é de: R$ "+pedido+"!\n"+"Informe o valor pago:"));
		     if(pagamento < pedido){
		        JOptionPane.showMessageDialog(null,"Opção inválida");
		     }else if(pagamento >= pedido){
		       validarPedido = true;
		     }        
		  }
	}
	
	//Exibir
	 public void exibir() {
		 
		 JOptionPane.showMessageDialog(null,"Troco: R$ "+(pagamento-pedido));
		 
	}
     
   //Laço principal
  	public void laco() {
  		
  		//Variável
  		int continuar = 0;
  		
  		do {  	
  			menu();
  			quantidade();
  			contabilizar();
  			
  		    continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
  		    
  		}while(continuar == 0);	
  		pagamento();
  		exibir();
  	}
  	
}