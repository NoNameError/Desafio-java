package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();
		String [] candidatos = {"FELIPE", "MARICA", "JULIA", "PAULO", "AUGUSTO",};
		for(String candidato: )
		

	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARICA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice de elementos");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de numero" + (indice+1) + " e " + candidatos[indice]);
		}
		
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARICA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato" + candidato + "Solicitou este valor de salario" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}		
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	
	static void analisarCandidato(double salarioPretendido){
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido){
			System.out.println("Ligar para candidato");
		
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contraproposta");
		
		}else {
			System.out.println("Aguardando demais candidatos");
			
		}
			
	}

}
