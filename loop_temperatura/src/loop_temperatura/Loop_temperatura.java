package loop_temperatura;
import java.util.Scanner;
public class Loop_temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double c, f, a;
        int i;
        System.out.print("Digite o valor em celcius: ");
        c = entrada.nextDouble();
        f = (c*1.8+32);
        System.out.print("Valor da converção é : "+f);
        i = 10;
        while (i<=100){
        a = f+i;
        System.out.println(a);
        i =i+10;       
        }
    }
    
}
