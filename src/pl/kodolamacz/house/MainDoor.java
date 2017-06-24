package pl.kodolamacz.house;

/**
 * Created by qba on 24.06.17.
 */
public class MainDoor {

    private String welcomeText="Welcome to "Messy" House";
    public final int pin = "3333";

    bool isClosed;

    public void close(){
        isClosed=true;
    }

    void open(int pin){
        if (pin == pin) isClosed=false;
    }

    public void changeWelcomeText(String new Text){
        welcomeText= new Text;

    }

    public void changePin(int newPin){
        if (isValid(pin)) pin = newPin;
    }

    private boolean isValid(int pin) {
        //if has at least 4 digits
        return true;
    }

}

