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
        String [] data = {"Rosa","Pepe","María","Pepe","Pepe","Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer > histogr = histo.getHistogram();
        for (String key : data) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key)+ 1: 1);
            System.out.println (key + "==>" + histogr.get (key));
        }
        
    }
    
}
