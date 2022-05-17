package aula_09;

public class Deck{ // é o repositório deste problema
    private int indice;
    private Carta [] deck;

    public Deck(){ //construtor
        deck = new Carta[40]; //40 é o numero maximo de posições do array
        indice = 0;
    }

    public void inserir(Carta c){ //metodo de inserção de cartas
        deck[indice] = c;
        indice++;
    }

    public void remover(Carta c){ //metodo de remoção de cartas, verificando se a carta coresponde
        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
            if(deck[i] == c){ // verifica se o deck da posição é igual a carta procurada
                deck[i] = deck[indice-1]; //atribui o valor do deck a posição especificada
                deck[indice-1] = null; //atribui o valor null a posição especificada
                indice--; //decrementa a posição
            }
        }
    }

    public void procurar(Carta c){ //metodo 1 de procura de cartas
        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
            if(deck[i] == c){ // verifica se o deck da posição é igual a carta procurada
                c.imprimir(); //se sim, imprime a carta em questão
            }
        }
    }

    public boolean procurar_2(Carta c){ //metodo 2 de procura de cartas através do booleano
        boolean temp = false; //inicia uma variável temporaria como falsa
        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
            if(deck[i] == c){ // verifica se o indice é igual a carta procurada
                temp = true; //confirma a informação mudando o valor da variável para true
            }
        }
        return temp; //retorna a variável com o resultado
    }

    public void imprimir(){ //metodo de impressão das cartas do deck
        for(int i = 0; i < indice; i++){ //loop que percorre o deck de cartas
            deck[i].imprimir(); //faz a impressão 
        }
    }
}

  