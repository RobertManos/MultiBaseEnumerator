package multibaseenumerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Robert Manos
 */
public class MultiBaseEnumerator {

    public static void main(String[] args) {
        ArrayList<Integer> input_arr = new ArrayList<Integer>();
        LinkedList< ArrayList<Integer>> ret;
        System.out.println("enter various numbers delimited by spaces or commas. "
                + "This program takes the numbered entered and uses them as the bases "
                + "for the corresponding digit(if '2 3' is entered all numbers with a binary first digit "
                + "and a ternary second digit will be returned.");
        try {
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\\D");
            String line = sc.nextLine();
            String elements[] = line.split("\\W+");
            // convert to int    
            for (int i = 0; i < elements.length; i++) {
                input_arr.add(Integer.parseInt(elements[i]));
            }

            sc.close();
            ret = BaseEnumerator.Enumerator(input_arr);

        } catch (NumberFormatException e) {
            //in the event of bad input 
            System.out.println("Bad input, For An input of: '7,6,5,4,3,2' ");
            input_arr.add(Integer.valueOf(7));
            input_arr.add(Integer.valueOf(6));
            input_arr.add(Integer.valueOf(5));
            input_arr.add(Integer.valueOf(4));
            input_arr.add(Integer.valueOf(3));
            input_arr.add(Integer.valueOf(2));
            ret = BaseEnumerator.Enumerator(input_arr);
        }

        //IOUtilsClass.printV_with_prefix(input_arr, "INPUT:");
        for (ArrayList<Integer> tmpV : ret) {
            System.out.print("OUTPUT: ");
            for (int i = 0; i < tmpV.size(); i++) {
                System.out.print(tmpV.get(i));
                if (i < tmpV.size() - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }

    }

}
