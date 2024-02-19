/*
 * Este programa implementa a estratégia óbvia, que dá 50% de 
 * chance de vitória para Bob.
 * 
 * Uso: java BiggestNumberDumb a b T
 * 
 * onde a e b são os inteiros escolhidos por Alice (no intervalo 0..100)
 * e T é o número de vezes que o jogo é simulado.
 *
 * Exemplos de execução:
 * 
 * $ java BiggestNumberDumb 35 75 100
 * 47 [0.47/-0.030000000000000027]
 * $ java BiggestNumberDumb 35 75 1000000
 * 499278 [0.499278/-7.220000000000004E-4]
 * $ java BiggestNumberDumb 35 75 2000000
 * 1000090 [0.500045/4.499999999996174E-5]
 * 
 * Com uma estratégia melhor (implementada no programa 
 * BiggestNumber.java), Bob consegue uma boa margem de vitória: 
 * 
 * $ java BiggestNumber 35 75 2000000
 * 1399140 [0.69957/0.19957000000000003]
 * $ java BiggestNumber 35 75 2000000
 * 1399874 [0.699937/0.19993700000000003]
 * $ java BiggestNumber 0 100 2000000
 * 2000000 [1.0/0.5]
 *
 * Seu objetivo é encontrar uma tal estratégia para Bob.
 */

public class BiggestNumberDumb {

    public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int T = Integer.parseInt(args[2]);

	int bigger;
	if (a < b) bigger = 1;
	else bigger = 0;

	int right = 0;
	for (int i = 0; i < T; i++) {
	    // Estratégia ingênua de Bob
	    int choice;
	    if (Math.random() < .5) choice = 0;
	    else choice = 1;

	    // Escolha correta?
	    if (choice == bigger) right++;
	}
	// Estatística
	double f = (double)right/T;
	System.out.println(right + " [" + f + "/" + (f - .5) + "]");
    }
    
}
