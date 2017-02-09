package multibaseenumerator;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Robert Manos
 */
public class BaseEnumerator {
/**
 *
 * This method takes the number passed to it and uses them as the base for the corresponding digit(if '2 3' is entered all numbers with a binary first digit and a ternary second digit will be returned.
 */
    public static LinkedList< ArrayList<Integer>> Enumerator(ArrayList<Integer> num_val_list) {
        boolean debug = false;
        LinkedList< ArrayList<Integer>> output_list = new LinkedList<>();
        //The if statement below is the basecase for the recursive calls.
        //If the input is a single number this returns a list of all values zero to n.
        if (num_val_list.size() == 1) {
            int e = num_val_list.remove(0);
            for (int i = 0; i < e; i++) {
                ArrayList<Integer> tempArray = new ArrayList<Integer>();
                tempArray.add(Integer.valueOf(i));
                output_list.add(tempArray);
            }
        }
        //For the recursive case the algorithm combines every returned Arraylist with the numbers zero to n
        //This inturn generates every possible number 
        else {
            LinkedList<ArrayList<Integer>> output_listTemp;
            int numval;
            numval = num_val_list.remove(num_val_list.size() - 1);
            output_listTemp = Enumerator(num_val_list);
            ArrayList<Integer> curr = new ArrayList<Integer>();
            while (!output_listTemp.isEmpty()) {
                curr = output_listTemp.removeFirst();
                for (int i = 0; i < numval; i++) {
                    ArrayList<Integer> curr1 = new ArrayList<Integer>();
                    curr1.addAll(curr);
                    curr1.add(Integer.valueOf(i));
                    output_list.add(curr1);
                }
            }
        }
        return output_list;

    }

}
