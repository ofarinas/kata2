/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package katavector;

import com.sun.java_cup.internal.runtime.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author usuario
 */
public class KataVector {

    public static void main(String[] args) {
        HashMap<Integer, Integer> listFrecuency_Nomber = new HashMap();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) Math.random() * 100);
        }
         int nomber = list.get(0);
        int repeat = 0;
        for (int i = 0; i < list.size(); i++) {
            if (nomber == list.get(i))
            listFrecuency_Nomber.put(nomber, repeat++);
            else{
                repeat=0;
                nomber=list.get(i);
                listFrecuency_Nomber.put(nomber, repeat++);
                }
            
        }
        nomber=0;
        repeat=-1111111;
        int  tem=0;
        Set set = listFrecuency_Nomber.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            if(iter.)
        }
        
    }
}
