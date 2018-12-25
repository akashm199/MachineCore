/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinecore;

import akm.core.java.DateIntoEpoch;

/**
 *
 * @author akash
 */
public class MachineCore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DateIntoEpoch die = new DateIntoEpoch();
            System.out.println("Str into Date :" + die.getEpoch("12/25/2018"));
        } catch (Exception e) {
            System.err.println("Exception Main():: " + e);
        }
    }
    
}
