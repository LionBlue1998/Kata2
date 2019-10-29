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
        int [] data = new int []{2,3,1,2,-4,8,3,5,5,7,-9,4,1,3,5};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+ 1: 1);
            System.out.println (key + "==>" + histogram.get (key));
        }
        
    }
    
}
