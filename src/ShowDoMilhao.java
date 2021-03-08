import java.util.Scanner;

public class ShowDoMilhao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String resposta;
		
		System.out.println("Show do millhão");
		System.out.println("Responda as perguntas eliminatórias e conquiste o MILHÃO");
		System.out.println("0- Acertos - 0 $");
		System.out.println("1- Acerto 100 $");
		System.out.println("2- Acertos 1000 $");
		System.out.println("3- Acertos 10.000 $");
		System.out.println("4- Acertos  100.000 $");
		System.out.println("5- Acertos 1.000.000 $");

		System.out.println("Pergunta 1: Qual a carga horário do curso Java Xpert da Fiap");
		System.out.println("A) 136 horas");
		System.out.println("B) 100 horas");
		System.out.println("Digite a letra que corresponde à resposta correta:");
		resposta = leitor.next();
		if(resposta.equalsIgnoreCase("A")){
			System.out.println("Você acertou! Próxima pergunta valendo 1000$");
		}else {
			System.out.println("Você errou e não ganhou nada!");
		}
			System.out.println("Pergunta 2: Quantos módulos tem o curso Java Xpert?");
			System.out.println("A) 6 módulos");
			System.out.println("B) 7 módulos");
			resposta = leitor.next();
			if(resposta.equalsIgnoreCase("A")){
				System.out.println("Você acertou! Próxima pergunta valendo 1000$");
			}else {
			System.out.println("Você errou e ganhou 100$!");
			}
			System.out.println("Pergunta 3: Qual a data do último dia do curso?");
			System.out.println("A) 15 de junho");
			System.out.println("B) 16 de junho");
			resposta = leitor.next();
			if(resposta.equalsIgnoreCase("A")){
			System.out.println("Você acertou! Próxima pergunta valendo 1000$");
			}else {
			System.out.println("Você errou e não ganhou nada!");
			}
				System.out.println("Pergunta 4: Qual foi a data de início do curso?");
				System.out.println("A) 19 de fevereiro");
				System.out.println("B) 22 de fevereiro");
				resposta = leitor.next();
				if(resposta.equalsIgnoreCase("A")){
				System.out.println("Você acertou! Próxima pergunta valendo 1000$");
				}else {
				System.out.println("Você errou e não ganhou nada!");
				}
					System.out.println("VALENDO 1 MILHÃO");
			
					System.out.println("Pergunta 5: O que está escrito no quadro que fica atrás do Professor André nas aulas?");
					System.out.println("A) Bastardos Inglórios");
					System.out.println("B) Pulp Fiction");
					resposta = leitor.next();
					if(resposta.equalsIgnoreCase("A")){
					System.out.println("PARABÉNS, VOCÊ GANHOU 1 MILHÃO!!!");
					System.out.println("FIM DE JOGO");
					}
			}

	
}

