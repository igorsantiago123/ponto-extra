package pontoExtra;

public class diferenca {

	public static void main(String[] args) {
		int []numNat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = 0, eleva = 0, somaVet = 0, eleva2 = 0, result;
		
		
		//O quadrado da soma dos dez primeiros n�meros naturais
		for( int i = 0; i < numNat.length; i++)
			soma = soma + numNat[i];
			eleva = soma * soma;
			System.out.println("O quadrado da soma dos dez primeiros n�: " + eleva);
		
		//A soma dos quadrados dos dez primeiros n�meros naturais
		somaVet = (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + (6*6) + (7*7) + (8*8) + (9*9) + (10*10);
			System.out.println("A soma dos quadrados dos dez primeiros n�: " + somaVet);
		
		//A diferen�a entre o quadrado da soma dos dez primeiros n�meros naturais e a soma dos quadrados dos dez primeiros n�meros naturais
			result = eleva - somaVet;
			System.out.println("A diferen�a dos n�: " + result);
	}

}