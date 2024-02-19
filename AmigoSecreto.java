/******************************************************************************
 *
 * CCM118 - Computação I
 * Aluno: João Victor Oliveira Caetano
 * Numero USP: 10739674
 * Tarefa: AmigoSecreto
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
public class AmigoSecreto
{
  public static void main(String[] args)
  {
    //Variaveis utilizadas sendo o total o numeros de vezes que o ciclo foi embaralhado
    //is_conex o tanto de vezes que começou no 0 e terminou no 0 um ciclo
    //p é a probabilidade e p_oldé a probabilidade guardada na memória 
    int N = Integer.parseInt(args[0]);
    int[] a = new int[N];
    double total = 0;
    double is_conex = 0;
    double p;
    double p_old = 2;
    //Este while permuta todos os N elementos da sequencia 
    
    while (true) {
      
      for (int i = 0; i < N; i++){ a[i] = i; }
      
      for (int i = 0; i < N; i++)
      {
        int r = i + (int) (Math.random() * (N-i));
        int t = a[r];
        a[r] = a[i];
        a[i] = t;
      }
      
      int count = 0;
      int tag   = 0;
      //Comotodo amigo secreto precisa de pelo menos 1 pessoa, sendo assim, sorteando a sí mesmo, logo podemos definir que dentro desse N existe um elemento 0
      //Que seria jogar consigo, sendo assim podemos escolher o 0 como ponto de partida para todo N jogadores
      //Este while repete diversos ciclos de permutações somando 1 ponto a cada vez que o ciclo termina com quem começou o amigo secreto
      //Ele só para de operar quando os ciclos estabelecerem um padrão, Assim, colocando um N, definirimos qual a probabilidade de que
      //Naquele grupo de N amigos, o primeiro a dar o presente, é o ultimo a receber. Tendo um resultado muito exato por a margem de erro está
      //0.00000000000000001 (sendo que este numero está elevado ao quadrado) 
    
      while (true) 
      {
        if (a[tag] == 0) {break;}
        count++;
        tag = a[tag];
        //System.out.println(tag);
      }
      
      total+=1.0;
      if (count==N-1) {is_conex+=1.0;}
      
      p = is_conex / total;
    //System.out.println(p);
      
      if ((p - p_old) * (p - p_old) < 0.00000000000000001 && total>N*N) {break;}
      
      p_old = p;
      //System.out.println(is_conex);
    }
    
    System.out.println(p);
  }
}