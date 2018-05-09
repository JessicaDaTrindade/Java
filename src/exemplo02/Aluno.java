package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
	
	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;
	
	//M�todo para realizar as perguntas
	public void perguntas() {
		
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));
	}
	
	//M�todo de repeti��o
	public void laco() {
		
		//V�riavel sair
		int continuar = 0;
		
		//La�o
		do {
			perguntas();	
			exibirSituacao();
			contarAprovadosReprovados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
		}while(continuar == 0);		
		
		exibirAprovadosReprovados();
	}
	
	//M�todo para retornar o c�lculo de m�dia
	public double calculodeMedia() {
		double media = (nota1+nota2+nota3)/3;
		return media;
		
	}
	
	//M�todo para retornar a situacao do aluno
	public String situacaoAluno() {
		String situacao = calculodeMedia() >= 7 ? "Aprovado" : "Reprovado";
		return situacao;
	}
	
	//Exibir m�dia e situa��o
	public void exibirSituacao() {
		
		//Mensagem
		String  msg = "*****Informa��o do aluno*****";
				msg+= "\nSua m�dia �: "+String.format("%.2f", calculodeMedia());
				msg+= "\nSua situa��o �: "+situacaoAluno();
				
		//Exibir mensagem
		JOptionPane.showMessageDialog(null,  msg);
		
	}
	
	//Contar aprovados e reprovadps
	public void contarAprovadosReprovados() {
		
		if(calculodeMedia() >= 7) {
			aprovados++;
		}else {
			reprovados++;			
		}
	}
	
	//Exibir a quantidade de aprovados e reprovados
	public void exibirAprovadosReprovados() {
		
		String  msg = "Aprovados X Reprovados";
				msg+= "\nAlunos aprovados: "+aprovados;
				msg+= "\nAlunos reprovados: "+reprovados;
				
		JOptionPane.showMessageDialog(null, msg);
	}

}
