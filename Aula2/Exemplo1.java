import java.util.Scanner;
public class Exemplo1{
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        double[] consumos = new double[5];
        for(int i=0; i < consumos.length; i++){
            System.out.printf("Consumo %d: ", (i + 1));
            consumos[i] = entrada.nextDouble();
        }
        int cont = 0;
        for(double consumo : consumos){
            if(consumo > 5000){
                System.out.printf("Consumo anomalo: %.1f\n", consumo);
                cont += 1;
            }
        }
        System.out.printf("Quantidade de consumos anomalos: %.1d", cont);
        entrada.close();
    }
}