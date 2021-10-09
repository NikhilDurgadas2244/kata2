/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] data = {22, 11, 12, 34, 5, 6, 8, 10, 20, 30, 50, 100, 13, 14, 77};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        

        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
    
    
}
