/* ***************************************************************************
 *
 * CCM128 - Computação II
 * Aluno: João Victor Caetano
 * Numero USP: 10739674
 * Tarefa: Exercicio 6
 * Data: 12/5/2019
 *
 * Baseado em programas recomendados na página do Paca relacionada ào exercício.
 * Principalmente em WordGraphPlain e WordLadders.
 * DECLARO QUE SOU O ÚNICO AUTOR E RESPONSÁVEL POR ESTE PROGRAMA.  TODAS AS
 * PARTES DO PROGRAMA, EXCETO AS QUE SÃO BASEADAS EM MATERIAL FORNECIDO
 * PELO PROFESSOR OU COPIADAS DO LIVRO OU DAS BIBLIOTECAS DE SEDGEWICK & WAYNE,
 * FORAM DESENVOLVIDAS POR MIM.  DECLARO TAMBÉM QUE SOU RESPONSÁVEL POR TODAS
 * AS CÓPIAS DESTE PROGRAMA E QUE NÃO DISTRIBUÍ NEM FACILITEI A DISTRIBUIÇÃO
 * DE CÓPIAS DESTA PROGRAMA.
 *
 *************************************************************************** */
import java.util.*;
public class GeoLocator{
	//Criação da ST para armazenamento dos IP
ST<Long, String[]> summary = new ST<Long, String[]>();
 
    public Location location(String q){
		//comparação do floor das listas com a chave dada q
		
		long w= IPConv.noip(q);
		long x=summary.floor(w);
		String[] i =summary.get(x);
		Double lati = Double.parseDouble(i[4]);
    	Double longi = Double.parseDouble(i[5]);
		


    	Location loc = new Location(i[0], i[1], i[2], i[3], lati, longi);

    	return loc;
        
    }
    public GeoLocator(String filename){
        In app=  new In(filename);
        //long tempoInicial = System.currentTimeMillis();
        //String nextLine = "";
		//Laço que lê todos os Ip da lista dada 
		while (app.hasNextLine()) {
    	String a = app.readLine();
    	TokenFinder tf= new TokenFinder(a);
    	String ipinicial = tf.nextToken();
		String ipfinal = tf.nextToken();
		//Transformar o ip em um numero long
    	long ipi =  IPConv.noip(ipinicial);
		String[] p =new String[6];
		//Armazenar os ip do meio que guardam a informação printada
    	   for (int i = 0; i <6 ; i++){
                p[i] = tf.nextToken();
    	   
            summary.put(ipi, p);
           }
		}
	}       
        
//long tempoFinal = System.currentTimeMillis();
//System.out.println( tempoFinal - tempoInicial +"while");

   
}