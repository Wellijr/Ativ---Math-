import java.lang.Math;
import java.util.Random;


class Main {
  public static void main(String[] args) {
    long maximo = 0;
    long minimo = 0;
    
   for (int i=0;i<100 ; i++){
     long numero = Math.round(Math.random()*(80 - (0))+ (0));
     if(i == 0) {
       minimo = numero;
     }

     if( minimo > numero) {
       minimo = numero;
     }

     if(maximo < numero) {
       maximo = numero;
     }
   System.out.println(numero);
   }

    System.out.println("O maior numero eh: " + maximo + "\nO menor numero eh: " + minimo);
  }
}
