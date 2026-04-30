// Diego Ferreira Duarte
// RA: 1261933438
import java.util.Scanner;
public class App { 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int a = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int b = scanner.nextInt();
        int maior = descobrirMaior(a,b);
        System.out.println("O maior número é: " + maior);
        scanner.close();
       } public static int descobrirMaior(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
      
       
    }
}
