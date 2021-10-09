package JavaOdev;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bsahi
 */
public class JavaOdevCinZodyagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int birthYear,zodiacMonth;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your birth year to find chinese zodiac");
        
        birthYear = scanner.nextInt();
        
        zodiacMonth = birthYear % 12;
        
        switch(zodiacMonth){
            case 0: System.out.println("Your chinese zodiac is monkey");
                break;
            case 1 : System.out.println("Your chinese zodiac is cockerel");
                break;
            case 2 : System.out.println("Your chinese zodiac is dog");
                break;
            case 3 :System.out.println("Your chinese zodiac is pig");
                break;
            case 4 :System.out.println("Your chinese zodiac is mouse");
                break;    
            case 5 :System.out.println("Your chinese zodiac is ox");
                break;                   
            case 6 :System.out.println("Your chinese zodiac is tiger");
                break;                   
            case 7 :System.out.println("Your chinese zodiac is rabbit");
                break;        
            case 8 :System.out.println("Your chinese zodiac is dragon");
                break;    
            case 9 :System.out.println("Your chinese zodiac is snake");
                break;    
            case 10 :System.out.println("Your chinese zodiac is horse");
                break;
            case 11 :System.out.println("Your chinese zodiac is sheep");
                break;
            
                
            default:
                
                
                
                
        }
    }
    
}
