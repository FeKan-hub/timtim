package Aula4;
import java.util.Scanner;

public class BalanceamentoParenteses {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Expressão: ");
        String exp = s.nextLine();
        try{
            boolean balanceada = isBalanceada(exp);
            if(balanceada){
            System.out.println("Parênteses balanceados");
            }
            else{
            System.out.println("Parênteses não balanceados");
            }

        } catch(Exception e){
            System.out.println(e.getMessage());

        }
        s.close(); 

       
    }

    public static boolean isBalanceada(String exp) throws Exception{
        Pilha pilha = new Pilha();
        char c;
        for(int i=0; i < exp.length(); i++){
            c = exp.charAt(i);
            if(c == '('){
               pilha.push(c);
            }
            else if (c == ')'){
                if(pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
