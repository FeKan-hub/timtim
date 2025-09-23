public class Fila <T> {
    private static final int TAM_DEFAULT = 100;
    private int inicio, fim, qtde;
    private T e[];


    public Fila(int tamanho){
        inicio = 0;
        fim = 0;
        qtde = 0;
        e = (T[]) new Object [tamanho];
    }
    
    public Fila(){
        this(TAM_DEFAULT);
    }

    public boolean isEmpty(){
        return qtde == 0;
    }

    public boolean isFull(){
        return qtde == e.length;
    }

    public void enqueue (T elem){
        if (!isFull()){
            e[fim++] = elem;
            fim = fim % e.length;
            qtde++;
        }
        else{
            System.out.println("Overflow - Estouro de fila");
        }
    }

    public T dequeue(){
        T aux;
        if (!isEmpty()){
            aux = e[inicio];
            inicio = ++inicio % e.length;
            qtde--;
            return aux;
        }
        else{
            System.out.println("Overflow - Esvaziamento de fila");
            return null;
        }
    }

    public int totalElementos(){
        return qtde;
    }

    public int front(){
        if(!isFull()){
            return e[fim];
        })
    }

}