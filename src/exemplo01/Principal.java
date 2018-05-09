package exemplo01;

public class Principal {
	
	public static void main(String[] args) {
		
		//Instanciar 
		Pessoa p1 = new Pessoa();
		p1.nome = "Jessica";
		p1.idade = 26;
		p1.peso = 81.0;
		p1.altura = 1.74;
		
		//Instanciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.nome = "Caio";
		p2.idade = 23;
		p2.peso = 72;
		p2.altura = 1.70;
		
		//Invocar métodos
		p1.apresentacao();
		p1.exibirImc();
		
		
		
		
	}

}
