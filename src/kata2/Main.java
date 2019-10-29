/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main{
    
    public static void main(String[] args) {
        Integer [] data = {2,3,1,2,-4,8,3,5,5,7,-9,4,1,3,5};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer > histogr = histo.getHistogram();
        for (int key : data) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key)+ 1: 1);
            System.out.println (key + "==>" + histogr.get (key));
        }
        
    }
    
}
