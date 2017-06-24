package pl.kodolamacz.house;

/**
 * Created by qba on 24.06.17.
 */
public class House {

    Room[] rooms =  new Room[];

    MainDoor mainDoor;


    public MainDoor getMainDoor(){
        return  mainDoor;
    }

    public void leave(){
        mainDoor.close();
    }

    public void createSampleRooms(){
        Room r1 = new Room("dining",10,10);
        Room r2 = new Room("bedroom1",10,10);
        rooms[1]=r1;
        rooms[2]=r2;



    }

    public void doAiring(){

        for (int i =0; i<=rooms.length(); i++){
            rooms[i].openWindow();
        }

    }


}
