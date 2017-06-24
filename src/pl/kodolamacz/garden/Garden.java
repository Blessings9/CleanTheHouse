package pl.kodolamacz.garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by qba on 24.06.17.
 */
public class Garden {
    public static final String red= "\u001B[41m";
    public static final String white= "\u001B[47m";


    House house;

    //we store colours
    List<String> endlessRowOfRoses = ArrayList<String>() ;


    String[][] orchard= new String[30][];

    Garden(){
        plantSomeRosesAtStart({"white","white","red","green","red"});
    }

    public void enterHouse(){
        house.getMainDoor().open(house.getMainDoor().pin);
    }

    private void plantSomeRosesAtStart(String[] roses){
        //init endlessRowOfRoses with one line
    }

    public void plantExtraRedForEachWhite(){
        for(String rose:endlessRowOfRoses){
            if (rose=="white){
                endlessRowOfRoses.add("red");

            }
        }
    }

    public int countWhiteAndReplaceWithRed() {
        long count=0;

        for (int i=0;i<=endlessRowOfRoses.size();i++) {
            if (endlessRowOfRoses.get(i)=="white")
                endlessRowOfRoses.set(i,"red");
                count++;

        }
        return count;

    }

    public void printRoses() {
        for (String rose:endlessRowOfRoses) {
            if("white".equals(rose)) System.out.print(white+rose);
            else System.out.print(red+rose);
        }

    }

    public void printOrchard() {
       //print
    }

}

