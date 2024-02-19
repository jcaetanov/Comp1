/******************************************************************************
 *
 * CCM118 - Computação I
 * Aluno: João Victor Oliveira Caetano
 * Numero USP: 10739674
 * Tarefa: PowersOfK
 * Data: 10/09/2018
 * 
 * DECLARO QUE SOU O ÚNICO AUTOR E RESPONSÁVEL POR ESTE PROGRAMA.  TODAS AS 
 * PARTES DO PROGRAMA, EXCETO AS QUE SÃO BASEADAS EM MATERIAL FORNECIDO  
 * PELO PROFESSOR OU COPIADAS DO LIVRO OU DAS BIBLIOTECAS DE SEDGEWICK & WAYNE, 
 * FORAM DESENVOLVIDAS POR MIM.  DECLARO TAMBÉM QUE SOU RESPONSÁVEL POR TODAS 
 * AS CÓPIAS DESTE PROGRAMA E QUE NÃO DISTRIBUÍ NEM FACILITEI A DISTRIBUIÇÃO
 * DE CÓPIAS DESTA PROGRAMA.
 *
 ******************************************************************************/

public class PowersOfK {
    
    public static void main(String[] args) {
 int n = Integer.parseInt(args[0]);
 int i = 0;
 //o valor n será o valor digitado no terminal para ser elevado por ele mesmo
 long v = 1;
 while (true) {
     System.out.println(v + " (" + i + ")");
     i = i + 1;
     v = v * n;
   if (v % n !=0 || v < 0){break;} 
// O looping executará infinitas vezes até o valor gerado não ser multiplo do valor inicial
//Isso nos dirá quando ocorrerá um erro, assim o programa parará de executar sua função
       
 }
    }
    
}
