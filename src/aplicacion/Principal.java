package aplicacion;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un número:");
        int n=sc.nextInt();
        System.out.println("La suma de los primeros  números pares hasta el  "+n+" es " + dominio.ej2_7_lambda.sumapares(n));
    }
}
