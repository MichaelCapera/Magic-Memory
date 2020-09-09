package Sistema;

import java.util.Random;

/**
 *
 * @author HP
 */
public class MagicMemo {
	
/**
 *     
 * @return
 */
public int[] getCardNumbers() {
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
    return numbers;
 }
}





        
        
        
     
        
     
    
    
