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
public class TokenFinder{
    //As informações serão gravadas numa fila
    Queue<String> fila = new Queue<String>();

    public TokenFinder(String line){
        String[] parts = new String[8];
        //Como temos regiões separadas por virgulas, para não dar um split no meio usamos este código
        parts  = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for(int i = 0; i<parts.length;i++){fila.enqueue(parts[i]);}
        //Adicionamos e tiramos da fila os dados armazenados para sairem separados

    }
    public String nextToken(){
        if(fila.size()==0) return null;
        else return fila.dequeue();}
        //Parte que retira e passa para o proximo item
    
}
