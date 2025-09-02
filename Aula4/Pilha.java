package Aula4;

public class Pilha {
   //atributos
   private final static int TAM_DEFAULT = 100;
   private int topoPilha;
   private char elementos[]; 
   
   //construtores
   public Pilha(int tamanho){
      elementos = new char[tamanho];
      topoPilha = -1;
   }
   public Pilha(){
      this(TAM_DEFAULT);
   }
   //metodos
   
   public boolean isEmpty(){
      return topoPilha == -1;
   }

   public boolean isFull(){
      return topoPilha == elementos.length - 1;
   }

   public void push(char e) throws Exception{
      if (! this.isFull()){
        this.elementos[++this.topoPilha] = e;
      }
      else {
        throw new Exception("Overflow - Estouro de Pilha");
      }
   }

   public char pop() throws Exception{
      if (! this.isEmpty()){
        return this.elementos[this.topoPilha--];
      }
      else {
        throw new Exception("Underfow - Esvaziamento de Pilha");
      }
      
   }

   public char topo() throws Exception{
      if (! this.isEmpty()){
        return elementos[topoPilha];
      }
      else {
        throw new Exception("Underfow - Esvaziamento de Pilha");
      }
   }

   public int sizeElements(){
      return topoPilha + 1;
   }
}

