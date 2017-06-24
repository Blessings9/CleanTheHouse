package pl.kodolamacz.house;

/**
 * Created by qba on 24.06.17.
 */
public class Room {


    private String name;

    private int length;
    private int height


    private boolean isOpenedWindow;

    public Room(string name,int length,int height){
        this.name=name;
        this.length=length;
        this.height=height;

    }


   public void openWindow(){
     isOpenedWindow=true;
   }

   public void closeWindow(){
        isOpenedWindow=false;
   }

   public String getName() {
        return name;
   }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
