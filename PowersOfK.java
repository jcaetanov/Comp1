/******************************************************************************
 *
 * CCM118 - Computa��o I
 * Aluno: Jo�o Victor Oliveira Caetano
 * Numero USP: 10739674
 * Tarefa: PowersOfK
 * Data: 10/09/2018
 * 
 * DECLARO QUE SOU O �NICO AUTOR E RESPONS�VEL POR ESTE PROGRAMA.  TODAS AS 
 * PARTES DO PROGRAMA, EXCETO AS QUE S�O BASEADAS EM MATERIAL FORNECIDO  
 * PELO PROFESSOR OU COPIADAS DO LIVRO OU DAS BIBLIOTECAS DE SEDGEWICK & WAYNE, 
 * FORAM DESENVOLVIDAS POR MIM.  DECLARO TAMB�M QUE SOU RESPONS�VEL POR TODAS 
 * AS C�PIAS DESTE PROGRAMA E QUE N�O DISTRIBU� NEM FACILITEI A DISTRIBUI��O
 * DE C�PIAS DESTA PROGRAMA.
 *
 ******************************************************************************/

public class PowersOfK {
    
    public static void main(String[] args) {
 int n = Integer.parseInt(args[0]);
 int i = 0;
 //o valor n ser� o valor digitado no terminal para ser elevado por ele mesmo
 long v = 1;
 while (true) {
     System.out.println(v + " (" + i + ")");
     i = i + 1;
     v = v * n;
   if (v % n !=0 || v < 0){break;} 
// O looping executar� infinitas vezes at� o valor gerado n�o ser multiplo do valor inicial
//Isso nos dir� quando ocorrer� um erro, assim o programa parar� de executar sua fun��o
       
 }
    }
    
}
