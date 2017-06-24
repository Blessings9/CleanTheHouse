package pl.kodolamacz.house;

/**
 * Created by qba on 24.06.17.
 */
public class Room {


    private string name;

    private int length;
    private int width


    private boolean isOpenedWindow;

    public Room(string name,int length,int width){
        this.name=name;
        this.length=length;
        this.width=width;

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

    public int getWidth() {
        return width;
    }
}
