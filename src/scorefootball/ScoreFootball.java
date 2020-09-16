/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;
import java.util.Scanner;

/**
 *
 * @author warin
 */
public class ScoreFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boundpropt score = new boundpropt();  
        register1 Regis1 = new register1();
        register2 Regis2 = new register2();
        score.addPropertyChangeListener(Regis1);
        score.addPropertyChangeListener(Regis2);
        Scanner sc = new Scanner(System.in);
       
        while (true) {
            System.out.print("Enter Score ==> ");
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            score.setInputValue(input);
        }
    }
    
}
