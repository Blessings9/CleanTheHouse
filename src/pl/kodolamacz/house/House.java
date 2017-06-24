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
        enlarge(r1.getLength(),r1.getWidth());
        shrink(r2);


    }



    public void doAiring(){

        for (int i =0; i<=rooms.length(); i++){
            rooms[i].openWindow();
        }

    }

    private void enlarge(int length, int width) {
        length=length*2;
        width=width*2;
    }

    private void shrink(Room r2) {
        r2 = new Room(r2.getName(),r2.getLength()/2,r2.getWidth()/2);
    }


}
