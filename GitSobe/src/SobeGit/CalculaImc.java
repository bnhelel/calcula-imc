package SobeGit;

public class Lista2Exerc4 {
	public static void main(String[] args) {
		double kg, altura, imc;
		
		kg = Teclado.lerDouble("Quantos kg vc tem?");
		altura = Teclado.lerDouble("Qual sua altura?");
		imc = (kg / Math.pow(altura, 2));
		
		if(imc < 18.5) {
			System.out.println("Seu IMC está abaixo de 18.5, abaixo do peso saudável. Seu IMC é " + imc);
		}  
		else if (imc <= 24.9) {
		System.out.println("Seu IMC está entre 18.5 e 24.9, peso saudável. Seu IMC é " + imc);
			}		
		else if(imc <= 29.9) {
			System.out.println("Seu IMC está entre 25 e 29.9, sobrepeso. Seu IMC é " + imc);
		 }
		else if(imc <= 34.9) {
			System.out.println("Seu IMC está entre 30 e 34.9, obesidade grau 1. Seu IMC é " + imc);
		 }
		else if(imc <= 39.9) {
			System.out.println("Seu IMC está entre 35 e 39.9, obesidade grau 2. Seu IMC é " + imc);
		}
		else if(imc > 40) {
			System.out.println("Seu IMC está acima de 40, obesidade grau 3 (obesidade mórbida). Seu IMC é  " + imc);
			
		}
			
			
			
		
			
		
		

	

}
}
