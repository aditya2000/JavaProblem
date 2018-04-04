/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countxx;
import java.util.Scanner;
/**
 *
 * @author khalsa
 */
public class CountXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter");
        String str = obj.nextLine();
        int count =0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx") || str.substring(i, i+2).equals("XX")){
                count++;
            }
           }
        System.out.println(count);
        }
    
                    }
