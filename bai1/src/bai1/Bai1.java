/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// ax+b=0;
 */
package bai1;

import static java.lang.System.in;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author hoangtuan
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("hello wword");
        int a ;
        int b ;
        int x ;
        int c ;
       
        System.out.print("nhap vao gia tri cua a: ");
        Scanner keybroad = new Scanner(System.in);
        a = keybroad.nextInt();
        
        System.out.print("nhap vao gia tri cua b: ");
   
        b = keybroad.nextInt();
        System.out.print("nhap vao gia tri cua c: ");
        c = keybroad.nextInt();
        System.out.print(x=(c-b)/a);
        
     
        
        
        
        
       
                
        
    }
    
}