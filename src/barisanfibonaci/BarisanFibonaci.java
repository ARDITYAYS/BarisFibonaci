/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barisanfibonaci;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 */
public class BarisanFibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fibonaci = 1;
        int N;
        int x = 0;
        int y = 0;

        System.out.println("Masukan Bannyaknya Suku : ");
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i <= N) {
            x = i ;
            x = y;
            y = fibonaci;
            fibonaci = x + y ;
            System.out.println("Baris Fibonaci "+fibonaci);
            }
            
        }

    }

}
