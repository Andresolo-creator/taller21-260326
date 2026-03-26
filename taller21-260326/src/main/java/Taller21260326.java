/*
NumeroFaltante
*/
import java.util.Scanner;
public class Taller21260326 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        ListaEnlazada Lista = new ListaEnlazada();
        
        for(int i = 0 ; i<= n-1 ; i++){
            int num = sc.nextInt();
            Lista.insertar(num);
        } 
        int sumaEsperada = n*(n+1)/2;
        int sumaLista = Lista.suma();
        
        int faltante = sumaEsperada - sumaLista;
        System.out.println("El numero faltante es: " + faltante);
    }
}
