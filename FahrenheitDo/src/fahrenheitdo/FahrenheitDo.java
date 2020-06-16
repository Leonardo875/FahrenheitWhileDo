/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheitdo;
import java.util.Scanner;
public class FahrenheitDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int i = 10;
       double c ;
       
       do
       {
           c = i * 9 / 5 + 32;
           System.out.println(c);
           i = i + 10;
       }while(i<=101);
    }
    
}
