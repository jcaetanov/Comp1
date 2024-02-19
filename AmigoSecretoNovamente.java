/* *****************************************************************************
 *
 * CCM118 - Computação I
 * Aluno: João Victor Oliveira Caetano
 * Numero USP: 10739674
 * Tarefa: Ex. AmigoSecretoNovamente
 * Data: 17/09/2018
 * 
 * Baseado em ... (breve e se aplicável)
 *
 * DECLARO QUE SOU O ÚNICO AUTOR E RESPONSÁVEL POR ESTE PROGRAMA.  TODAS AS 
 * PARTES DO PROGRAMA, EXCETO AS QUE SÃO BASEADAS EM MATERIAL FORNECIDO  
 * PELO PROFESSOR OU COPIADAS DO LIVRO OU DAS BIBLIOTECAS DE SEDGEWICK & WAYNE, 
 * FORAM DESENVOLVIDAS POR MIM.  DECLARO TAMBÉM QUE SOU RESPONSÁVEL POR TODAS 
 * AS CÓPIAS DESTE PROGRAMA E QUE NÃO DISTRIBUÍ NEM FACILITEI A DISTRIBUIÇÃO
 * DE CÓPIAS DESTA PROGRAMA.
 *
 ***************************************************************************** */

public class AmigoSecretoNovamente
{
  public static void main (String[] args)
  {    
    //Variaveis da do programa, sendo N e T as entradas
    int N = Integer.parseInt(args[0]);
    int T = Integer.parseInt(args[1]);
    int j = 1;
    //este while deixa todos os numeros da sequencia ordenados e calcula seu numero de vezes
    while(j<=N)
    {
      
      int[] a = new int[j];     
      for(int i = 0; i < j; i++)
      {
        a[i] = i;
      } 
      int p = 0; 
      int b =0; 
      //Este while permuta os itens até n e os troca, calculando quando a[i]=i
      while(b<T)
      {
        b=b+1;
        for (int i=0; i<j; i++)
        {
          int m =(int) (Math.random()*j); 
          int t = a[i];
          a[i] = a[m];
          a[m] = t;
        }       
        for( int k=0; k<j; k++)
        {
          if(a[k]==k)
          {//Parte importante que pausa a sequencia quando a[i]=i
            p=p+1; break;
          } 
        }       
      }//Formula da probabilidade
      double q_N = 1 - (double) p/T; 
      System.out.println("q_"+j+" = " + q_N);
      j++;
      
    }
  }
}
  