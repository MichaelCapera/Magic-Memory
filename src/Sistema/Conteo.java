package Sistema;

import java.util.Random;

/**aqui se determina la forma aleatoria
 * en que se distribuiran las cartas
 * de 1 a 16
 */
public class Conteo {

public static void main(String[] args) {
  int count = 0;
  int[] numbers = new int [16];  

  while(count < 16){
    Random r = new Random();
    int a = r .nextInt(8) + 1; 
    int b = 0;
        
  for (int i=0; i<16; i ++) {
    if(numbers[i] == a ){
     b++;
     }
  }
  if (b<2){
    numbers[count]=a;
    count ++;
  }        
 }
  for (int i = 0; i < 16; i++) {
   System.out.print(numbers[i]+ " ");           
    }     
 }
}
    

