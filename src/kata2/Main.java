/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

public class Main{

    public static void main(String[] args) {
        Histogram histogram = new Histogram(2,3,1,2,-4,8,3,5,5);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
