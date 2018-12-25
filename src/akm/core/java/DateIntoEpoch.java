/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akm.core.java;

import java.text.SimpleDateFormat;

/**
 *
 * @author akash
 */
public class DateIntoEpoch {

    public String getEpoch(String strDate) {
        System.out.println("This is a test machine >>");
        String data = "NA";
        try {
            Long millis = new SimpleDateFormat("MM/dd/yyyy").parse(strDate).getTime() / 1000;
            data = String.valueOf(millis);
        } catch (Exception e) {
            data = "NA";
            System.err.println("Exception :: " + e);
        }
        return data;
    }
}
