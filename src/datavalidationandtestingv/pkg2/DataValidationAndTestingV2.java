/*
 *Karl Butler
 *10/02/2020
 *this program askes the user to anser some questions and it will only let them contiue if they get it right
 */

package datavalidationandtestingv.pkg2;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class DataValidationAndTestingV2 {

    /**
     * Karl butler
     */
    public static void main(String[] args) {
        someting();
    }

    
    public static void someting(){
        Scanner keyInput = new Scanner(System.in);
        int x;
        System.out.print("how many friends do you have ");
        x = keyInput.nextInt();
        
        String ages []= new String[x];
        
        System.out.println("pleas list "+ x + " names ");
        
        //ages[0] = keyInput.next();
        //ages[1] = keyInput.next();
        //ages[2] = keyInput.next();
        
         for (int i=0;i < x;i++ ){
          ages[i] = keyInput.next();
      }
        
        System.out.println("here are your names");
        
       for (int i=0; i<x; i++){
           System.out.println(ages[i]);
       }
        
    }
}
