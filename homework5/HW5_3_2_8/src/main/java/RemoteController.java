/*"8*. Write a project named ""Remote Device"". Create a class ""RemoteController""
        which will be simulation the real one to control the TV. Create interfaces Device and Volume.
        The ""Device"" interface should have methods powerOn(), powerOff(), setChannel(int channel),
        and currentChannel();
        The ""Volume"" interface should have methods ""upVolume(), downVolume() and mute();
        Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
        has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
        if you class is abstract).
        Write a class ""TV"" which extends the class TVDevice. Implements all the methods.
        Write a class RemoteController to control your TV.
        Example of the structure in the requirements. */
public class RemoteController {

    public interface Device {
        public void powerOn();
        public void powerOff();
        public void setChannel(int channel);
        public void currentChannel();
    }

    public interface Volume {
        public void upVolume();
        public void downVolume();
        public void mute();
    }

public class TVDevice implements Device, Volume {
    public String modelName;
    public boolean isON;

    public void powerOn() { }
    public void powerOff() { }
    public void setChannel(int channel) { }
    public void currentChannel() { }
    public void upVolume() { }
    public void downVolume() { }
    public void mute() { }
}
    class TV extends TVDevice { }

    public static void main(String[] args) { }
}
