import java.util.Scanner;

public class ShowDoMilhao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String resposta;
		
		System.out.println("Show do millh�o");
		System.out.println("Responda as perguntas eliminat�rias e conquiste o MILH�O");
		System.out.println("0- Acertos - 0 $");
		System.out.println("1- Acerto 100 $");
		System.out.println("2- Acertos 1000 $");
		System.out.println("3- Acertos 10.000 $");
		System.out.println("4- Acertos  100.000 $");
		System.out.println("5- Acertos 1.000.000 $");

		System.out.println("Pergunta 1: Qual a carga hor�rio do curso Java Xpert da Fiap");
		System.out.println("A) 136 horas");
		System.out.println("B) 100 horas");
		System.out.println("Digite a letra que corresponde � resposta correta:");
		resposta = leitor.next();
		if(resposta.equalsIgnoreCase("A")){
			System.out.println("Voc� acertou! Pr�xima pergunta valendo 1000$");
		}else {
			System.out.println("Voc� errou e n�o ganhou nada!");
		}
			System.out.println("Pergunta 2: Quantos m�dulos tem o curso Java Xpert?");
			System.out.println("A) 6 m�dulos");
			System.out.println("B) 7 m�dulos");
			resposta = leitor.next();
			if(resposta.equalsIgnoreCase("A")){
				System.out.println("Voc� acertou! Pr�xima pergunta valendo 1000$");
			}else {
			System.out.println("Voc� errou e ganhou 100$!");
			}
			System.out.println("Pergunta 3: Qual a data do �ltimo dia do curso?");
			System.out.println("A) 15 de junho");
			System.out.println("B) 16 de junho");
			resposta = leitor.next();
			if(resposta.equalsIgnoreCase("A")){
			System.out.println("Voc� acertou! Pr�xima pergunta valendo 1000$");
			}else {
			System.out.println("Voc� errou e n�o ganhou nada!");
			}
				System.out.println("Pergunta 4: Qual foi a data de in�cio do curso?");
				System.out.println("A) 19 de fevereiro");
				System.out.println("B) 22 de fevereiro");
				resposta = leitor.next();
				if(resposta.equalsIgnoreCase("A")){
				System.out.println("Voc� acertou! Pr�xima pergunta valendo 1000$");
				}else {
				System.out.println("Voc� errou e n�o ganhou nada!");
				}
					System.out.println("VALENDO 1 MILH�O");
			
					System.out.println("Pergunta 5: O que est� escrito no quadro que fica atr�s do Professor Andr� nas aulas?");
					System.out.println("A) Bastardos Ingl�rios");
					System.out.println("B) Pulp Fiction");
					resposta = leitor.next();
					if(resposta.equalsIgnoreCase("A")){
					System.out.println("PARAB�NS, VOC� GANHOU 1 MILH�O!!!");
					System.out.println("FIM DE JOGO");
					}
			}

	
}

