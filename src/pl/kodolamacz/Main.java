
import java.util.ArrayList;
import java.awt.List;

import pl.kodolamacz.garden.Garden;
import pl.kodolamacz.house.House;
package pl.kodolamacz;


public class Main {
    List<House> estate = new ArrayList<House>();


    public  void main(String[] args) {

        House h = new House();
        Garden g = new Garden();

        h.createSampleRooms();
        System.out.println(h);
        h.doAiring();

        try {
            h.enter(4444);
        }catch (Exception e){}

        System.out.println(h.getNumperOfGuests());

        g.enterHouse();

        g.plantExtraRedForEachWhite();


        System.out.println("replacing" +g.countWhiteAndReplaceWithRed());
    }


}
