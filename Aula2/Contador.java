public class Contador {
    int valor;

    public Contador(){
        this.valor = 0;
    }

    public int zerar(){
        valor = 0;
        return valor;
    }

    public int incrementar(){
        valor++;
        return valor;
    }
}
